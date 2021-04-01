public class MatrixAksi {
    public static void main(String[] args) {
        Matrix A = Matrix.random(4, 4);
        A.show();
        System.out.println();
        Matrix B = A.transpose();
        B.show();
        System.out.println();
        Matrix C = Matrix.identity(3);
        C.show();
        System.out.println();
        Matrix Sum = A.plus(B);
        Sum.show();
        System.out.println();
        Matrix Multi = B.times(A);
        Multi.show();
        System.out.println();
    }
}