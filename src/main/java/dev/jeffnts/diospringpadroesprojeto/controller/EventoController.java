package dev.jeffnts.diospringpadroesprojeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jeffnts.diospringpadroesprojeto.model.EventoModel;
import dev.jeffnts.diospringpadroesprojeto.service.EventoService;

@RestController
@RequestMapping("eventos")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping
    public ResponseEntity<Iterable<EventoModel>> listar(){
        return ResponseEntity.ok(eventoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoModel> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok(eventoService.listarPorId(id));
    }

    @PostMapping
    public ResponseEntity<String> criar(@RequestBody EventoModel evento){
        eventoService.criar(evento);
        return ResponseEntity.ok("Evento criado com sucesso!");
    }

    @PutMapping("/{id}")
    public Object atualizar(@PathVariable Long id, @RequestBody EventoModel evento){
        Boolean eventoAtualizado = eventoService.atualizar(id, evento);

        if(!eventoAtualizado){
            return ResponseEntity.notFound();
        }
        return ResponseEntity.ok("Evento atualizado com sucesso!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remover(@PathVariable Long id){
        eventoService.remover(id);
        return ResponseEntity.ok("Evento Removido com sucesso!");
    }
}
