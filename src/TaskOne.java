import java.util.Arrays;
public class TaskOne {
    public static void run() {
        System.out.println("========================================================");
        System.out.println("Задание 1");
        System.out.println("========================================================");
        swapIntArr();
        swapDoubleArr();
        swapStringArr();
    }

    private static void swapIntArr() {
        Integer[] arr = {1, 2, 3, 4};
        System.out.println("Массив целых");
        System.out.println(Arrays.stream(arr).toList().toString());
        try {
            System.out.println(Arrays.stream(swap(arr, 1, 2)).toList().toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        }
    }
    private static void swapDoubleArr() {
        Double[] arr = {1.1, 2.2, 3.3, 4.4};
        System.out.println("Массив десятичных");
        System.out.println(Arrays.stream(arr).toList().toString());
        try {
            System.out.println(Arrays.stream(swap(arr, 0, 1)).toList().toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        }

    }
    private static void swapStringArr() {
        String[] arr = {"A", "B", "C", "D"};
        System.out.println("Массив строк");
        System.out.println(Arrays.stream(arr).toList().toString());
        try {
            System.out.println(Arrays.stream(swap(arr, 0, 3)).toList().toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        }

    }

    private static Object[] swap(Object[] arr, int i, int j) throws ArrayIndexOutOfBoundsException {
        Object obj = arr[j];
        arr[j] = arr[i];
        arr[i] = obj;
        return arr;
    }
}

