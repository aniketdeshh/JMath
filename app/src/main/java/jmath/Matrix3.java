package jmath;

public class Matrix3 {

    public double m00, m01, m02;
    public double m10, m11, m12;
    public double m20, m21, m22;
    public double[][] entries = {
            { m00, m01, m02 },
            { m10, m11, m12 },
            { m20, m21, m22 }
    };

    public Matrix3() {
        this.zero();
        this.m00 = 1.0;
        this.m11 = 1.0;
        this.m22 = 1.0;
    }

    public Matrix3(double m) {
        this.m00 = m;
        this.m01 = m;
        this.m02 = m;
        this.m10 = m;
        this.m11 = m;
        this.m12 = m;
        this.m20 = m;
        this.m21 = m;
        this.m22 = m;
    }

    public Matrix3(Matrix3 M) {
        this.m00 = M.m00;
        this.m01 = M.m01;
        this.m02 = M.m02;
        this.m10 = M.m10;
        this.m11 = M.m11;
        this.m12 = M.m12;
        this.m20 = M.m20;
        this.m21 = M.m21;
        this.m22 = M.m22;
    }

    public Matrix3(
            double m00, double m01, double m02,
            double m10, double m11, double m12,
            double m20, double m21, double m22) {
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
    }

    public Matrix3(Vector3 v1, Vector3 v2, Vector3 v3) {
        this.m00 = v1.x;
        this.m01 = v2.x;
        this.m02 = v3.x;
        this.m10 = v1.y;
        this.m11 = v2.y;
        this.m12 = v3.y;
        this.m20 = v1.z;
        this.m21 = v2.z;
        this.m22 = v3.z;
    }

    public void set(Matrix3 M) {
        this.m00 = M.m00;
        this.m01 = M.m01;
        this.m02 = M.m02;
        this.m10 = M.m10;
        this.m11 = M.m11;
        this.m12 = M.m12;
        this.m20 = M.m20;
        this.m21 = M.m21;
        this.m22 = M.m22;
    }

    public void set(
            double m00, double m01, double m02,
            double m10, double m11, double m12,
            double m20, double m21, double m22) {
        this.m00 = m00;
        this.m01 = m01;
        this.m02 = m02;
        this.m10 = m10;
        this.m11 = m11;
        this.m12 = m12;
        this.m20 = m20;
        this.m21 = m21;
        this.m22 = m22;
    }

    public double[] getRow(int row) {
        return this.entries[row];
    }

    public double[] getColumns(int column) {
        return new double[] { this.entries[0][column], this.entries[1][column], this.entries[2][column] };
    }

    public void zero() {
        this.m00 = 0.0;
        this.m01 = 0.0;
        this.m02 = 0.0;
        this.m10 = 0.0;
        this.m11 = 0.0;
        this.m12 = 0.0;
        this.m20 = 0.0;
        this.m21 = 0.0;
        this.m22 = 0.0;
    }

    public void add(Matrix3 M) {
        this.m00 += M.m00;
        this.m01 += M.m01;
        this.m02 += M.m02;
        this.m10 += M.m10;
        this.m11 += M.m11;
        this.m12 += M.m12;
        this.m20 += M.m20;
        this.m21 += M.m21;
        this.m22 += M.m22;
    }

    public static Matrix3 add(Matrix3 A, Matrix3 B) {
        double ab00 = A.m00 + B.m00;
        double ab01 = A.m01 + B.m01;
        double ab02 = A.m02 + B.m02;
        double ab10 = A.m10 + B.m10;
        double ab11 = A.m11 + B.m11;
        double ab12 = A.m12 + B.m12;
        double ab20 = A.m20 + B.m20;
        double ab21 = A.m21 + B.m21;
        double ab22 = A.m22 + B.m22;
        return new Matrix3(
                ab00, ab01, ab02,
                ab10, ab11, ab12,
                ab20, ab21, ab22);
    }

    public void sub(Matrix3 M) {
        this.m00 -= M.m00;
        this.m01 -= M.m01;
        this.m02 -= M.m02;
        this.m10 -= M.m10;
        this.m11 -= M.m11;
        this.m12 -= M.m12;
        this.m20 -= M.m20;
        this.m21 -= M.m21;
        this.m22 -= M.m22;
    }

