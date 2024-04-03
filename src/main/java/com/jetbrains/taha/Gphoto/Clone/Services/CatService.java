package com.jetbrains.taha.Gphoto.Clone.Services;

import com.jetbrains.taha.Gphoto.Clone.Cat;
import com.jetbrains.taha.Gphoto.Clone.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    @Autowired
    private CatRepository catRepository;

    public Cat getCatByID(int id) {
        if (this.catRepository.findById(id).isPresent()) {
            return this.catRepository.findById(id).get();
        } else {
            throw new RuntimeException("shiro khrej lznqa");
        }
    }

    public Cat getCatByName(String name) {
        Iterable<Cat> cats = this.catRepository.findAll();


        for (Cat cat : cats) {
            if (cat.getName().equalsIgnoreCase(name)) {
                return cat;
            }
        }
        return null;
    }


    public List<Cat> getAllCats() {
        return (List<Cat>) this.catRepository.findAll();
    }

}
