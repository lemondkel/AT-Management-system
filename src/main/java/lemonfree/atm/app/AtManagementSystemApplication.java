package lemonfree.atm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AtManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtManagementSystemApplication.class, args);
	}

}
