package com.company.game;

public class Hero {
  private String name;
  private int age;
  private int power;
  private int hitpoint;
  public String owner;
  public String husband;
  public String wife;

  public Hero(String n, int a, int p, int hp, String o, String w) { //конструктор под фул
    name = n;
    age = a;
    power = p;
    hitpoint = hp;
    owner = o;
    wife = w;
  }

  public Hero(String n, int p, int hp) { //конструктор под 3 поля
    name = n;
    power = p;
    hitpoint = hp;
  }


  public Hero(String n, int a) { //конструктор под 2 поля
    name = n;
    age = a;

  }


  public String getName() {
    return name;
  }public int getAge() {
    return age;
  }public int getPower() {
    return power;
  }public int getHp() {
    return hitpoint;
  }

}

