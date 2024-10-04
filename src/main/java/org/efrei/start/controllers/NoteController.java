package org.efrei.start.controllers;

import org.efrei.start.dto.CreateNote;
import org.efrei.start.models.Note;
import org.efrei.start.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService service;

    @Autowired
    public NoteController(NoteService service){
        this.service=service;
    }

    @GetMapping
    public ResponseEntity<List<Note>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<?> create(@RequestBody CreateNote createNote){
        service.create(createNote);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> findById(@PathVariable String id){
        Note note=service.findById(id);
        if(note==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id){
        Note note=service.findById(id);
        if (note==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Note note){
        service.updateNote(id,note);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
