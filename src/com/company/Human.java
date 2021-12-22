package com.company;

public class Human {
    //Global variable
    private String name;
    private int age;
    boolean gender;
    Human mother;
    Human grandmother1;
    Human grandmother2;
    Human father;
    Human grandfather1;
    Human grandfather2;

    //Дети


    //Родители


    // Бабушки и Дедушки
    public Human(String name, int age, boolean gender, Human mother, Human father,
                 Human grandfatherml, Human grandfatherfl, Human grandmotherml, Human grandmotherfl) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.grandmother1 = grandmotherml;
        this.grandmother2 = grandmotherfl;
        this.grandfather1 = grandfatherml;
        this.grandfather2 = grandfatherfl;
    }
    public Human(String name, int age, boolean gender, Human mother, Human father) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }
    public Human(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    public String toBook() {
        String text = "";
        text += "Name: " + name + "\n";
        text += "Age: " + age + "\n";
        text += "Gender: " + (gender ? "man" : "woman") + "\n";
        if (mother != null) {
            text += "Mother: " + mother.name + "\n";
        }if (father != null) {
            text += "Father: " + father.name + "\n";
        }if (grandmother1 != null) {
            text += "Grandmother to mother line: " + grandmother1.name + "\n";
        }if (grandfather1 != null) {
                text += "Grandfather to mother line: " + grandfather1.name + "\n";
        }if (grandmother2 != null) {
                text += "Grandmother to father line: " + grandmother2.name + "\n";
        }if (grandfather2 != null) {
                text += "Grandfather to father line: " + grandfather2.name + "\n";
        }
            return text;


        }
    }


