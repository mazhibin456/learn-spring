
/*
 * @author: marvin
 * @software: IntelliJ IDEA
 * @file: SpringConfiguration.java
 * @time: 2020-05-26 22:16
 */

package com.marvin.config;

import org.springframework.context.annotation.*;
import org.springframework.test.annotation.Timed;

@Configuration
@ComponentScan("com.marvin")
@PropertySource("classpath:jdbcConfig.properties")
@Import(JdbcConfig.class)
public class SpringConfiguration {
}