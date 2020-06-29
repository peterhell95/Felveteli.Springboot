package feladat.szemely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SzemelyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzemelyApplication.class, args);
	}

}
