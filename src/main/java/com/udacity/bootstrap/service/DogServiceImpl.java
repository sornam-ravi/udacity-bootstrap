package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;
    public List<Dog> retrieveDogs(){
        return (List<Dog>) dogRepository.findAll();
    }


    public List<String> retrieveDogBreed() {
        return  dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(long id) {
        //return (String) dogRepository.findBreedById(id);
        Optional<String> optionalBreed =Optional.ofNullable(dogRepository.findBreedById(id));
                String breed=optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllName();
    }
}
