package br.com.treinaweb.springbootapi.repository;

import br.com.treinaweb.springbootapi.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
