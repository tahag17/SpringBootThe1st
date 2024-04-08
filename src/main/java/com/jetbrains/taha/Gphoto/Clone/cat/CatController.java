package com.jetbrains.taha.Gphoto.Clone.cat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Cat getCatById(@PathVariable int id) {
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


//POST STUFF
    @PostMapping("/create")
    public void saveCat(@RequestBody Cat cat) {
        catService.saveCat(cat);
    }

}
