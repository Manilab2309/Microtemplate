/**
 * Ciudadano
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.entity;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Ramón Cigüenza
 *
 */

@Document(collection = "${microserviceNameEntity}.toLowerCase()")
public class ${microserviceNameEntity} implements Serializable {

	@Field("id")
	private String id${microserviceNameEntity};
	
	@Field("name")
	private String name;

}
