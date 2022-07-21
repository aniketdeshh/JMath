import jmath.Matrix2;
import jmath.Matrix3;
import jmath.Vector2;

public class Main {

    public static void main(String[] args) {

        Vector2 u = new Vector2(3, 4);
        Vector2 v = new Vector2(1, 2);

        double dotProduct = Vector2.dot(u, v);
        System.out.println(dotProduct);

        Matrix2 M = new Matrix2(
                1, 2,
                3, 4);

        Matrix2 M2 = Matrix2.mul(M, dotProduct);
        System.out.println(M2.toString());

        Matrix3 A = new Matrix3(); // creates an Identity 3x3 Matrix3
        System.out.println(A.toString());

    }

}
