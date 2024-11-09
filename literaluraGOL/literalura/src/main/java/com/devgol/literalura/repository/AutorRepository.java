package com.devgol.literalura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgol.literalura.model.Autor;


public interface AutorRepository extends JpaRepository<Autor,Integer> {
    List<Autor> findByanofalecimentoLessThan(Integer anofalecimento);
}
