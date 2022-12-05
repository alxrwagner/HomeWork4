public class Main {
    public static void main(String[] args) {
        task2();
        task3();
        task4();
    }

    public static void task1(){
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        float arr2[] = {1.57f, 7.654f, 9,986f};

        String names[] = {"Лера", "Кирилл", "Рина"};
    }

    public static void task2(){
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

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
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

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
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int number : arr) {
            if(number % 2 != 0){
                number +=1;
            }
            System.out.println(number);
        }
    }
}