package com.devgol.literalura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devgol.literalura.repository.AutorRepository;
import com.devgol.literalura.repository.LivroRepository;
import com.devgol.literalura.view.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private LivroRepository repository;

	@Autowired
	private AutorRepository repositoryautor;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserInterface screenMenu = new UserInterface(repository,repositoryautor);
		screenMenu.printMenu();
	}

}