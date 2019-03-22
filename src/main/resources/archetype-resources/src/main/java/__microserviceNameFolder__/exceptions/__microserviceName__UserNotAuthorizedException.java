/**
 * 
 */
package ${package}.${serviceNameFolder.replace('/','.')}.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ramón Cigüenza
 *
 */

@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="User Not Authorized")  // 404
public class ${microserviceName}UserNotAuthorizedException extends RuntimeException{
	
	/**
	 * Default Message Exception
	 */
	private static final String DEFAULT_MESSAGE_ERROR = "User Not Authorized";

	public ${microserviceName}UserNotAuthorizedException() {
		super(DEFAULT_MESSAGE_ERROR);
    }

    public ${microserviceName}UserNotAuthorizedException(String message) {
        super(message);
        
    }

    public ${microserviceName}UserNotAuthorizedException(Throwable cause) {
        super(cause);
        
    }

    public ${microserviceName}UserNotAuthorizedException(String message, Throwable cause) {
        super(message, cause);
        
    }
	
	
}
