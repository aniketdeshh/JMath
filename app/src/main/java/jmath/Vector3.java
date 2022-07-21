package jmath;

public class Vector3 {

    public double x;
    public double y;
    public double z;

    // Constructors

    public Vector3() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Vector3(double xyz) {
        this.x = xyz;
        this.y = xyz;
        this.z = xyz;
    }

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(Vector3 v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }

    public Vector3(double[] xyz) {
        this.x = xyz[0];
        this.y = xyz[1];
        this.z = xyz[2];
    }

    // Operations

    public void sub(Vector3 v) {
        this.x -= v.x;
        this.y -= v.y;
        this.z -= v.z;
    }

    public void sub(double x, double y, double z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
    }

    public static Vector3 sub(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    public void add(Vector3 v) {
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
    }

    public void add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    public static Vector3 add(Vector3 v1, Vector3 v2) {
        return new Vector3(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public void mul(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    public static Vector3 mul(Vector3 v, double scalar) {
        return new Vector3(v.x * scalar, v.y * scalar, v.z * scalar);
    }

    public void transform(Matrix3 M) {
        this.x = Vector3.dot(this, new Vector3(M.m00, M.m01, M.m02));
        this.y = Vector3.dot(this, new Vector3(M.m10, M.m11, M.m12));
        this.z = Vector3.dot(this, new Vector3(M.m20, M.m21, M.m22));
    }

    public static Vector3 transform(Matrix3 M, Vector3 v) {
        return new Vector3(v.dot(M.m00, M.m01, M.m02), v.dot(M.m10, M.m11, M.m12), v.dot(M.m20, M.m21, M.m22));
    }

    public double dot(Vector3 v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public double dot(double x, double y, double z) {
        return this.x * x + this.y * y + this.z * z;
    }

    public static double dot(Vector3 v1, Vector3 v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    public Vector3 cross(Vector3 v) {
        double xVal = this.y * v.x - this.z * v.y;
        double yVal = this.x * v.z - this.z * v.x;
        double zVal = this.x * v.y - this.y * v.x;
        return new Vector3(xVal, yVal, zVal);
    }

    public static Vector3 cross(Vector3 u, Vector3 v) {
        double xVal = u.y * v.z - u.z * v.y;
        double yVal = u.x * v.z - u.z * v.x;
        double zVal = u.x * v.y - u.y * v.x;
        return new Vector3(xVal, yVal, zVal);
    }

    public void zero() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public void negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }

    public void abs() {
        this.x = Math.abs(this.x);
        this.y = Math.abs(this.y);
        this.z = Math.abs(this.z);

    }

    public boolean equals(Vector3 other) {
        return this.x == other.x && this.y == other.y && this.z == other.z;
    }

    public boolean equals(double otherX, double otherY, double otherZ) {
        return this.x == otherX && this.y == otherY && this.z == otherZ;
    }

    public static boolean equals(Vector3 v1, Vector3 v2) {
        return v1.x == v2.x && v1.y == v2.y && v1.z == v2.z;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public static double length(Vector3 v1) {
        return Math.sqrt(v1.x * v1.x + v1.y * v1.y + v1.z * v1.z);
    }

    public double distance(Vector3 v) {
        double dx = this.x - v.x;
        double dy = this.y - v.y;
        double dz = this.z - v.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static double distance(Vector3 v1, Vector3 v2) {
        double dx = v1.x - v2.x;
        double dy = v1.y - v2.y;
        double dz = v1.z - v2.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public void normalize() {
        double mag = this.length();
        this.x /= mag;
        this.y /= mag;
        this.z /= mag;
    }

    public static Vector3 normalize(Vector3 v) {
        double mag = v.length();
        return new Vector3(v.x / mag, v.y / mag, v.z / mag);
    }

}
