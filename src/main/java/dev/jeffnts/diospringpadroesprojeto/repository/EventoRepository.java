package dev.jeffnts.diospringpadroesprojeto.repository;
import dev.jeffnts.diospringpadroesprojeto.model.EventoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventoRepository extends CrudRepository<EventoModel, Long> {
    
}
