package com.deloitte.sample.application.controller;

import com.deloitte.sample.application.Application;
import com.deloitte.sample.application.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by akothiyal on 02/03/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceControllerIntegrationTest {


    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getProtoBufSampleDetailsTest() {

        Employee body = this.restTemplate.getForObject("/protobuf", Employee.class);

        assertThat(body.getName().equalsIgnoreCase("Anuj"));

        System.out.println("Employee retrieved: " + body.toString());

    }

}
