package eu.horyzont.gradebook;

import eu.horyzont.gradebook.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class GradeBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradeBookApplication.class, args);
	}


}
