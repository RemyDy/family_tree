package nl.novi.familiytree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private String mother;
    private String father;
    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Pet> pets;

    public Person(){

    }

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public void addParents() {

    }

    public void addChild() {

    }

    public void addPet() {

    }

    public void addSibling() {

    }

    private boolean isFirstCharUpperCase(String name){
        return Character.isUpperCase(name.codePointAt(0));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isFirstCharUpperCase(name)) {
            this.name = name;
        } else {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (isFirstCharUpperCase(lastName)) {
            this.lastName = lastName;
        } else {
            this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
