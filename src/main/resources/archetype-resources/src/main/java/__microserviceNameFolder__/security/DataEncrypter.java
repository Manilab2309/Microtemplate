/**
 * DATA CYPHER SERVICE
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.security;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import ${package}.${microserviceNameFolder.replace('/','.')}.config.${microserviceName}SecurityConfiguration;
import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}SecurityException;
import ${package}.${microserviceNameFolder.replace('/','.')}.util.${microserviceName}Constants;

/**
 * @author Ramón Cigüenza Fuster
 *
 */

public class DataEncrypter {

	@Autowired
	${microserviceName}SecurityConfiguration ${microserviceName.toLowerCase()}SecurityConfiguration;

	public DataEncrypter(${microserviceName}SecurityConfiguration ${microserviceName.toLowerCase()}SecurityConfiguration) {
		this.${microserviceName.toLowerCase()}SecurityConfiguration = ${microserviceName.toLowerCase()}SecurityConfiguration;
	}

	public String encrypt(String value) throws ${microserviceName}SecurityException {

		try {

			${microserviceName}SecurityConfiguration config = new ${microserviceName}SecurityConfiguration();
			System.out.println(config.getKey());

			IvParameterSpec iv = new IvParameterSpec(${microserviceName.toLowerCase()}SecurityConfiguration.getInitVector().getBytes("UTF-8"));

			SecretKeySpec skeySpec = new SecretKeySpec(${microserviceName.toLowerCase()}SecurityConfiguration.getKey().getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());
			System.out.println("encrypted string: " + Base64.encodeBase64String(encrypted));

			return Base64.encodeBase64String(encrypted);

		} catch (UnsupportedEncodingException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
				| InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
			throw new ${microserviceName}SecurityException(${microserviceName}Constants.MsgExceptions.MSG_ERROR_ENCRYPT_MODULE, e);
		}

	}

	public String decrypt(String encrypted) throws ${microserviceName}SecurityException {
		try {

			IvParameterSpec iv = new IvParameterSpec(${microserviceName.toLowerCase()}SecurityConfiguration.getInitVector().getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(${microserviceName.toLowerCase()}SecurityConfiguration.getKey().getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

			byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

			return new String(original);
		} catch (UnsupportedEncodingException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
				| InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
			throw new ${microserviceName}SecurityException(${microserviceName}Constants.MsgExceptions.MSG_ERROR_ENCRYPT_MODULE, e);
		}

	}
	
	public String extractSalt(String brutePass) {
		
		brutePass = brutePass.substring(${microserviceName.toLowerCase()}SecurityConfiguration.getSaltpre().length(), brutePass.length() - ${microserviceName.toLowerCase()}SecurityConfiguration.getSaltpost().length());
		
		return brutePass;
	}

}
