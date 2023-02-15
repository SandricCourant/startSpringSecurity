package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        try {
            i ++;
            i = i / 0;
            System.out.println("c normal");
        } catch (Exception e){
            System.out.println("erreur !");
        }
        System.out.println(i);
    }
}