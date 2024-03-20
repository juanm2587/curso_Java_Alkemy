package org.example;

import java.util.Scanner;

public class Matriz {
  public static void completar(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Ingrese el tamanio de la matriz: ");
    int filas= sc.nextInt();
    int columnas= sc.nextInt();

    String[][] tamanioMatriz=new String[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.println("Ingrese Nombre y edad: ");
        String nombre=sc.next();
        int edad=sc.nextInt();
      }
    }
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.printf("%d ", tamanioMatriz[i][j]);
      }
    }
  }
}
