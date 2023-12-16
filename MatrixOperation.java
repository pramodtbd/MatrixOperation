public class MatrixOperation {
    private int[][] matrix;
    private int rows;
    private int cols;

    public MatrixOperation(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
        populateMatrix();
    }

    private void populateMatrix() {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = count;
                count++;
            }
        }
    }

    public void printRowWise() {
        System.out.println("Printing Matrix Row-wise:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void printColWise() {
        System.out.println("Printing Matrix Column-wise:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a 10x4 matrix
        MatrixOperation matrixOperations = new MatrixOperation(10, 4);

        // Print the matrix row-wise
        matrixOperations.printRowWise();

        // Print the matrix column-wise
        matrixOperations.printColWise();
    }
}
