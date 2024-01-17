public class J013_Array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 }; // empiezan en 0, todos tienen que ser consistentes

        // Accessing elements of the array using indexes
        System.out.println(numbers[0]); // Output: 1
        System.out.println(numbers[2]); // Output: 3

        // Modifying elements of the array
        System.out.println(numbers[1]); // Output: 2
        numbers[1] = 10;
        System.out.println(numbers[1]); // Output: 10

        // Finding the length of the array
        int length = numbers.length;
        System.out.println(length); // Output: 5

        // Iterating over the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}