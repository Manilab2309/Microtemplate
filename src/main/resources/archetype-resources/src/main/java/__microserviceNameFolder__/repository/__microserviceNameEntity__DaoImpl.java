/**
 * Implementación de Acceso a BBDD NoSQL para los servicios de los ciudadanos
 */
package ${package}.${serviceNameFolder.replace('/','.')}.repository;

import ${package}.${microserviceNameFolder.replace('/','.')}.util.${microserviceName}Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}UserNotAuthorizedException;
import ${package}.${microserviceNameFolder.replace('/','.')}.repository.${microserviceNameEntity}Dao;


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
	public void create(String name) {

		logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl creating ${microservicesNameEntity}");

		// TODO DT Database interact

		logger.debug({microserviceName}Constants.MsgDebugOperations.DEBUG_PREFIX_MSG_DEBUG
		+ "Dao Impl success");
	}

}
