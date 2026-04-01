package com.parkinglot.library.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    @Column(name="UserName")
    private String UserName;
    @Column(name="Password")
    private String Password;


}
