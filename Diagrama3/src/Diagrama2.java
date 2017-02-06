/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Diagrama2 {
    
    public static void main (String[] arg){
        java.util.Scanner lectura = new java.util.Scanner(System.in);
        int numDivisores, numero, conDivisores;
        numDivisores = 0;
        numero = 0;
        
        for(int i = 1; !(i>100); i++){
            conDivisores = 0;
            
            for (int j = 1; !(j>i); j++){
                if(i%j==0){
                    conDivisores++;
                }
            }
            
            if(conDivisores>=numDivisores){
                numDivisores=conDivisores;
                numero = i;
            }
        }
        System.out.println("Numero "+numero+" tiene "+numDivisores);
    }
}
