package com.parkinglot.library.Service;

import com.parkinglot.library.Entity.book;
import com.parkinglot.library.Entity.user;
import com.parkinglot.library.Repository.bookrepo;
import com.parkinglot.library.Repository.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {
    @Autowired
    private userrepo repo;

    public List<user> getId() {
        return repo.findAll();
    }

    public user adduser(user s) {
        return repo.save(s);
    }

    public user updateall(Long UserId, user s) {
        user existing = repo.findById(UserId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        existing.setUserName(s.getUserName());
        existing.setPassword(s.getPassword());

        return repo.save(existing);
    }

    public String remove(Long UserId) {
        if (repo.existsById(UserId)) {
            repo.deleteById(UserId);
            return "User deleted";
        } else {
            throw new RuntimeException("User not found");
        }
    }
}