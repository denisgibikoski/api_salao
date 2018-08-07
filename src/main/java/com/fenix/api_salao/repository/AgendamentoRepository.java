package com.fenix.api_salao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fenix.api_salao.model.Agendamento;

public interface AgendamentoRepository extends MongoRepository<Agendamento, Long> {

}
