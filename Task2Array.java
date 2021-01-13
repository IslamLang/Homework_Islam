public class Task2Array {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] fruits = {"Orange", "Pineapple", "Peach", "Pear", "Mango", "Strawberry"};

        outputEachElement(numbers, fruits);
        sumSmallestAndLargest(numbers);
        lengthOfEachElement(fruits);
        sumOfElementsAndIndexes(fruits);

    }
//      1. Create a function, that will output each element of both arrays.

    public static void outputEachElement(Integer[] numbers, String[] fruits) {

        for (int number : numbers) {              // for each loop
            System.out.println(number);
        }

        for (String word : fruits) {
            System.out.println(word);
        }

    }
//      2. Create a function, that will output the sum of smallest and largest number from Array of numbers
//      (you can use Loops or directly call elements of array using index)

    public static void sumSmallestAndLargest(Integer[] numbers) {

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest)
                largest = numbers[i];
        }
        System.out.println(smallest + largest);

    }

//      3. Create a function, that will output the length of each element from Array of Strings
//      (use Loops, but I will take a look to other approaches)

    public static void lengthOfEachElement(String[] fruits) {

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String word : fruits) {
            System.out.println(word);
        }
    }
//    OPTIONAL: Create a function, that will output the index of each element from Array of Strings.
//    Than find the sum of lengths of each element and sum of indexes. Compare two sums and print the largest one.

    public static void sumOfElementsAndIndexes(String[] fruits) {

        int index = 0;

        while (index < fruits.length) {
            System.out.println(index);
            index++;
        }
        System.out.println(index + fruits.length);

        if (index > fruits.length) {
            System.out.println(index);
        } else if (fruits.length > index) {
            System.out.println(fruits.length);
        } else {
            System.out.println("There are equal");

        }

    }

}


