package org.example;

import java.util.Scanner;

public class SumarNumeros {

  public static void ejecutarSuma(){
    Scanner sc=new Scanner(System.in);
    int numeroIngresado;

    do {
      System.out.println("Ingrese un numero entre 0 y 99: ");
      numeroIngresado=sc.nextInt();
      if (numeroIngresado<0 || numeroIngresado>99){
        System.out.println("El numero que ingresaste esta fuera del rango, vuelve a intentarlo");
      }
    }while (numeroIngresado<0 || numeroIngresado>99 );

    int numeroAleatorio=(int)(Math.random()*100);
    System.out.println("Número ingresado: " + numeroIngresado);
    System.out.println("Número aleatorio generado: " + numeroAleatorio);
    System.out.println("La suma de ambos números es: " + (numeroIngresado + numeroAleatorio));

  }

}
