package com.berstek.mehtrix;

import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

  int rows, cols;

  float[][] matrix;

  public Matrix(int rows, int cols) {
    matrix = new float[rows][cols];

    this.rows = rows;
    this.cols = cols;
  }

  public void randomize() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = ThreadLocalRandom.current().nextInt(-10, 10);
      }
    }
  }

  public void printValue() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + ", ");
      }
      System.out.println();
    }
  }

  public float[][] addScalar(float n) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] += n;
      }
    }

    return matrix;
  }

  public float[][] addElementWise(Matrix m) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] += m.matrix[i][j];
      }
    }
    return matrix;
  }

  public float[][] multScalar(float n) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] *= n;
      }
    }

    return matrix;
  }

  public float[][] multElementWise(Matrix m) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] *= m.matrix[i][j];
      }
    }
    return matrix;
  }
}
