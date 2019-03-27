/**
 * REST MICROSERVICE CONTROLLER FOR /${microserviceName.toUpperCase()}
 */
package ${package}.${microserviceNameFolder.replace('/','.')}.controller;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.${microserviceName}UserNotAuthorizedException;
import ${package}.${microserviceNameFolder.replace('/','.')}.util.${microserviceName}Constants;
import ${package}.${microserviceNameFolder.replace('/','.')}.service.${microserviceNameEntity}Service;
import ${package}.${microserviceNameFolder.replace('/','.')}.entity.${microserviceNameEntity};
import ${package}.${microserviceNameFolder.replace('/','.')}.exceptions.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Ramón Cigüenza
 *
 */

@Controller
@RestController
@RequestMapping("/${apiVersion}/${microserviceNameFolder}")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge=6000)
@Api(value="${microserviceNameEntity}ControllerAPI",consumes=MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
public class ${microserviceNameEntity}Controller {
	
	/** Logger */
	private static final Logger logger = LoggerFactory.getLogger(${microserviceNameEntity}Controller.class);
		
	@Autowired
	private ${microserviceNameEntity}Service ${microserviceNameEntity.substring(0,1).toLowerCase()}${microserviceNameEntity.substring(1)}Service;
	
	@RequestMapping (value="/create", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON)
	@ApiOperation("Create a new ${microserviceNameEntity}")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 404, message = "KO"),
			@ApiResponse(code = 401, message = "KO - Not Authorized"),
			@ApiResponse(code = 606, message = "Invalid Input")
	})
	public @ResponseBody void create (@RequestBody ${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()})
					throws ${microserviceName}UserNotAuthorizedException {
				
		try {
			
			// User authentication
			logger.info("${microserviceNameEntity}ControllerAPI creating ${microserviceNameEntity} entity ");
			${microserviceNameEntity.toLowerCase()}Service.create(${microserviceNameEntity.toLowerCase()});
			logger.info("${microserviceNameEntity}ControllerAPI created");
					
		}catch (${microserviceName}UserNotAuthorizedException e){
			logger.debug(${microserviceName}Constants.MsgDebugOperations.DEBUG_MSG_ERROR_USER_NOT_AUTHORIZED);
			throw new ${microserviceName}UserNotAuthorizedException("Invalid Credentials: "+e.getMessage());
		}
	}

	/** Read Query API Service */
	@RequestMapping (value="/get${microserviceNameEntity}s",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	@ApiOperation("Query records")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="OK",response=${microserviceNameEntity}.class),
			@ApiResponse(code=204, message="OK - Item not found")
	})
	public @ResponseBody
		List<${microserviceNameEntity}> get${microserviceNameEntity}s(){
			return ${microserviceNameEntity.toLowerCase()}Service.get${microserviceNameEntity}s();
			}

	@RequestMapping (value="/get${microserviceNameEntity}ById/{id${microserviceNameEntity}}",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	@ApiOperation("Gets id item object")
	@ApiResponses(value = {
			@ApiResponse(code=200, message="OK",response=${microserviceNameEntity}.class),
			@ApiResponse(code=204, message="OK - ID not found")
	})
	public @ResponseBody ${microserviceNameEntity} get${microserviceNameEntity}ById(@PathVariable String id${microserviceNameEntity}){
			return ${microserviceNameEntity.toLowerCase()}Service.get${microserviceNameEntity}ById(id${microserviceNameEntity});
			}

	@RequestMapping(value="/delete${microserviceNameEntity}ById/{id${microserviceNameEntity}}",method=RequestMethod.DELETE)
	@ApiOperation("Delete item by ID")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK - Item Deleted"),
			@ApiResponse(code = 600, message = "Incorrect ID"),
			@ApiResponse(code = 204, message = "OK - ID item not found"),
			@ApiResponse(code = 606, message = "Invalid Input")
	})
	public @ResponseBody void delete${microserviceNameEntity}ById(@PathVariable String id${microserviceNameEntity}){
			${microserviceNameEntity.toLowerCase()}Service.delete${microserviceNameEntity}ById(id${microserviceNameEntity});
			}

	@RequestMapping(value="/update${microserviceNameEntity}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Update element", notes= "Update database record item")
	@ApiResponses(value = {
			@ApiResponse(code = 600, message = "KO - Incorrect ID"),
			@ApiResponse(code = 601, message = "KO - ID not found"),
			@ApiResponse(code = 606, message = "KO - Invalid Input")
	})
	public @ResponseBody void update${microserviceNameEntity}(${microserviceNameEntity} ${microserviceNameEntity.toLowerCase()}) {
			${microserviceNameEntity.toLowerCase()}Service.update${microserviceNameEntity}(${microserviceNameEntity.toLowerCase()});
			}

	
}
