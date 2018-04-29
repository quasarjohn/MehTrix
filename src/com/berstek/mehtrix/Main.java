package com.berstek.mehtrix;

public class Main {

  public static void main(String[] args) {
    Matrix a = new Matrix(2,3);
    a.randomize();
    a.printValue();
    System.out.println();


    Matrix b = new Matrix(3, 2);
    b.randomize();
    b.printValue();
    System.out.println();

    Matrix c = a.multDotProduct(b);
    c.printValue();
  }
}
