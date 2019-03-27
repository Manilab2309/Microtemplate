/**
 * ${microserviceName} CRUD SERVICE
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.service;

import java.io.Serializable;
import java.util.List;

import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};

/**
 * @author Ramón Cigüenza
 *
 */
public interface ${microserviceNameEntity}Service extends Serializable {

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
