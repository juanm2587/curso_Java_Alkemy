package org.example;

import java.util.Scanner;

public class BuscarEnVector {
  public static void buscador(){

    Scanner sc =new Scanner(System.in);

    System.out.println("ingrese el tamanio del vector");
    int n=sc.nextInt();
    int [] tamanioVector= new int [n];
    for (int i = 0; i < n; i++) {
      tamanioVector[i]=(int)(Math.random()*10);
    }

    System.out.println("ingrese el numero a buscado");
    int numeroBuscado= sc.nextInt();
    boolean encontrado=false;

    for (int i = 0; i < n; i++) {
      if (tamanioVector[i]==numeroBuscado){
        encontrado=true;
        break;
      }
    }
    if (encontrado){
      System.out.println("Encontrado");
    }else {
      System.out.println("No encontrado");
    }

  }

}
