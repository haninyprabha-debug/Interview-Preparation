package com.parkinglot.library.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;

@Entity
@Setter
@Getter
public class book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookId;
    @Column(name="BookName")
    private String BookName;
    @Column(name="Author")
    private String Author;
    @Column(name="Publisher")
    private String Publisher;


}
