package nvc.it.ice_factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryApplication.class, args);
	}

}
