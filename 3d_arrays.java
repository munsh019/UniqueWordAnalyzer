import java.util.Scanner;

 class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depth = scanner.nextInt();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][][] array3D = new int[depth][rows][cols];
        
        for (int i=0;i<depth;i++){
            for(int j=0;j<rows;j++){
                for(int k=0;k<cols;k++){
                   array3D[i][j][k] = (i+1)*(j+1)*(k+1);
                }
            }
        }

        // Print the 3D array
        for (int d = 0; d < depth; d++) {
            System.out.println("Depth " + d + ":");
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    System.out.print(array3D[d][r][c] + " ");
                }
                System.out.println();
            }
        }
    }
}
