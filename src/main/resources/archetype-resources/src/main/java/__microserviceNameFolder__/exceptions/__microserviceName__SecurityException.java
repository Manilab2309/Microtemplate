/**
 * SECURITY EXCEPTION
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ramón Cigüenza
 *
 */

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Internal Security Error")  // 500
public class ${microserviceName}SecurityException extends RuntimeException{

	/**
	 * Default Message Exception
	 */
	private static final String DEFAULT_MESSAGE_ERROR = "Encrypt Module Error";

	public ${microserviceName}SecurityException() {
		super(DEFAULT_MESSAGE_ERROR);
    }

    public ${microserviceName}SecurityException(String message) {
        super(message);
        
    }

    public ${microserviceName}SecurityException(Throwable cause) {
        super(cause);
        
    }

    public ${microserviceName}SecurityException(String message, Throwable cause) {
        super(message, cause);
        
    }
	
}
