package com.elecc.tests.application;

import ${package}.${microserviceNameFolder.replace('/','.')}.application.${microserviceName}Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={${microserviceName}Application.class})
public class ${microserviceName}ApplicationTests {

	@Test
	public void contextLoads() {


	}

}
