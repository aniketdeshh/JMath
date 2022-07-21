package jmath;

public class Matrix2 {

    public double m00, m01;
    public double m10, m11;
    public double[][] entries = {
            { m00, m01 },
            { m10, m11 }
    };
    public Matrix2 copy;

    public Matrix2() {
        this.m00 = 1.0;
        this.m11 = 1.0;
    }

    public Matrix2(double m) {
        this.m00 = m;
        this.m01 = m;
        this.m10 = m;
        this.m11 = m;
    }

    public Matrix2(Matrix2 M) {
        this.m00 = M.m00;
        this.m01 = M.m01;
        this.m10 = M.m10;
        this.m11 = M.m11;
    }

    public Matrix2(
            double m00, double m01,
            double m10, double m11) {
        this.m00 = m00;
        this.m01 = m01;
        this.m10 = m10;
        this.m11 = m11;
    }

    public Matrix2(Vector2 v1, Vector2 v2) {
        this.m00 = v1.x;
        this.m01 = v2.x;
        this.m10 = v1.y;
        this.m11 = v2.y;
    }

    public void set(Matrix2 M) {
        this.m00 = M.m00;
        this.m01 = M.m01;
        this.m10 = M.m10;
        this.m11 = M.m11;
    }

    public void set(double m00, double m01, double m10, double m11) {
        this.m00 = m00;
        this.m01 = m01;
        this.m10 = m10;
        this.m11 = m11;
    }

    public double[] getRow(int row) {
        return this.entries[row];
    }

    public double[] getColumns(int column) {
        return new double[] { this.entries[0][column], this.entries[1][column] };
    }

    public void zero() {
        this.m00 = 0.0;
        this.m01 = 0.0;
        this.m10 = 0.0;
        this.m11 = 0.0;
    }

    public void add(Matrix2 M) {
        this.m00 += M.m00;
        this.m01 += M.m01;
        this.m10 += M.m10;
        this.m11 += M.m11;
    }

    public static Matrix2 add(Matrix2 A, Matrix2 B) {
        double ab00 = A.m00 + B.m00;
        double ab01 = A.m01 + B.m01;
        double ab10 = A.m10 + B.m10;
        double ab11 = A.m11 + B.m11;
        return new Matrix2(ab00, ab01, ab10, ab11);
    }

    public void sub(Matrix2 M) {
        this.m00 -= M.m00;
        this.m01 -= M.m01;
        this.m10 -= M.m10;
        this.m11 -= M.m11;
    }

    public static Matrix2 sub(Matrix2 A, Matrix2 B) {
        double ab00 = A.m00 - B.m00;
        double ab01 = A.m01 - B.m01;
        double ab10 = A.m10 - B.m10;
        double ab11 = A.m11 - B.m11;
        return new Matrix2(ab00, ab01, ab10, ab11);
    }

    public void mul(double scalar) {
        this.m00 *= scalar;
        this.m01 *= scalar;
        this.m10 *= scalar;
        this.m11 *= scalar;
    }

    public static Matrix2 mul(Matrix2 M, double scalar) {
        return new Matrix2(
                M.m00 * scalar, M.m01 * scalar,
                M.m10 * scalar, M.m11 * scalar);
    }

    public void mul(Matrix2 M) {
        this.m00 = new Vector2(this.m00, this.m01).dot(new Vector2(M.m00, M.m10));
        this.m01 = new Vector2(this.m00, this.m01).dot(new Vector2(M.m01, M.m11));
        this.m01 = new Vector2(this.m10, this.m11).dot(new Vector2(M.m00, M.m10));
        this.m01 = new Vector2(this.m10, this.m11).dot(new Vector2(M.m01, M.m11));
    }

    public static Matrix2 mul(Matrix2 A, Matrix2 B) {
        return new Matrix2(
                new Vector2(A.m00, A.m01).dot(new Vector2(B.m00, B.m10)),
                new Vector2(A.m00, A.m01).dot(new Vector2(B.m01, B.m11)),
                new Vector2(A.m10, A.m11).dot(new Vector2(B.m00, B.m10)),
                new Vector2(A.m10, A.m11).dot(new Vector2(B.m01, B.m11)));
    }

    public void identity() {
        this.zero();
        this.m00 = 1.0;
        this.m11 = 1.0;
    }

    public double determinant() {
        return this.m00 * this.m11 - this.m01 * this.m10;
    }

    public void transpose() {
        this.set(
                this.m00, this.m10,
                this.m01, this.m11);
    }

    public static Matrix2 transpose(Matrix2 M) {
        M.transpose();
        return M;
    }

    public String toString() {
        return this.m00 + " " + this.m01 + "\n" + this.m10 + " " + this.m11 + "\n";
    }

}
