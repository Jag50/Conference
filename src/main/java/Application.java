import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

public class Application {

    public static void main(String args[]){

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.finall().get(0).getFirstName());
    }
}