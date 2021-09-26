package com.springDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Cjl
 * @date 2021/7/7 19:18
 */
@Configuration
@ComponentScans({@ComponentScan("com.springDemo.config"),@ComponentScan("com.springDemo.dao"),@ComponentScan("com.springDemo.entity"),@ComponentScan("com.springDemo.service")})
@Import(SourceConfig.class)
public class SpringConfig000 {




}
