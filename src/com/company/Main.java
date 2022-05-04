package com.company;

public class Main {

    public static void main(String[] args) {
        int[] wages = generateRandomArray();
        //------------------------------------------------------------------------
        int a=0;
        for (int i = 0; i <wages.length; i++){
            a += wages[i];
        }
        System.out.format("Сумма трат за месяц составила %d рублей\n", a);
        //------------------------------------------------------------------------
        int min=1000000;
        int max=0;
        for (int i = 0; i <wages.length; i++){
            if(wages[i]>max){
                max=wages[i];
            }
            if(wages[i]<max){
                min=wages[i];
            }
        }
        System.out.format("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", min, max);
        //------------------------------------------------------------------------
        System.out.format("Средняя сумма трат за месяц составила %d рублей\n", a/30);
        //------------------------------------------------------------------------
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = 10; j > -1; j--){
            System.out.print(reverseFullName[j]);
        }
        //------------------------------------------------------------------------
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
