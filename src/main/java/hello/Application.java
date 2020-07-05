package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skolapar
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(Valt.class)
public class Application implements CommandLineRunner {

  private final Valt configuration;

  public Application(Valt configuration) {
    this.configuration = configuration;
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) {

    Logger logger = LoggerFactory.getLogger(Application.class);


    logger.info("Configuration properties");
    logger.info("   example.username is {}", configuration.getUsername());
    logger.info("   example.password is {}", configuration.getPassword());
    logger.info("-------------MANULIFE---------------------------");
  }
}