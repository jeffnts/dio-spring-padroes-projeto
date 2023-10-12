package dev.jeffnts.diospringpadroesprojeto.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dev.jeffnts.diospringpadroesprojeto.model.EnderecoModel;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface LocalizacaoService {
    @GetMapping("/{cep}/json/")
    EnderecoModel consultar(@PathVariable("cep") String cep);
}
