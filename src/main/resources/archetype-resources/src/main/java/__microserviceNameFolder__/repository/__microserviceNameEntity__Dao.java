/**
 * MICROSERVICE DAO INTERFACE
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.repository;

import java.io.Serializable;
import java.util.List;

import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};
import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}UserNotAuthorizedException;

/**
 * @author Ramón Cigüenza
 *
 */
public interface ${microserviceNameEntity}Dao extends Serializable {

	/** Create new ${microserviceNameEntity} */
	void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()});

	/** Queries ${microserviceNameEntity}s */
	List<${microserviceNameEntity}> get${microserviceNameEntity}s();

	/** Queries ${microserviceNameEntity}s By ID */
	${microserviceNameEntity} get${microserviceNameEntity}ById(String id${microserviceNameEntity});

	/** Delete ${microserviceNameEntity} */
	void delete${microserviceNameEntity}ById(String id${microserviceNameEntity});

	/** Update ${microserviceNameEntity}*/
	void update${microserviceNameEntity}(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()});

}
