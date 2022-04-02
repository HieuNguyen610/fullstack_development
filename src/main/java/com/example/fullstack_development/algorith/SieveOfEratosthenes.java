package com.example.fullstack_development.algorith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SieveOfEratosthenes {

    void sieveOfEratosthenes(int limit) {
        boolean[] output = new boolean[limit+1];
        for(int i = 0; i <= limit; i++){
            output[i] = true;
        }
        output[0]= false;
        output[1]= false;

        for(int i = 2; i <= Math.pow(limit, 0.5); i++){
            if(output[i]== true){
                for(int j = (int)Math.pow(i, 2); j <= limit; j = j+i){
                    output[j]= false;
                }
            }
        }

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < output.length; i++){
            if(output[i] == true){
                result.add(i);
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = scanner.nextInt();
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        System.out.println("Sieve of Eratosthenes: ");
        g.sieveOfEratosthenes(n);
        // should return [2, 3, 5, 7]
    }



}
