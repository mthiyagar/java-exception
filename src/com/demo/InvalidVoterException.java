package com.demo;

//explain how to create custom exception and use it in code
public class InvalidVoterException extends Exception {
    InvalidVoterException(String name){
        super(name+" is not a valid voter");
    }

    InvalidVoterException(String name, Throwable t){
        super(name+" is not a valid voter", t);
    }
}
