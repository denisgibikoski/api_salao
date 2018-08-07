package com.fenix.api_salao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fenix.api_salao.model.Proprietario;

public interface ProprietarioRepository extends MongoRepository<Proprietario, Long> {

}
