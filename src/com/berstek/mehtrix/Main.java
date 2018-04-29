package com.berstek.mehtrix;

public class Main {

  public static void main(String[] args) {
    Matrix a = new Matrix(2,3);
    a.randomize();
    a.printValue();
    System.out.println();

    a = a.transpose();
    a.printValue();



  }
}
