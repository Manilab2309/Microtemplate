/**
 * MICROSERVICE DAO INTERFACE
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.repository;

import java.io.Serializable;
import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};
import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}UserNotAuthorizedException;

/**
 * @author Ramón Cigüenza
 *
 */
public interface ${microserviceNameEntity}Dao extends Serializable {

	// Create
	public void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()});

}
