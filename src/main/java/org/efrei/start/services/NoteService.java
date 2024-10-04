package org.efrei.start.services;


import org.efrei.start.dto.CreateNote;

import org.efrei.start.models.Movie;
import org.efrei.start.models.Note;
import org.efrei.start.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository repository;
    private final MovieService movieService;

    @Autowired
    public NoteService(NoteRepository repository,MovieService movieService){
        this.repository=repository;
        this.movieService=movieService;
    }

    public List<Note> findAll(){
        return (List<Note>) repository.findAll();
    }

    public Note findById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<Note> findAllById(List<String> ids) {
        return repository.findAllById(ids);
    }

    public void create(CreateNote createNote){
        Note note=new Note();
        Movie movie= movieService.findById(createNote.getMovieId());
        note.setDetails(createNote.getDetails());
        note.setMovie(movie);
        repository.save(note);
    }

    public void deleteById(String id){
        repository.deleteById(id);
    }

    public void updateNote(String id, Note note){
        Note updateNote=findById(id);
        updateNote.setDetails(note.getDetails());
        repository.save(updateNote);
    }
}
