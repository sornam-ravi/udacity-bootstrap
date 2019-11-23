package com.udacity.bootstrap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public Dog(String name, String breed, String origin) {
        Name = name;
        Breed = breed;
        Origin = origin;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }



    public Dog(long ID, String name, String breed, String origin) {
        this.ID = ID;
        Name = name;
        Breed = breed;
        Origin = origin;
    }

    private String Name;
    private String Breed;
    private String Origin;
}
