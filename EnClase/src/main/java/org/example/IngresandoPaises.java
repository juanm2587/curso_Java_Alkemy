package org.example;

import java.util.Scanner;

public class IngresandoPaises {
  public static void paises(){
    /*
  Ejercicio 1 :
  Recorriendo Arrays:
  Vamos a ver un ejemplo de manipulación de cadenas en arreglos.
  Esto es una práctica útil para guardar datos como por ejemplo contraseñas
  1.Declarar y recorrer un arreglo que almacene el nombre de 5 países ingresados por el usuario.
  Mostrar el contenido del arreglo por pantalla.
  */
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese la cantidad de paises que quiere ingresar: ");
    int cantidad= sc.nextInt();
    String[] paises= new String[cantidad];

    for (int i = 0; i < paises.length; i++) {
      System.out.println("Ingrese sus nombres: ");
      paises[i]=sc.next();
    }

    System.out.println("--------toString---------");
    System.out.println("los paises ingresados son: "+java.util.Arrays.toString(paises));

    System.out.println("--------For con posición---------");
    for (int i = 0; i < paises.length; i++) {
      System.out.println((i + 1) + " - " + paises[i]);
    }

    System.out.println("--------ForEach---------");
    for (String pais : paises) {
      System.out.println("Los Paises ingresados son: "+pais);
    }
  }
}
