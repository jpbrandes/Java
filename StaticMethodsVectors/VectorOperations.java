public class VectorOperations {

    int vector1[], vector2[];

    public VectorOperations(int vector1[], int vector2[]) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public static int[] addVectors(int vector1[], int vector2[]) {
        int sumVector[] = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            sumVector[i] = vector1[i] + vector2[i];
        }
        return sumVector;
    }

    public static int[] subtractVectors(int vector1[], int vector2[]) {
        int subtractionVector[] = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            subtractionVector[i] = vector1[i] - vector2[i];
        }
        return subtractionVector;
    }

    public static int[] multiplyVectors(int vector1[], int vector2[]) {
        int multiplicationVector[] = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            multiplicationVector[i] = vector1[i] * vector2[i];
        }
        return multiplicationVector;
    }

    public static int[] divideVectors(int vector1[], int vector2[]) {
        int divisionVector[] = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            if (vector2[i] != 0) {
                divisionVector[i] = vector1[i] / vector2[i];
            } else {
                System.out.println("Division by zero at index " + i);
                divisionVector[i] = 0; // Or some default value
            }
        }
        return divisionVector;
    }

    public static int[] arithmeticMeanVectors(int vector1[], int vector2[]) {
        int averageVector[] = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            averageVector[i] = (vector1[i] + vector2[i]) / 2;
        }
        return averageVector;
    }

    public static int[] displayVectors(int vector1[], int vector2[]) {
        int displayVector[] = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            displayVector[i] = vector1[i];
        }
        for (int i = 0; i < vector2.length; i++) {
            displayVector[i] = vector2[i];
        }
        return displayVector;
    }

    public static int[] sequentialSearch(int vector[], int value) {
        int result[] = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == value) {
                result[i] = i; // Returns the index where the value was found
            } else {
                result[i] = -1; // Indicates that the value was not found
            }
        }
        return result;
    }
}
