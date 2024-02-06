
package com.eniso.cours;
import java.util.Scanner;


public class Cours {
    public static void main (String[] args){
        System.out.println("donner une chaine : ");
        Scanner read = new Scanner(System.in);
        String chaine = read.nextLine();
        String ch1 = "";
        for (int i = chaine.length()-1;i>=0;i--){
            ch1 = ch1 + chaine.charAt(i);
        }
        System.out.println(ch1);
        
    }
}
