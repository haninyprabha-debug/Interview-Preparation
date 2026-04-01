package com.parkinglot.library.Service;

import com.parkinglot.library.Entity.book;
import com.parkinglot.library.Repository.bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class bookservice {
    @Autowired
    private bookrepo repo;
    public List<book> getId(){
        return repo.findAll();
    }
     public book addbook(book s){
        return repo.save(s);
     }
     public book updateall(Long BookId, book s){
        book existing = repo.findById(BookId).orElseThrow(() ->new RuntimeException("Book not Found with Id: " + BookId));
        existing.setBookName(s.getBookName());
        existing.setAuthor(s.getAuthor());
        existing.setPublisher(s.getPublisher());

         return repo.save(existing);
     }
     public String remove (Long BookId){
        if(repo.existsById(BookId)){
            repo.deleteById(BookId);
            return "Book Removed Successfully";
        }else{
            throw new RuntimeException("Book Not Found with Id: " +BookId);
        }
     }
}
