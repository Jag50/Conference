package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service ("speakerService")
public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository; //= new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {

        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){

        System.out.println("SpeakerServiceImpl repository constructor");
        //instance is going to be injected using setter injection
        repository = speakerRepository;
    }

    @Override ////defined elsewhere
    public List<Speaker> findAll() {

        return repository.findAll();
    }

    @Autowired // This will automatically inject the speakerRepository bean to this setter
    public void setRepository(SpeakerRepository repository) {

        System.out.println("SpeakerServiceImpl setter constructor");
        this.repository = repository;
    }
}

//stored in a container