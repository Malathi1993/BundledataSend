package com.example.bundledatasend;

import java.io.Serializable;

public class Character implements Serializable {
    String name, rollno, id;
    String[] abilities;
    public Character(String name, String proffession, String position, String[] abilities) {
        this.name = name;
        rollno = proffession;
        id = position;
        this.abilities = abilities;
    }
}