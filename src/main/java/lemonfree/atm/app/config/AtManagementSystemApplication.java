package lemonfree.atm.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"lemonfree.atm.app.entity"})
@ComponentScan("lemonfree.atm.app")
@SpringBootApplication
public class AtManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtManagementSystemApplication.class, args);
	}

}
