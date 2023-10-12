package dev.jeffnts.diospringpadroesprojeto.repository;

import org.springframework.data.repository.CrudRepository;

import dev.jeffnts.diospringpadroesprojeto.model.EnderecoModel;


public interface EnderecoRepository extends CrudRepository<EnderecoModel, String> {
    
}
