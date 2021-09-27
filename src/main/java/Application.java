import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){


        //This is loading spring, it's loading configuration files from AppConfig
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


        //SpeakerService service = new SpeakerServiceImpl();

        //now nothing is hardcoded, it's running through the config instances
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.finall().get(0).getFirstName());
    }
}

//Setter injection is as simple as a method call
//Setter injection is simply calling a setter injection on a bean
//call and get an instance of the bean from the spring config file
//spring is doing magic, beans are singleton by default and will only execute method first time it's called
//if this wasn't set-up this way, it would call a bean every time this was called


