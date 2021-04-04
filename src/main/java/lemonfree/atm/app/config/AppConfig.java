package lemonfree.atm.app.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 웹 어플리케이션 설정용 파일
 *
 * @author l2jong
 * @since 2021-02-28
 */
@Configuration
@EnableJpaRepositories(value = "lemonfree.atm.app.repo")
@EntityScan(basePackages = {"lemonfree.atm.app.entity"})
public class AppConfig {
//
}
