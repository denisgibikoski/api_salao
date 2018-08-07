package com.fenix.api_salao.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import com.fenix.api_salao.model.emun.Status;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@Document(collection = "agendamento")
public class Agendamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@DateTimeFormat
	private Date agendamento; 
	
	@DBRef
	@NotNull(message = "Campo Obrigadorio")
	private Apartamento apartamento;
	
	private Integer status;

	public Agendamento() {
		
	}

	public Agendamento(Long id, Date agendamento, @NotNull(message = "Campo Obrigadorio") Apartamento apartamento,
			Status status) {
		super();
		this.id = id;
		this.agendamento = agendamento;
		this.apartamento = apartamento;
		this.status = status.getCod();
	}
	
	
	public Status  getStatus() {
		return Status.toEnum(status);
	}


	public void setTipo(Status  status) {
		this.status= status.getCod();
	}
	
	

}
