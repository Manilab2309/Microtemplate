/**
 * CRUD SERVICE
 */
package ${package}.${serviceNameFolder.replace('/','.')}.service;

import java.io.Serializable;
import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};

/**
 * @author Ramón Cigüenza
 *
 */
public interface ${microserviceNameEntity}Service extends Serializable {

	// Create new ${microserviceNameEntity}
	public void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()});

}
