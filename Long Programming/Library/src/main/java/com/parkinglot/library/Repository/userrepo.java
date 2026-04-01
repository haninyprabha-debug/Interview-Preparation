package com.parkinglot.library.Repository;


import com.parkinglot.library.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepo extends JpaRepository<user,Long> {
}
