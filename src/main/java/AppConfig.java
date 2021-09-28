import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
     //To start boot strapping app
    //this is the start of app config context
    /*
    //bean is only applicable at a method level - CANNOT use bean at a class level
    @Bean(name= "speakerService") //enables spring - it is a spring component
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){

        //call the getSpeakerRepository bean and inject that through constructor injection
        //into the SpeakerServiceImpl
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());


        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //service.setRepository(getSpeakerRepository()); //see for reference for setter injectino
        return service;

        //speakerrepo is now created as a bean, the bean is a singleton. only one will be created.
        //we can call this getSpeakerService method many times and only one speakerRepo will be created
    } */

    /*
    @Bean(name = "speakerRepository")
    //setter injection
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
    */

}