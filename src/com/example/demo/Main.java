package com.example.demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //types simple
        int myNumber = 2;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBool = true;
        String myString = "toto";


        //types complexes
        int[] myIntArr = {1, 2, 3, 4};

        ArrayList<Integer> myIntArrayList = new ArrayList<Integer>();

        myIntArrayList.add(4);
        myIntArrayList.add(200);

        Person toto = new Person("toto", "tata", 99);


        System.out.println(toto.toString());















    }
}

