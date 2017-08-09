package br.com.fiap.notepad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.fiap.notepad.model.Nota;

public interface NotaRepository extends MongoRepository<Nota, String>{

}
