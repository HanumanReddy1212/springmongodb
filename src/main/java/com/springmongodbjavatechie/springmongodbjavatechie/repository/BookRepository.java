package com.springmongodbjavatechie.springmongodbjavatechie.repository;

import com.springmongodbjavatechie.springmongodbjavatechie.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book,Integer> {
}
