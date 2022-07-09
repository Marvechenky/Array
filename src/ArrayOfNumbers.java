public class ArrayOfNumbers {
    public static void main(String[] args) {
        int total = 0;
        int [] myNumbers = {12, 14, 16, 18, 20, 22, 26, 28, 30, 32};
        for (int count = 0; count< myNumbers.length; count++){
            total += myNumbers[count];
        }

        System.out.printf("The sum of my array numbers is: %d%n", total);
    }
}
