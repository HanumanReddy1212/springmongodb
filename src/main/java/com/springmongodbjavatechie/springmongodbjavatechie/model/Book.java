package com.springmongodbjavatechie.springmongodbjavatechie.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collation = "Book")
public class Book {
    @Id
    private int id;
    private String bookName;
    private String authorName;
}
