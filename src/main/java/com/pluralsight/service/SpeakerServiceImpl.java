package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository; //= new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){

        //instance is going to be injected using setter injection
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> finall() {

        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}

//stored in a container