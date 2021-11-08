package br.cm.dh.online.NossoProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NossoProjetoApplication {

	@RequestMapping("/")
	String home(){
		return "Nosso primeiro Spring!";
	}

	public static void main(String[] args) {
		SpringApplication.run(NossoProjetoApplication.class, args);
	}

}
