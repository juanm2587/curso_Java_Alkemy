package org.example;

import java.util.Scanner;

public class PalabrasLongitud {
 /*
 1.Realizar un programa que solo permita introducir frases o palabras de 8 de longitud.
 Si el usuario ingresa una cadena de 8 de longitud se deberá imprimir un mensaje por pantalla
 que diga “CORRECTO” e imprimir la frase en mayúsculas, en caso contrario, se deberá imprimir
 “INCORRECTO” y toda la frase en minúsculas.
  */

  public static void contar(){
    System.out.println("Ingrese una frase o palabra");
    Scanner sc= new Scanner(System.in);

    String cadena=sc.nextLine();

    if (cadena.length()==8){
      System.out.println("Correcto");
      System.out.println(cadena.toUpperCase());
    }else {
      System.out.println("Incorrecto");
      System.out.println(cadena.toLowerCase());
    }
  }
}
