package com.parkinglot.library.Controller;

import com.parkinglot.library.Entity.book;
import com.parkinglot.library.Service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/Login")
public class bookcontroller {
    @Autowired
    private bookservice book;
    @GetMapping("/books")
    public List<book> getId(){
        return book.getId();
    }
    @PostMapping("/create")
    public book addbook(@RequestBody book s){
        return  book.addbook(s);
    }
    @PutMapping ("/{id}")
    public book updateall(@PathVariable("id") Long BookId, @RequestBody book s){
        return book.updateall(BookId,s);
    }

@DeleteMapping("/{id}")
public  String remove(@PathVariable("id") Long BookId){
    return book.remove(BookId);}
}