package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/bancoListaCursos")
	public List<String> message()
	{
		List<String> bancoListaCursos = new ArrayList<String>();
		bancoListaCursos.add("Padrões de HTML, CSS");
		bancoListaCursos.add("Javascript");
		bancoListaCursos.add("Computação em Nuvem");
		bancoListaCursos.add("Design de Experiência de Usuário");
		bancoListaCursos.add("Desenvolvimento Frontend - React");
		return bancoListaCursos;

	}

	@GetMapping("/bancoListaCursosId/{id}")
	public String message(@PathVariable Integer id)
	{
		List<String> bancoListaCursos = new ArrayList<String>();
		bancoListaCursos.add("Padrões de HTML, CSS");
		bancoListaCursos.add("Javascript");
		bancoListaCursos.add("Computação em Nuvem");
		bancoListaCursos.add("Design de Experiência de Usuário");
		bancoListaCursos.add("Desenvolvimento Frontend - React");
		if(id <= 4){
			return bancoListaCursos.get(id);
		}
		return null;

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
