package com.berstek.mehtrix;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class Matrix {

  int rows, cols;

  float[][] data;

  public Matrix(int rows, int cols) {
    data = new float[rows][cols];

    this.rows = rows;
    this.cols = cols;
  }

  public void randomize() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        data[i][j] = ThreadLocalRandom.current().nextInt(-10, 10);
      }
    }
  }

  public void printValue() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(data[i][j] + ", ");
      }
      System.out.println();
    }
  }

  //applies a function to every content of the matrix
  public void mapFunction(Function<Float, Float> fun) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        data[i][j] = fun.apply(data[i][j]);
      }
    }
  }

  public static Matrix addScalar(Matrix m, float n) {
    Matrix result = new Matrix(m.rows, m.cols);
    result.data = m.data;

    for (int i = 0; i < m.rows; i++) {
      for (int j = 0; j < m.cols; j++) {
        result.data[i][j] += n;
      }
    }

    return result;
  }

  public static Matrix addElementWise(Matrix l, Matrix m) {
    Matrix result = new Matrix(l.rows, l.cols);
    result.data = l.data;

    for (int i = 0; i < l.rows; i++) {
      for (int j = 0; j < l.cols; j++) {
        result.data[i][j] += m.data[i][j];
      }
    }
    return result;
  }

  public static Matrix multScalar(Matrix m, float n) {
    Matrix result = new Matrix(m.rows, m.cols);
    result.data = m.data;

    for (int i = 0; i < m.rows; i++) {
      for (int j = 0; j < m.cols; j++) {
        result.data[i][j] *= n;
      }
    }

    return result;
  }

  public static Matrix multElementWise(Matrix l, Matrix m) {
    Matrix result = new Matrix(l.rows, l.cols);
    for (int i = 0; i < l.rows; i++) {
      for (int j = 0; j < l.cols; j++) {
        result.data[i][j] *= m.data[i][j];
      }
    }
    return result;
  }

  public static Matrix multDotProduct(Matrix l, Matrix m) {
    Matrix result = null;

    if (l.rows == m.cols || l.cols == m.rows) {
      result = new Matrix(l.rows, m.cols);

      for (int i = 0; i < result.rows; i++) {
        for (int j = 0; j < result.cols; j++) {
          float sum = 0;
          for (int k = 0; k < l.cols; k++) {
            sum += (l.data[i][k]) * (m.data[k][j]);
          }
          result.data[i][j] = sum;
        }
      }
    } else {
      System.out.println("Column or row mismatch");
    }

    return result;
  }

  public static Matrix transpose(Matrix m) {
    Matrix result = new Matrix(m.cols, m.rows);

    for (int i = 0; i < result.rows; i++) {
      for (int j = 0; j < result.cols; j++) {
        result.data[i][j] = m.data[j][i];
      }
    }

    return result;

  }

}
