package context;

public class Context {

    public static final double constant = 3.45;
    public static double variableStatic = 2.45;

    public static double method(int value) {
        return value * constant;
    }

    public double useConstant(int value) {
        return value + constant;
    }

    public double useStatic(int value) {
        return value - variableStatic;
    }

    public double useStaticMethod(int value) {
        return method(value);
    }
}