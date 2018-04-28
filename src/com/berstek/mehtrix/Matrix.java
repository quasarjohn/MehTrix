package com.berstek.mehtrix;

public class Matrix {

  private int rows, cols;

  float[][] matrix;

  public Matrix(int rows, int cols) {
    matrix = new float[rows][cols];

    this.rows = rows;
    this.cols = cols;
  }

  public void printValue() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + ", ");
      }
      System.out.println();
    }
  }

  public void addScalar(float n) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] += n;
      }
    }
  }

  public void multScalar(float n) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] *= n;
      }
    }
  }
}
