package br.usjt.hellospringboot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PrevisaoTempo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String diaSemana;
	private int tempMax;
	private int tempMin;
	private String descricao;
	//getters/setters
}

