package com.berstek.mehtrix;

public class Main {

  public static void main(String[] args) {
    Matrix matrix = new Matrix(3, 9);
    matrix.addScalar(2);

    matrix.printValue();
  }
}
