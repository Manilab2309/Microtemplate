/**
 * MICROSERVICE DAO IMPLEMENTATION
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

import ${package}.${microserviceNameFolder.replace('/','.')}.util.${microserviceName}Constants;
import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};

/**
 * @author Ramón Cigüenza
 *
 */

@Repository
@Qualifier("${microserviceNameEntity.toLowerCase()}Dao")
public class ${microserviceNameEntity}DaoImpl implements ${microserviceNameEntity}Dao {

	/** Logger */
	private static final Logger logger = LoggerFactory.getLogger(${package}.${microserviceNameFolder.replace('/','.')}.repository.${microserviceNameEntity}DaoImpl.class);
	
	@Autowired
	MongoTemplate mongoTemplate;

	public void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl creating ${microserviceNameEntity}");

		// TODO DT Database interact

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");
	}

	public List<${microserviceNameEntity}> get${microserviceNameEntity}s() {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Query All ${microserviceNameEntity}s");

		//TODO: Query List DAO implementation
		${microserviceNameEntity} item1 = new ${microserviceNameEntity}("MCR457", "Entity1");
		${microserviceNameEntity} item2 = new ${microserviceNameEntity}("MCR124", "Entity2");
		${microserviceNameEntity} item3 = new ${microserviceNameEntity}("MCR876", "Entity3");

		List<${microserviceNameEntity}> result = new ArrayList<${microserviceNameEntity}>();
		result.add(item1);
		result.add(item2);
		result.add(item3);

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");

		return result;

	}

	public ${microserviceNameEntity} get${microserviceNameEntity}ById(String id${microserviceNameEntity}) {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Query For ${microserviceNameEntity}: "+id${microserviceNameEntity});

		//TODO: Search DAO implementation
		${microserviceNameEntity} item = new ${microserviceNameEntity}("MCR457", "EntityFounded");

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");

		return item;

	}


	public void delete${microserviceNameEntity}ById(String id${microserviceNameEntity}) {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Delete Operation For ${microserviceNameEntity}: "+id${microserviceNameEntity});

		//TODO: Delete DAO implementation

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");
	}

	public void update${microserviceNameEntity}(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao ${microserviceNameEntity} Updated: "+${microserviceNameEntity.toLowerCase()}.getId${microserviceNameEntity}());

		//TODO: Update DAO implementation

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");
		}

}
