package com.nghiapd.bookservice.command.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;
}
