/**
 * Implementación de Servicios para mantenimiento de ciudadanos
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

	public void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {
		${microserviceNameEntity.toLowerCase()}Dao.create(${microserviceNameEntity.toLowerCase()});
	}

}
