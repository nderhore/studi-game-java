package org.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //instanciation de l'objet Random
        Random random = new Random();

        //Generation du nombre aléatoire
        int nombreADeviner = random.nextInt(100) +1;

        //Instanciation de l'objet Scanner
        Scanner sc = new Scanner(System.in);

        int saisie = 0;

        int cptEssai = 5;

        System.out.println("Devinez un nombre entre 1 et 100.");

        do {
            System.out.println("Entrez un nombre : ");
            saisie = sc.nextInt();
            cptEssai--;

            if(nombreADeviner < saisie){
                System.out.println("le nombre a deviner est plus petit");
            } else if(nombreADeviner > saisie){
                System.out.println("le nombre a deviner est plus grand");
            } else{
                System.out.println("Bravo, vous avez deviné le nombre");
            }

        }while(saisie != nombreADeviner && cptEssai != 0);

        if(saisie != nombreADeviner && cptEssai == 0){
            System.out.println("Vous avez perdu");
        }

    }
}
