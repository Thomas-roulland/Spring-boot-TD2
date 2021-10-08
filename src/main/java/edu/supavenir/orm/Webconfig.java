package edu.supavenir.orm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("io.github.jeemv.springboot.vuejs")
public class Webconfig implements WebMvcConfigurer {

}
