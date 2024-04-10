package com.jetbrains.taha.Gphoto.Clone.cat;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatService {
    private final CatRepository catRepository;
    public CatService(CatRepository catRepository){this.catRepository = catRepository;}


//GET STUFF
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
    public List<Cat> getCatByAge(int age) {
        Iterable<Cat> cats = this.catRepository.findAll();
        List<Cat> catListWithAge = new ArrayList<>();
        for (Cat cat : cats) {
            if (cat.getAge() == age) {
                catListWithAge.add(cat);
            }
        }
        return catListWithAge;
    }


    public List<Cat> getAllCats() {
        return (List<Cat>) this.catRepository.findAll();
    }


    //POST STUFF
    public void saveCat(Cat cat) {catRepository.save(cat);}
    public void saveListOfCats(List<Cat> cats) {catRepository.saveAll(cats);}

    //PUT STUFF
    public void UpdateCat(Cat cat) {catRepository.save(cat);}
    //DELETE STUFF
    public void deleteCat(Cat cat) {catRepository.delete(cat);}
    public void deleteCatById(int id) {catRepository.deleteById(id);}
    public void deleteAllByIds(List<Integer> ids) {catRepository.deleteAllById(ids);}
}
