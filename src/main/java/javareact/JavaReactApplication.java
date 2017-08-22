package .javareact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaReactApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 2017 );
		SpringApplication.run(JavaReactApplication.class, args);
	}
}
