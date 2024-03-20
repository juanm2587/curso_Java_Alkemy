package org.example;

import java.util.Scanner;

public class Volumen {
  /*
  Math.¿qué?:
Vamos a poner en práctica lo aprendido resolviendo en vivo una operación aritmética bastante frecuente:
1.Desarrollar un programa que tome como dato de entrada un número que corresponde a la longitud del radio
una esfera y que calcule y escriba el volumen de la esfera que se corresponde con dicho radio.
La fórmula para calcular el volumen de la esfera es v = (4/3)*PI*r^3
   */
public static void calcular(){
  System.out.println("Ingrese el radio de una esfera para calcular el volumen: ");
  Scanner sc= new Scanner(System.in);

  double radio=sc.nextInt();
  double volumen =(4/3)*Math.PI*Math.pow(radio,3);
  System.out.println("El volumen del radio es: "+volumen);
  }
}
