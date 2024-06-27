package demo.aqe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AqeApplication {
	@GetMapping("/h")
	public String say() {
		return "home";
	}

	public static void main(String[] args) {
		SpringApplication.run(AqeApplication.class, args);
	}

}
