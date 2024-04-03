package com.jetbrains.taha.Gphoto.Clone.Services;

import com.jetbrains.taha.Gphoto.Clone.Repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {
    @Autowired
    private DogRepository dogRepository;
}
