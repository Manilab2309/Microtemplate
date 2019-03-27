/**
 * ${microserviceNameEntity.toUpperCase()}
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

	public ${microserviceNameEntity}(String id${microserviceNameEntity}, String name) {
			this.id${microserviceNameEntity} = id${microserviceNameEntity};
			this.name = name;
			}

	public String getId${microserviceNameEntity}() {
			return id${microserviceNameEntity};
			}

	public void setId${microserviceNameEntity}(String id${microserviceNameEntity}) {
			this.id${microserviceNameEntity} = id${microserviceNameEntity};
			}

	public String getName() {
			return name;
			}

	public void setName(String name) {
			this.name = name;
			}
}
