package ${package}.${microserviceNameFolder.replace('/','.')}.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import ${package}.${microserviceNameFolder.replace('/','.')}.config.${microserviceName}SwaggerConfiguration;


/**
 * @author Ramón Cigüenza
 *
 */

@ComponentScan("${package}.${microserviceNameFolder}.*")

@EntityScan(basePackages = "${package}.${microserviceNameFolder}.entity")

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@Import(${microserviceName}SwaggerConfiguration.class)

public class ${microserviceName}Application {

	private static final Logger logger = LoggerFactory.getLogger(${microserviceName}Application.class);
	
	public static void main(String[] args) {

		new SpringApplicationBuilder(${microserviceName}Application.class)
		.properties("spring.config.name:${microserviceName}-application")
		.build()
		.run(args);

		logger.debug("-- Application API ${microserviceName} Started --");
	}
}
