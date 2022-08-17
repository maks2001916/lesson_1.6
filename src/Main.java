public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //первое задание
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int arrOne = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arrOne += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrOne + " рублей");
        //второе задание
        int arrTwo = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                arrTwo = arrTwo + arr[i];

            }
        }
        System.out.println(arrTwo);
        //
    }
}