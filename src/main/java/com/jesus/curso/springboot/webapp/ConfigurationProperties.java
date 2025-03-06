package com.jesus.curso.springboot.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:Values.properties",encoding = "UTF-8")
public class ConfigurationProperties {

}
