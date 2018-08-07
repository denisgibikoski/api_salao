package com.fenix.api_salao.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@Document(collection = "telefone")
public class Telefone implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	@NotNull(message = "Campo Obrigadorio")
	private String celular;
	
	
	

}
