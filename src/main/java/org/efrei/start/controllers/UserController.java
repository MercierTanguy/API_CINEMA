package org.efrei.start.controllers;



import org.efrei.start.dto.CreateUser;
import org.efrei.start.models.User;
import org.efrei.start.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service){
        this.service=service;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<List<User>>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateUser createUser){
        service.create(createUser);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id){
        User user=service.findById(id);
        if(user==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id){
        User user=service.findById(id);
        if (user==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody User user){
        service.updateMovie(id,user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
