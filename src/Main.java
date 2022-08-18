public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int [] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //первое задание
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arrOne = 0;
        for (int i = 0; i < arr.length; i++) {
            arrOne += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrOne + " рублей");
        //второе задание
        int arrTwo = arr[0];
        int arrThree = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arrTwo > arr[i]) {
                arrTwo = arr[i];

            }
            if (arrThree < arr[i]) {
                arrThree = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + arrTwo + " рублей. Максимальная сумма трат за день составила " + arrThree + " рублей");
        //Третье задание
        float division = 0;
        division = arrOne / arr.length;
        System.out.println("Средняя сумма затрат за месяц составила " + division + " рублей");
        //Четвёртое задание
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
    }