import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        System.out.println("Задача № 1");

        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        float arr2[] = {1.57f, 7.654f, 9,986f};

        String names[] = {"Лера", "Кирилл", "Рина"};
    }

    public static void task2(){
        System.out.println("Задача № 2");

        int arr[] = new int[]{1, 2, 3};

        float arr2[] = {1.57f, 7.654f, 9,986f};

        String names[] = {"Лера", "Кирилл", "Рина"};


        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++){

            System.out.print(arr2[i]);
            if(i < arr2.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        int count = 0;
        while (count < names.length){
            System.out.print(names[count]);

            if(count < names.length - 1){
                System.out.print(", ");
            }
            count++;
        }

        System.out.println();
    }

    public static void task3(){
        System.out.println("Задача № 3");

        int arr[] = new int[]{1, 2, 3};

        float arr2[] = {1.57f, 7.654f, 9,986f};

        String names[] = {"Лера", "Кирилл", "Рина"};


        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[arr.length - i - 1]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for(int i = 0; i < arr2.length; i++){

            System.out.print(arr2[arr2.length - i - 1]);
            if(i < arr2.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        int count = 0;
        while (count < names.length){
            System.out.print(names[names.length - count - 1]);

            if(count < names.length - 1){
                System.out.print(", ");
            }
            count++;
        }

        System.out.println();
    }

    public static void task4(){
        System.out.println("Задача № 4");

        int arr[] = new int[]{1, 2, 3};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task5(){
        System.out.println("Задача № 5");

        int[] accountingBook = generateRandomArray();
        int costAmountPerMonth = 0;

        for(int cost : accountingBook){
            costAmountPerMonth += cost;
        }
        System.out.println("Сумма затрат за месяц составила: " + costAmountPerMonth);
    }

    public static void task6(){
        System.out.println("Задача № 6");

        int[] accountingBook = generateRandomArray();
        int minValue = 0;
        int maxValue = 0;

        Arrays.sort(accountingBook);
        minValue = accountingBook[0];
        maxValue = accountingBook[accountingBook.length - 1];

        System.out.println("Минимальная сумма трат за день составила: " + minValue + " рублей. " +
                "Максимальная сумма трат за день составила: " + maxValue + " рублей");
    }

    public static void task7(){
        System.out.println("Задача № 7");

        int[] accountingBook = generateRandomArray();

        int totalAmount = 0;

        float averageAmount = 0f;

        for(int amount : accountingBook){
            totalAmount += amount;
        }

        averageAmount = (float) totalAmount / accountingBook.length;

        System.out.println("Средняя сумма трат за месяц составила: " + averageAmount + " рублей");
    }

    public static void task8(){
        System.out.println("Задача № 8");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] doubleReverseFullName = new char[reverseFullName.length];
        int indexOfDoubleRevers = 0;

        for (int i = reverseFullName.length - 1; i >= 0; i--){
            doubleReverseFullName[indexOfDoubleRevers] = reverseFullName[i];
            indexOfDoubleRevers++;
        }

        reverseFullName = Arrays.copyOf(doubleReverseFullName, doubleReverseFullName.length);
        System.out.println(Arrays.toString(reverseFullName));

    }
}