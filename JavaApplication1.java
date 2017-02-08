package javaapplication1;

import java.util.Random;

public class JavaApplication1 {

    public static void main(String[] args) {
        int a[];
        a = new int [4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        permutacion(a,4);
        for(int i:a){
            System.out.println(i);
        }
    }   
    
    public static void permutacion(int []a,int tamaño){
        int t=0;
        int k=0;
        Random r = new Random();
        for(int i=0;i<tamaño;i++){
            k=r.nextInt(tamaño);
            t=a[i];
            a[i]=a[k];
            a[k]=t;
        }
    }
}
