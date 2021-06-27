package com.demo;

public class Voter {

    private String name;
    private Integer age;

    public static void main(String[] args) {
        Voter bob = new Voter("Bob", 20);
        Voter tim = new Voter("Tim", 10);

        try{
            bob.vote();
            tim.vote();
        }catch (Exception e){
            System.out.println(e.getClass()+":"+e.getMessage());
        }
    }

    Voter(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void vote() throws InvalidVoterException {
        if(this.age < 18){
            throw new InvalidVoterException(this.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
