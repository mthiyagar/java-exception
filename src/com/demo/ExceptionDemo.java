package com.demo;

import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) throws IOException {
        ExceptionDemo exception = new ExceptionDemo();
        //exception.exitAbruptly();
        try{
            // Use one of the below three to understand exception handling
            //exception.catchException();
            //exception.catchExceptionWithFinally();
            exception.throwException();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Completed successfully");
    }


    public void exitAbruptly(){
        int i = 100/0;
        System.out.println("i value without exception handling is "+ i);
    }

    public void catchException(){
        int i = 0;
        try{
            i = 100/0;
            System.out.println("i in try block "+ i);
        } catch(ArithmeticException e){
            i = -1;
        }
        System.out.println("i value after handling exception is "+ i);
    }

    public void catchExceptionWithFinally(){
        int i = 0;
        try{
            i = 100/1;
            System.out.println("i in try block "+ i);
        } catch(ArithmeticException e){
            System.out.println("Caught exception. Details are "+e.getMessage());
        } finally{
            System.out.println("Resetting i in finally block");
            i = -1;
        }
        System.out.println("i value after handling exception is "+ i);
    }

    public int throwException() throws ArithmeticException{
        int i = 100/0;
        System.out.println("value of i after return is "+ i);
        return i;
    }
}
