package exam01.config;

import exam01.Greet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {


    @Bean
    public Greet greet(){
        return new Greet();
    }

}
