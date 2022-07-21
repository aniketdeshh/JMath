package jmath;

public class Utils {

    public static final double E = Math.E;

    public static double sqrt(double n) {
        return Math.sqrt(n);
    }

    public static double invSqrt(double n) {
        return 1.0 / Math.sqrt(n);
    }

    public static double abs(double n) {
        return Math.abs(n);
    }

    public static double max(double m, double n) {
        return Math.max(m, n);
    }

    public static double floor(double n) {
        return Math.floor(n);
    }

    public static double ceil(double n) {
        return Math.ceil(n);
    }

    public static double round(double n) {
        return Math.round(n);
    }

    public static boolean isFinite(double n) {
        return Utils.abs(n) < Double.MAX_VALUE;
    }

    public static double fma(double a, double b, double c) {
        return (double) a * b + c;
    }

    public static double lerp(double a, double b, double t) {
        return Utils.fma(b - a, t, a);
    }

}
