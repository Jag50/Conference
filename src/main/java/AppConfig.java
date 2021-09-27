import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     //To start boot strapping app
    //this is the start of app config context

    @Bean(name= "speakerService") //enables spring - it is a spring component
    public SpeakerService getSpeakerService(){

        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository()); //see for reference for setter injectino
        return service;

        //speakerrepo is now created as a bean, the bean is a singleton. only one will be created.
        //we can call this getSpeakerService method many times and only one speakerRepo will be created
    }

    @Bean(name = "speakerRepository")
    //setter injection
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}