    public static Matrix3 sub(Matrix3 A, Matrix3 B) {
        double ab00 = A.m00 - B.m00;
        double ab01 = A.m01 - B.m01;
        double ab02 = A.m02 - B.m02;
        double ab10 = A.m10 - B.m10;
        double ab11 = A.m11 - B.m11;
        double ab12 = A.m12 - B.m12;
        double ab20 = A.m20 - B.m20;
        double ab21 = A.m21 - B.m21;
        double ab22 = A.m22 - B.m22;
        return new Matrix3(
                ab00, ab01, ab02,
                ab10, ab11, ab12,
                ab20, ab21, ab22);
    }

    public void mul(double scalar) {
        this.m00 *= scalar;
        this.m01 *= scalar;
        this.m02 *= scalar;
        this.m10 *= scalar;
        this.m11 *= scalar;
        this.m12 *= scalar;
        this.m20 *= scalar;
        this.m21 *= scalar;
        this.m22 *= scalar;
    }

    public static Matrix3 mul(Matrix3 M, double scalar) {
        return new Matrix3(
                M.m00 * scalar, M.m01 * scalar, M.m02 * scalar,
                M.m10 * scalar, M.m11 * scalar, M.m12 * scalar,
                M.m20 * scalar, M.m21 * scalar, M.m22 * scalar);
    }

    public void mul(Matrix3 M) {
        Vector3 thisRowOne = new Vector3(entries[0]);
        Vector3 thisRowTwo = new Vector3(entries[1]);
        Vector3 thisRowThree = new Vector3(entries[2]);

        Vector3 mColOne = new Vector3(M.m00, M.m10, M.m20);
        Vector3 mColTwo = new Vector3(M.m01, M.m11, M.m21);
        Vector3 mColThree = new Vector3(M.m02, M.m12, M.m22);

        this.m00 = Vector3.dot(thisRowOne, mColOne);
        this.m01 = Vector3.dot(thisRowOne, mColTwo);
        this.m02 = Vector3.dot(thisRowOne, mColThree);
        this.m10 = Vector3.dot(thisRowTwo, mColOne);
        this.m11 = Vector3.dot(thisRowTwo, mColTwo);
        this.m12 = Vector3.dot(thisRowTwo, mColThree);
        this.m20 = Vector3.dot(thisRowThree, mColOne);
        this.m21 = Vector3.dot(thisRowThree, mColTwo);
        this.m22 = Vector3.dot(thisRowThree, mColThree);
    }

    public static Matrix3 mul(Matrix3 A, Matrix3 B) {
        Vector3 aRowOne = new Vector3(A.entries[0]);
        Vector3 aRowTwo = new Vector3(A.entries[1]);
        Vector3 aRowThree = new Vector3(A.entries[2]);

        Vector3 bColOne = new Vector3(B.m00, B.m10, B.m20);
        Vector3 bColTwo = new Vector3(B.m01, B.m11, B.m21);
        Vector3 bColThree = new Vector3(B.m02, B.m12, B.m22);

        return new Matrix3(
                Vector3.dot(aRowOne, bColOne), Vector3.dot(aRowOne, bColTwo), Vector3.dot(aRowOne, bColThree),
                Vector3.dot(aRowTwo, bColOne), Vector3.dot(aRowTwo, bColTwo), Vector3.dot(aRowTwo, bColThree),
                Vector3.dot(aRowThree, bColOne), Vector3.dot(aRowThree, bColTwo), Vector3.dot(aRowThree, bColThree));
    }

    public Matrix3 identity() {
        return new Matrix3();
    }

    public void toIdentity() {
        this.zero();
        this.m00 = 1.0;
        this.m11 = 1.0;
        this.m22 = 1.0;
    }

    public double determinant() {
        return (this.m00 * this.m11 - this.m01 * this.m10) * this.m22
                + (this.m02 * this.m10 - this.m00 * this.m12) * this.m21
                + (this.m01 * this.m12 - this.m02 * this.m11) * this.m20;
    }

    public Matrix3 transpose() {
        return new Matrix3(
                this.m00, this.m10, this.m20,
                this.m01, this.m11, this.m21,
                this.m02, this.m12, this.m22);
    }

    public void toTranspose() {
        this.set(
                this.m00, this.m10, this.m20,
                this.m01, this.m11, this.m21,
                this.m02, this.m12, this.m22);
    }

    public String toString() {
        String firstRow = this.m00 + " " + this.m01 + " " + this.m02;
        String secondRow = this.m10 + " " + this.m11 + " " + this.m12;
        String thirdRow = this.m20 + " " + this.m21 + " " + this.m22;
        return firstRow + "\n" + secondRow + "\n" + thirdRow + "\n";

    }

}
