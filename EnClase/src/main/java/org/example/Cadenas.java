package org.example;

public class Cadenas {
/*
La manipulación de cadenas es algo muy habitual en la programación. Se utiliza tanto para comparar
contraseñas, validar usuarios, y controlar los datos que se ingresan por teclado.
Es por eso que pondremos en práctica algunos de los conceptos aprendidos.
Consigna: :mano_escribiendo:
1- Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
2- Dada una cadena mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
Entrada: cad = "Hola tu"
Salida: La cantidad de vocales es 3
*/

  public static void extraerLetras(){
    String cadena="Ohana";

    String posicion4=cadena.substring(3,4);
    String posicion5=cadena.substring(4,5);

    System.out.println(cadena);
    System.out.println("la posicion 4 es: "+posicion4);
    System.out.println("la posicion 5 es: "+posicion5);
  }


}
