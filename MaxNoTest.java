import java.util.Scanner;


public class MaxNoTest<T extends Comparable<T>> {

    //declaring instance variables
    Integer[] arrayOfInt;
    Float []  arrayOfFloat;
    String[] arrayOfString;

    public MaxNoTest(Integer[] arrayOfInt, Float[] arrayOfFloat, String[] arrayOfString) {
        this.arrayOfInt = arrayOfInt;
        this.arrayOfFloat = arrayOfFloat;
        this.arrayOfString = arrayOfString;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input for array size from user
        System.out.println("Enter the size of all three arrays : ");
        int size = scanner.nextInt();

        Integer[] a = new Integer[size];
        Float[] b = new Float[size];
        String[] c = new String[size];

        // getting user input for integer values
        System.out.println("Enter " + size + " Integer Values : ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        //getting user input for float values
        System.out.println("Enter " + size + " Float Values : ");
        for (int i = 0; i < size; i++) {
            b[i] = scanner.nextFloat();
        }

        // getting user input for string values
        System.out.println("Enter " + size + " String Values : ");
        for (int i = 0; i < size; i++) {
            c[i] = scanner.next();
        }

        new MaxNoTest(a, b, c).testMaximum();


    }

    private void testMaximum() {

        //passing instance variable to static testMaximum method
        Integer maxOfThreeInt = printMax(arrayOfInt);
        System.out.println("The maximum value of three integers is : " + maxOfThreeInt);

        Float maxOfThreeFloat = printMax(arrayOfFloat);
        System.out.println("The maximum value of three floats is : " + maxOfThreeFloat);

        String maxOfThreeString = printMax(arrayOfString);
        System.out.println("The maximum value of three string is : " + maxOfThreeString);
    }

    //displays maximum of three values
    static <T extends Comparable<T>> T printMax(T[] inputArray) {

        T max = inputArray[0];
        for (T t : inputArray) {
            if (t.compareTo(max) > 0)
                max = t;
        }
        return max;
    }
}
