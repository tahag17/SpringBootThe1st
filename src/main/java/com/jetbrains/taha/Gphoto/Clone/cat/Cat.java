package com.jetbrains.taha.Gphoto.Clone.cat;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("cats")
public class Cat {
    @Id
    private int id;
    private String name;
    private int age;

//    public String noise() {
//        return name+"'s Meoww, kind of noise";
//    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
