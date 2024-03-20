package org.example;

import java.util.Scanner;

public class Comparador {
  public static void aplicarComparar(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Ingrese la frase: ");
    String cadena=sc.nextLine();

    if (cadena.equals("eureka")){
      System.out.println("Correcto");
    }else {
      System.out.println("Incorrecto");
    }
  }
}
