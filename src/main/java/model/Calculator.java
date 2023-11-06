package model;

public class Calculator {
    public static float floatAdd(float num1, float num2) throws IllegalArgumentException {
        if (num1 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come primo addendo.");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come secondo addendo.");
        }
        float result = num1 + num2;
        return result;
    }

    public static float floatSubtract(float num1, float num2) throws IllegalArgumentException {
        if (num1 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come minuendo.");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come sottraendo.");
        }
        float result = num1 - num2;
        return result;
    }

    public static float floatDivide(float num1, float num2) throws IllegalArgumentException {
        if (num1 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come dividendo.");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Impossibile dividere per 0.");
        }
        float result = num1 / num2;
        return result;
    }

    public static float floatMultiply(float num1, float num2) throws IllegalArgumentException {
        if (num1 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come moltiplicando.");
        }
        if (num2 == 0) {
            throw new IllegalArgumentException("Non puoi inserire 0 come moltiplicatore.");
        }
        float result = num1 * num2;
        return result;
    }
}
