package com.devgol.literalura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgol.literalura.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Integer> {
    List<Livro> findByidiomaContainingIgnoreCase(String idioma);
    Optional<Livro> findBytituloEqualsIgnoreCase(String titulo);
}
