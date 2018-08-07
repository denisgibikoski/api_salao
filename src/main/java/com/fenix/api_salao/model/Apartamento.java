package com.fenix.api_salao.model;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@ToString
@EqualsAndHashCode
@Document(collection = "apartamento")
public class Apartamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@NotNull(message = "Campo Obrigadorio")
	private Proprietario proprietario;
	
	@DBRef
	private Morador morador;
	
	@DBRef
	private List<Agendamento> agendamentos;

	
	
}
