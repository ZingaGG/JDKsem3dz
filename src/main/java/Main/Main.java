package Main;

import Pair.Pair;
import calc.Calculator;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("Task 1");
            double a = 10.0;
            double b = 2;
            System.out.println(Calculator.divide(a,b));
            System.out.println(Calculator.sum(a,b));
            System.out.println(Calculator.multiply(a,b));
            System.out.println(Calculator.subtract(a,b));

            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println();
        }

        {
            System.out.println("Task 2");
            Integer[] array1 = {1, 2, 3, 4, 5};
            Integer[] array2 = {1, 2, 3, 4, 5};
            Integer[] array3 = {1, 2, 3, 4, 6};

            System.out.println(compareArrays(array1, array2));
            System.out.println(compareArrays(array1, array3));

            String[] strArray1 = {"apple", "banana", "orange"};
            String[] strArray2 = {"apple", "banana", "orange"};
            String[] strArray3 = {"apple", "banana", "grape"};

            System.out.println(compareArrays(strArray1, strArray2));
            System.out.println(compareArrays(strArray1, strArray3));

            Object[] objArray1 = {1, "two", 3.0, true};
            Object[] objArray2 = {1, "two", 3.0, true};
            Object[] objArray3 = {1, 2, "two", true};

            System.out.println(compareArrays(objArray1, objArray2));
            System.out.println(compareArrays(objArray1, objArray3));

            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println();
        }

        {
            System.out.println("Task 3");

            Pair pair = new Pair<>("String", 2);
            System.out.println("First value = " + pair.getFirst());
            System.out.println("Second value = " + pair.getSecond());
            System.out.println(pair.toString());

            System.out.println();
            System.out.println("---------------------------------------");
            System.out.println();
        }
    }

    public static boolean compareArrays(Object[] a, Object[] b){

        if(a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if(!(a.getClass().equals(b.getClass()))){
                return false;
            }

            if (!(a[i].equals(b[i]))){
                return false;
            }
        }

        return true;
    }
}
