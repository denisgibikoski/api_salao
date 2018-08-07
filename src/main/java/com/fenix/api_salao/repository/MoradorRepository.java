package com.fenix.api_salao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fenix.api_salao.model.Morador;

public interface MoradorRepository extends MongoRepository<Morador, Long> {

}
