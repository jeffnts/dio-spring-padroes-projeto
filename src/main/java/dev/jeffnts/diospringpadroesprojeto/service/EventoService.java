package dev.jeffnts.diospringpadroesprojeto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.jeffnts.diospringpadroesprojeto.model.EnderecoModel;
import dev.jeffnts.diospringpadroesprojeto.model.EventoModel;
import dev.jeffnts.diospringpadroesprojeto.repository.EnderecoRepository;
import dev.jeffnts.diospringpadroesprojeto.repository.EventoRepository;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private LocalizacaoService localizacaoService;

    public Iterable<EventoModel> listar(){
        return eventoRepository.findAll();
    }

    public EventoModel listarPorId(Long id){
        Optional<EventoModel> evento = eventoRepository.findById(id);
        return evento.get();
    }

    public void criar(EventoModel evento) {
        salvarEventoComLocalizacao(evento);
    }
    
    public boolean atualizar(Long id, EventoModel eventoData){
        Optional<EventoModel> evento = eventoRepository.findById(id);
        if(evento.isPresent()){
            eventoData.setId(id);
            salvarEventoComLocalizacao(eventoData);

            return true;
        }

        return false;
    }

    public void remover(Long id){
        eventoRepository.deleteById(id);
    }

    private void salvarEventoComLocalizacao(EventoModel evento){
        String cep = evento.getEndereco().getCep();
        EnderecoModel endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            EnderecoModel novoEndereco = localizacaoService.consultar(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        evento.setEndereco(endereco);
        eventoRepository.save(evento);
    }
}
