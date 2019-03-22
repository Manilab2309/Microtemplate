package ${package}.${microserviceNameFolder.replace('/','.')}.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author Ramón Cigüenza
 *
 */

@ComponentScan("${package}.${microserviceNameFolder}.*")

@EntityScan(basePackages = "${package}.${microserviceNameFolder}.entity")

@SpringBootApplication
@EnableSwagger2
@Import(${microserviceName}SwaggerConfiguration.class)

public class ${microserviceName}Application {

	private static final Logger logger = LoggerFactory.getLogger(${microserviceName}Application.class);
	
	public static void main(String[] args) {

		// La ejecución comienza aquí
		SpringApplication.run(${microserviceName}Application.class, args);

		logger.debug("-- Application API ${microserviceName} Started --");
	}
}
