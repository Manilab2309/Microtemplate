/**
 * NO DATA EXCEPTION
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ramón Cigüenza
 *
 */

@ResponseStatus(value=HttpStatus.NO_CONTENT, reason="Not Available Data")  // 204
public class ${microserviceName}NoDataException extends RuntimeException {

	/**
	 * Default Message Exception
	 */
	private static final String DEFAULT_MESSAGE_ERROR = "Not Found Data Content";

	public ${microserviceName}NoDataException() {
		super(DEFAULT_MESSAGE_ERROR);
    }

    public ${microserviceName}NoDataException(String message) {
        super(message);
        
    }

    public ${microserviceName}NoDataException(Throwable cause) {
        super(cause);
        
    }

    public ${microserviceName}NoDataException(String message, Throwable cause) {
        super(message, cause);
        
    }
}
