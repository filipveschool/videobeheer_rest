package configuration;

import domain.facade.VideoBeheer;
import domain.factory.DatabaseType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by filip on 28/04/2016.
 */
@Configuration
@ComponentScan("configuration")
@EnableWebMvc
public class ApplicationConfig {

    @Bean
    public VideoBeheer service(){
        return new VideoBeheer(DatabaseType.RELATIONAL);
    }

}
