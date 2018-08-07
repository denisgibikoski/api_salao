package com.fenix.api_salao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fenix.api_salao.model.Apartamento;

public interface ApartamentoRepository extends MongoRepository<Apartamento, Long> {

}
