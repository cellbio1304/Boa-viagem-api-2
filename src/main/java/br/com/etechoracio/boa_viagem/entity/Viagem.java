package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/*CREATE TABLE TBL_VIAGEM(
		ID_VIAGEM BIGINT PRIMARY KEY IDENTITY,
		TX_DESTINO VARCHAR(30) NOT NULL,
		TP_VIAGEM VARCHAR(8) NOT NULL,
		DT_CHEGADA DATE NOT NULL,
		DT_SAIDA DATE,
		VLR_ORCAMENTO FLOAT NOT NULL,
		QTD_PESSOAS INT
		);*/

@Getter
@Setter
@Entity
@Table(name = "TBL_VIAGEM")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VIAGEM")
	private Long id;

	@Column(name = "TX_DESTINO")
	private String destino;
	
	@Column(name = "TP_VIAGEM")
	private String tipo;
	
	@Column(name = "DT_CHEGADA")
	private LocalDate chegada;
	
	@Column(name = "DT_SAIDA")
	private LocalDate saida;
	
	@Column(name = "VLR_ORCAMENTO")
	private Double orcamento;
	
	@Column(name = "QTD_PESSOAS")
	private Integer pessoas;

}
