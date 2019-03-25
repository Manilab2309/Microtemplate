/**
 * CUSTOM AUTHENTICATION API MICROSERVICE
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import ${package}.${microserviceNameFolder.replace('/','.')}.config.${microserviceName}SecurityConfiguration;
import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}SecurityException;
import ${package}.${microserviceNameFolder.replace('/','.')}.util.${microserviceName}Constants;

/**
 * @author Ramón Cigüenza Fuster
 *
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	/** Logger */
	private static final Logger logger = LoggerFactory.getLogger(${package}.${microserviceNameFolder.replace('/','.')}.security.CustomAuthenticationProvider.class);

	@Autowired
	${microserviceName}SecurityConfiguration ${microserviceName.toLowerCase()}SecurityConfiguration;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		try {
			logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
					+ "Checking credentials for Springboot Security...");

			/** Web User Credentials to Login */
			String name = authentication.getName();
			String pass = authentication.getCredentials().toString();

			/** Valid Credentials for Springboot Security */
			String userAPIAllowed = ${microserviceName.toLowerCase()}SecurityConfiguration.getUserAPIAllowed();
			String passAPIAllowed = ${microserviceName.toLowerCase()}SecurityConfiguration.getPassAPIAllowed();

			${package}.${microserviceNameFolder.replace('/','.')}.security.DataEncrypter dataCipher = new ${package}.${microserviceNameFolder.replace('/','.')}.security.DataEncrypter(${microserviceName.toLowerCase()}SecurityConfiguration);
			String passClientDecrypted = dataCipher.extractSalt(dataCipher.decrypt(pass));
			String passAPIServerDecrypted = dataCipher.extractSalt(dataCipher.decrypt(passAPIAllowed));

			if (name.equalsIgnoreCase(userAPIAllowed) && passClientDecrypted.equalsIgnoreCase(passAPIServerDecrypted)) {
				logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
						+ "Login successfully, retrieving API services...");

				Authentication authResult = new UsernamePasswordAuthenticationToken(name, pass, new ArrayList<>());
				SecurityContextHolder.getContext().setAuthentication(authResult);
				return authResult;
			} else {
				throw new BadCredentialsException(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
						+ ${microserviceName}Constants.MsgExceptions.MSG_ERROR_BAD_CREDENTIALS);
			}
		} catch (${microserviceName}SecurityException e) {
			logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
					+ "Error in encrypting module");			
				throw new ${microserviceName}SecurityException(${microserviceName}Constants.MsgExceptions.MSG_ERROR_ENCRYPT_MODULE, e);
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}
