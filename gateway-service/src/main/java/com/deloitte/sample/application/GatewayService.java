package com.deloitte.sample.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import javax.swing.*;

/**
 * Created by akothiyal on 27/01/2017.
 */

@EnableZuulProxy
@SpringBootApplication
public class GatewayService {
    public static void main(String[] args){SpringApplication.run(GatewayService.class, args);}
}
