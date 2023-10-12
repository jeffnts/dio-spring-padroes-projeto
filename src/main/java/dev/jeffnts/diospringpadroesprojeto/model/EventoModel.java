package dev.jeffnts.diospringpadroesprojeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EventoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    private String titulo;

    private String data;

    private String horario;

    @ManyToOne
    private EnderecoModel endereco;
}
