/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;


public class Tp1 {
    

    public static void main(String[] args) {
        System.out.println("Bonjour, mon premier TP en POO");
           
        //lecture du nom
        System.out.println("Qeulle est votre nom");
        Scanner read = new Scanner(System.in);
        String name = read.next();
        
        
        //lecture de l'age
        System.out.println();
        System.out.println("Bonjour " + name);
        System.out.println("Quelle est votre age " + name + " ?");
        read = new Scanner(System.in);
        int a;
        a = read.nextInt();
        System.out.println(name + " votre age est " + a);
        
    }
   public  static double[] calculateProbability(int[][] image) {
               int M = image.length;
               int nb = 0;
               for(int i = 0; i<255 ; i++){
                  for(int j = 0; j<image.length; j++){
                     for(int C = 0; C<image[0].length ; C++){
                      if (image[j][C] == i )
                          nb+=1;
                                  } 
               }
             double prob[i][i] = nb / M*image[0] ;
           }
   return(prob[][]);
   
   }
   public static double[] calculateEntropy(int matrix[][]) {
       for (int i = 0; i<255 ; i++) {
           double H;
           H-=calculateProbability(prob[i][i] * Math.log(calculateProbability(prob[i][i]));
       }
           
       }
   }
   
