package br.com.codenation.desafioexe;

import java.util.ArrayList;

public class TestaMetodo {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = a+b;
        fibonacciList.add(a);
        fibonacciList.add(b);
        for(int i=0;c<350; i++){
            c= a+b;
            a = b;
            b = c;
            if(c<350){
                fibonacciList.add(c);
            }
        }
        System.out.println(fibonacciList);
    }
}
