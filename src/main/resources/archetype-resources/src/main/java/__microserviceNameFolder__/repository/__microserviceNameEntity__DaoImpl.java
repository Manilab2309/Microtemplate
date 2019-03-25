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

import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}UserNotAuthorizedException;
import ${package}.${microserviceNameFolder.replace('/','.')}.repository.${microserviceNameEntity}Dao;
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

	@Override
	public void create(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl creating ${microserviceNameEntity}");

		// TODO DT Database interact

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");
	}

}
