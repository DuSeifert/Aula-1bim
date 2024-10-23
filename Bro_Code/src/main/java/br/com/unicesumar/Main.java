package br.com.unicesumar;

import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<String> t1 = new ArrayList<>();
        ArrayList<String> t2 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        list.add("Vini");
        list.add("Isa");
        list.add("Neto");
        list.add("Kyll");
        list.add("Rafa");
        list.add("Bileu");
        list.add("Gluten free");
        list.add("filipenis");
        list.add("Glub glub");
        list.add("Gu");

        int r1, r2, i = 0;

        while (i < 10) {
            r1 = rand.nextInt(list.size());
            r2 = rand.nextInt(2);

            if (r2%2 == 0) {
                if(t1.size() <5) {
                    t1.add(list.get(r1));
                    list.remove(r1);
                    i++;
                }
            }
            else {
                if(t2.size() <5){
                    t2.add(list.get(r1));
                    list.remove(r1);
                    i++;
                }
            }
        }

        System.out.println("time 1: "+t1);
        System.out.println("\ntime 2: "+t2);

    }
}
