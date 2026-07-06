public class MainVO {

    public static void main(String[] args) {

        int[] vector1 = {50, 100, 150, 200, 250};
        int[] vector2 = {5, 10, 15, 20, 25};

        int[] sumVector = VectorOperations.addVectors(vector1, vector2);
        int[] subtractionVector = VectorOperations.subtractVectors(vector1, vector2);
        int[] multiplicationVector = VectorOperations.multiplyVectors(vector1, vector2);
        int[] divisionVector = VectorOperations.divideVectors(vector1, vector2);
        int[] averageVector = VectorOperations.arithmeticMeanVectors(vector1, vector2);

        System.out.println("Vector 1: ");
        for (int i : vector1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Vector 2: ");
        for (int i : vector2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Sum: ");
        for (int i : sumVector) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Subtraction: ");
        for (int i : subtractionVector) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Multiplication: ");
        for (int i : multiplicationVector) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Division: ");
        for (int i : divisionVector) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Arithmetic Mean: ");
        for (int i : averageVector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
