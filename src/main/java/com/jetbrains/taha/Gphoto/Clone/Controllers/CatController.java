package com.jetbrains.taha.Gphoto.Clone.Controllers;

import com.jetbrains.taha.Gphoto.Clone.Cat;
import com.jetbrains.taha.Gphoto.Clone.Services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping("/id/{id}")
    public Cat getCatById(@PathVariable int id) {
        return this.catService.getCatByID(id);
    }

    @GetMapping("/name/{name}")
    public Cat getCatByName(@PathVariable String name) {
        return this.catService.getCatByName(name);
    }

    // get all cats
    @GetMapping("/cats")
    public List<Cat> getAllCats() {
        return this.catService.getAllCats();
    }

}
