package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {
  private int isbn;
  private String titulo;
  private String autor;
  private int numeroDePaginas;

  public Libro crearLibro(){

    Scanner sc=new Scanner(System.in);

    System.out.println("Ingrese el ISBN: ");
    isbn =sc.nextInt();

    System.out.println("Ingrese el titulo: ");
    titulo =sc.nextLine();

    System.out.println("Ingrese el Autor: ");
    autor =sc.nextLine();

    System.out.println("Ingrese el Numero de Paginas: ");
    numeroDePaginas =sc.nextInt();

    Libro libro=new Libro(isbn,titulo,autor,numeroDePaginas);
    return libro;
  }
}
