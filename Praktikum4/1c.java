class MatrixMultiplication {
   public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2, int row, int column, int col)
   {
      int[][] multiply = new int[row][col];
      for(int a = 0; a < row; a++) 
      {
         for(int b = 0; b < col; b++) 
         {
            for(int k = 0; k < column; k++) 
            {
               multiply[a][b] += matrix1[a][k] * matrix2[k][b];
            }
         }
      }
      return multiply;
   }
   public static void printMatrix(int[][] multiply) 
   {
      System.out.println("Multiplication of two matrix: ");
      for(int[] row : multiply) 
      {
         for(int column : row) 
         {
            System.out.print(column + "    ");
         }
         System.out.println();
      }
   }
   public static void main(String[] args) 
   {
      int row = 2, col = 3;
      int column = 2;
      int[][] matrixOne = {{4, 5, 6}, {7, 8, 9}};
      int[][] matrixTwo = {{1, 2}, {2, 1}, {1, 3}};
      int[][] product = multiplyMatrix(matrixOne, matrixTwo, row, col, column);
      printMatrix(product);
   }
}