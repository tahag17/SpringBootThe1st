package com.jetbrains.taha.Gphoto.Clone.dog;

import org.springframework.stereotype.Service;

@Service
public class DogService {
    public final DogRepository dogRepository;
    public DogService(DogRepository dogRepository) {this.dogRepository = dogRepository;}
}
