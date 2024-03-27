package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cafetera {
  private int capacidadMaxima;
  private int cantidadActual;

  public Cafetera() {
    this.capacidadMaxima=1000;
    this.cantidadActual=0;
  }
  public Cafetera(int capacidadMaxima, int cantidadActual) {
    this.capacidadMaxima = capacidadMaxima;
    this.cantidadActual = cantidadActual;
  }

  public void llenarCafetera(){
    cantidadActual=capacidadMaxima;
  }
}
