package com.jetbrains.taha.Gphoto.Clone.cat;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private final CatRepository catRepository;
    public CatService(CatRepository catRepository){this.catRepository = catRepository;}

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

    //POST STUFF
    void saveCat(Cat cat) {catRepository.save(cat);}

}
