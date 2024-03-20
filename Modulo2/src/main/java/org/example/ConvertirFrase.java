package org.example;

import java.util.Scanner;

public class ConvertirFrase {

  public static void ejecutarFrase(){
    Scanner sc=new Scanner(System.in);

    System.out.println("Ingrese la frase a convertir: ");
    String ingresarFrase=sc.nextLine();

    System.out.println("Elija una opcion: \n1- Convertir a mayusculas\n2- convertir a minusculas");
    int opcion=sc.nextInt();
    switch (opcion){
      case 1-> System.out.println("Frase en mayuscula: "+ingresarFrase.toUpperCase());
      case 2-> System.out.println("Frase en minuscula: "+ingresarFrase.toLowerCase());
    }
  }
}
