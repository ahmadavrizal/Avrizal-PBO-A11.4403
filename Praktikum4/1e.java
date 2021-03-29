class PerkalianMatrix {
    public static void main (String[] args){
        int matrix1[][] = new int[2][2];
        matrix1[0][0] = 19;
        matrix1[0][1] = 21;
        matrix1[1][0] = 42;
        matrix1[1][1] = 9;

        int matrix2[][] = new int[2][2];
        matrix2[0][0] = 10;
        matrix2[0][1] = 5;
        matrix2[1][0] = 19;
        matrix2[1][1] = 17;

        int matrix3[][] = new int[2][2];

        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int total = 0; 
                for (int k = 0; k < matrix1.length; k++){
                    total = total +  (matrix1[i][k] * matrix2[k][j]);
                }
                matrix3[i][j] = total;
            }       
        }

        for (int i = 0; i < matrix3.length; i++){
            for (int j = 0; j < matrix3[0].length; j++){
                System.out.print( matrix3[i][j] + " ");
            }       
            System.out.println();
        }
    }
}