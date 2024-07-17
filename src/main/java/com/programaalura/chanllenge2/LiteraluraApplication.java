package com.programaalura.chanllenge2;

import com.programaalura.chanllenge2.principal.Principal;
import com.programaalura.chanllenge2.repository.AutorRepos;
import com.programaalura.chanllenge2.repository.LibroRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private LibroRepo repositoryLibro;
	@Autowired
	private AutorRepos repositoryAutor;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositoryLibro, repositoryAutor);
		principal.Menu();

	}
}