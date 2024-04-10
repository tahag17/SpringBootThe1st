package com.jetbrains.taha.Gphoto.Clone.cat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    //GET STUFF
    @GetMapping("/id/{id}")
    public Cat getCatById(@PathVariable int id, Principal principal) {
        return this.catService.getCatByID(id);
    }

    @GetMapping("/name/{name}")
    public Cat getCatByName(@PathVariable String name) {
        return this.catService.getCatByName(name);
    }

    // get all cats
    @GetMapping
    public List<Cat> getAllCats() {
        return this.catService.getAllCats();
    }

    //get cats by age
    @GetMapping("/{age}")
    public List<Cat> getCatByAge(@PathVariable int age) {
        return this.catService.getCatByAge(age);
    }

    //POST STUFF
    @PostMapping("/create")
    public void saveCat(@RequestBody Cat cat) {
        catService.saveCat(cat);
    }

    @PostMapping("/createList")
    public void saveListOfCats(@RequestBody List<Cat> cats) {
        catService.saveListOfCats(cats);
    }


    //PUT STUFF
    @PutMapping("/modify")
    public void updateCat(@RequestBody Cat cat) {
        catService.UpdateCat(cat);
    }


    //DELETE STUFF
    @DeleteMapping("/{id}")
    public void deleteCatById(@PathVariable int id) {
        catService.deleteCatById(id);
    }
    @DeleteMapping("/delete")
    public void deleteCat(@RequestBody Cat cat) {catService.deleteCat(cat);}
    //delete all cats by id
    @DeleteMapping("/deleteList")
    public void deleteAllByIds(@RequestBody List<Integer> ids) {catService.deleteAllByIds(ids);}

}
