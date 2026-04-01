package com.parkinglot.library.Repository;

import com.parkinglot.library.Entity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookrepo extends JpaRepository<book,Long> {
}
