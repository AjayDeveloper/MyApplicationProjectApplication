package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.RequestDataDocument;

public interface RequestDataRepo extends MongoRepository<RequestDataDocument, Integer> {

}
