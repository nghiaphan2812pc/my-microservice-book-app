package com.nghiapd.bookservice.command.command;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class CreateBookCommand {
    @TargetAggregateIdentifier
    private String bookId;
    private String name;
    private String author;
    private Boolean isReady;


    public CreateBookCommand(String bookId, String name, String author, Boolean isReady) {
        super();
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.isReady = isReady;
    }
}
