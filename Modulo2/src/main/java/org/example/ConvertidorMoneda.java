package org.example;

import java.util.Scanner;

public class ConvertidorMoneda {

  public static void convertir() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de Euros a convertir: ");
    double cantidadEuros = sc.nextDouble();

    System.out.println("Elija la moneda a convertir \n1 - Libras \n2 - Usd \n3 - Yenes");
    int moneda = sc.nextInt();

    aplicar(cantidadEuros, moneda);
  }
    private static void aplicar(double cantidadEuro,int opcion){
    double resultado=0.0;
    String tipoMoneda="";
    switch (opcion){
      case 1-> {
        resultado=cantidadEuro*0.86;
        tipoMoneda="Libras";
      }
      case 2-> {
        resultado=cantidadEuro*1.26;
        tipoMoneda="Usd";
      }
      case 3-> {
        resultado=cantidadEuro*129.85;
        tipoMoneda="Yenes";
      }
      default -> System.out.println("Opcion no valida");
    }
    System.out.println(cantidadEuro + " Euros equivalen a " + resultado + " " + tipoMoneda);
  }


}
