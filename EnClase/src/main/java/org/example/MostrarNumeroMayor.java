package org.example;

import java.util.Scanner;

public class MostrarNumeroMayor {
  public static void numeroMayor(){
  /*
  Ejercicio 2
Consigna: :mano_escribiendo:
Crear un arreglo para almacenar 3 números reales ingresados por el usuario y mostrar el mayor elemento.
Paso a paso: :engranaje:
1.declara el arreglo con tamaño 3
2.recorrer el arreglo con un bucle for
3.pedir el numero al usuario dentro del bucle
4.asignar el valor a cada elemento utilizando el iterador i
5.luego de almacenar, recorre el arreglo con otro bucle for dónde validarás cuál es el mayor (condicionales)
  */
    Scanner sc =new Scanner(System.in);
    System.out.println("Ingrese 3 numero reales");
    double mayor=0;
    double[] numeroReal=new double[3];
    for (int i = 0; i < numeroReal.length; i++) {
      numeroReal[i]= sc.nextDouble();
    }
    for (int i = 0; i < numeroReal.length; i++) {
      //System.out.println(numeroReal[i]);
      if (numeroReal[i]>mayor){
        mayor=numeroReal[i];
      }
    }
    /* porcion de codigo que me recomendo el IDE
    for (double v : numeroReal) {
      //System.out.println(numeroReal[i]);
      if (v > mayor) {
        mayor = v;
      }
    }*/
    System.out.println("El numero mayor es: "+mayor);
  }
}
