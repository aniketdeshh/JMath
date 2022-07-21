package jmath;

public class Vector2 {

    public double x;
    public double y;

    // Constructors

    public Vector2() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Vector2(double xy) {
        this.x = xy;
        this.y = xy;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 v) {
        this.x = v.x;
        this.y = v.y;
    }

    public Vector2(double[] xy) {
        this.x = xy[0];
        this.y = xy[1];
    }

    // Operations

    public void sub(Vector2 v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public void sub(double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    public static Vector2 sub(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.x - v2.x, v1.y - v2.y);
    }

    public void add(Vector2 v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void add(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public static Vector2 add(Vector2 v1, Vector2 v2) {
        return new Vector2(v1.x + v2.x, v1.y + v2.y);
    }

    public void mul(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
    }

    public static Vector2 mul(Vector2 v, double scalar) {
        return new Vector2(v.x * scalar, v.y * scalar);
    }

    public void transform(Matrix2 M) {
        this.x = Vector2.dot(this, new Vector2(M.m00, M.m01));
        this.y = Vector2.dot(this, new Vector2(M.m10, M.m11));
    }

    public static Vector2 transform(Matrix2 M, Vector2 v) {
        return new Vector2(v.dot(M.m00, M.m01), v.dot(M.m10, M.m11));
    }

    public double dot(Vector2 v) {
        return this.x * v.x + this.y * v.y;
    }

    public double dot(double x, double y) {
        return this.x * x + this.y * y;
    }

    public static double dot(Vector2 v1, Vector2 v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }

    public void zero() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void negate() {
        this.x = -this.x;
        this.y = -this.y;
    }

    public void abs() {
        this.x = Math.abs(this.x);
        this.y = Math.abs(this.y);
    }

    public boolean equals(Vector2 other) {
        return this.x == other.x && this.y == other.y;
    }

    public boolean equals(double otherX, double otherY) {
        return this.x == otherX && this.y == otherY;
    }

    public static boolean equals(Vector2 v1, Vector2 v2) {
        return v1.x == v2.x && v1.y == v2.y;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public static double length(Vector2 v1) {
        return Math.sqrt(v1.x * v1.x + v1.y * v1.y);
    }

    public static double length(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Vector2 v) {
        double dx = this.x - v.x;
        double dy = this.y - v.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(Vector2 v1, Vector2 v2) {
        double dx = v1.x - v2.x;
        double dy = v1.y - v2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void normalize() {
        double mag = this.length();
        this.x /= mag;
        this.y /= mag;
    }

    public static Vector2 normalize(Vector2 v) {
        double mag = v.length();
        return new Vector2(v.x / mag, v.y / mag);
    }

}
