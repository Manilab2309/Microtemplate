/**
 * ${microserviceNameEntity.toUpperCase()} SERVICE IMPLEMENTATION
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};
import ${package}.${microserviceNameFolder.replace('/','.')}.repository.${microserviceNameEntity}Dao;

/**
 * @author Ramón Cigüenza
 *
 */

@Service(value = "${microserviceNameEntity}Service")
public class ${microserviceNameEntity}ServiceImpl implements ${microserviceNameEntity}Service {

	@Autowired
	private ${microserviceNameEntity}Dao ${microserviceNameEntity.toLowerCase()}Dao;

	/** Create new ${microserviceNameEntity} */
	public void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {
		${microserviceNameEntity.toLowerCase()}Dao.create(${microserviceNameEntity.toLowerCase()});
	}
	
	/** Queries ${microserviceNameEntity}s */
	public List<${microserviceNameEntity}> get${microserviceNameEntity}s() {
		return ${microserviceNameEntity.toLowerCase()}Dao.get${microserviceNameEntity}s();
	}
	
	/** Queries ${microserviceNameEntity} By ID */
	public ${microserviceNameEntity} get${microserviceNameEntity}ById(String id${microserviceNameEntity}) {
		return ${microserviceNameEntity.toLowerCase()}Dao.get${microserviceNameEntity}ById(id${microserviceNameEntity});
	}
	
	/** Delete ${microserviceNameEntity} */
	public void delete${microserviceNameEntity}ById(String id${microserviceNameEntity}) {
		${microserviceNameEntity.toLowerCase()}Dao.delete${microserviceNameEntity}ById(id${microserviceNameEntity});
	}
	
	/** Update ${microserviceNameEntity}*/
	public void update${microserviceNameEntity}(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {
		${microserviceNameEntity.toLowerCase()}Dao.update${microserviceNameEntity}(${microserviceNameEntity.toLowerCase()});
	}

}
