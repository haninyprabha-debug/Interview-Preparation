package com.parkinglot.library.Controller;

import com.parkinglot.library.Entity.user;
import com.parkinglot.library.Service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uslogin")
public class usercontroller {
    @Autowired
    private userservice user;
    @GetMapping("/users")
    public List<user> getId(){
        return user.getId();
    }
   @PostMapping("/uscreate")
    public user adduser(@RequestBody user s ){
        return user.adduser(s);
   }
   @PutMapping("/{id}")
    public user updateall(@PathVariable("id") Long UserId,@RequestBody user s){
        return user.updateall(UserId,s);
   }
    @DeleteMapping("/{id}")
    public  String remove(@PathVariable("id") Long UserId){
        return user.remove(UserId);}

}
