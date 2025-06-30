package omnicomms;

import com.openkoda.App;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.openkoda", "omnicomms"})
@ComponentScan({"com.openkoda", "omnicomms"})
@EnableJpaRepositories({"com.openkoda", "omnicomms.repository"})
@EntityScan({"com.openkoda", "omnicomms.model"})
public class OmniCommsApp extends App {
    public static void main(String[] args) {
        startApp(OmniCommsApp.class, args);
    }
}
