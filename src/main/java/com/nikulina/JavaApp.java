package com.nikulina;

import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {
        System.out.println("Примитивные типы данных:");
        char symbol;
        boolean flag=true;
        byte aByteValue;            // -128 to 127      -> 1 byte
        System.out.println("Тип byte в диапазоне -128 до 127");
        short aShortValue;          // -32768 to 32767  -> 2 bytes
        System.out.println("Тип short в диапазоне -32768 до 32767");
        int anIntegerValue;         // -2147483648 to 2147483647 -> 4 bytes
        System.out.println("Тип int в диапазоне -2147483648 до 2147483647");
        long aLongValue;            // –9 223 372 036 854 775 808 to 9 223 372 036 854 775 807 -> 8 bytes
        System.out.println("Тип long в диапазоне –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807");
        float aFloat;               // -3.4*1038 to 3.4*1038 -> 4 bytes
        System.out.println("Тип float в диапазоне -3.4*1038 до 3.4*1038");
        double aDouble;             //±4.9*10-324 to ±1.8*10308 -> 8 bytes
        System.out.println("Тип double в диапазоне ±4.9*10-324 to ±1.8*10308");

        boolean letsContinue = true;

        while (letsContinue) {
            System.out.println("\nВведите любую числовую последовательность, а я попробую угадать её тип. \nМожно использовать точку в качестве разделителя.");
            System.out.print("Ваше число: ");
            Scanner input = new Scanner(System.in); // Объявляем Scanner

            String str = new String(input.next());
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count++;
            }
            System.out.println("Длина введённой последовательности: " + count + " символов.");

            try {
                aByteValue = Byte.parseByte(str);
                System.out.println(aByteValue + " это byte");
            } catch (Exception e) {
                try {
                    aShortValue = Short.parseShort(str);
                    System.out.println(aShortValue + " это short");
                } catch (Exception ex) {
                    try {
                        anIntegerValue = Integer.parseInt(str);
                        System.out.println(anIntegerValue + " это int");
                    } catch (Exception exe) {
                        try {
                            aLongValue = Long.parseLong(str);
                            System.out.println(aLongValue + " это long");
                        } catch (Exception exept) {
                            try {
                                aFloat = Float.parseFloat(str);
                                System.out.println(aFloat + " это float");
                            } catch (Exception exepti) {
                                try {
                                    aDouble = Double.parseDouble(str);
                                    System.out.println(aDouble + " это double");
                                } catch (Exception exeptio) {
                                    System.out.println(str + " это просто строка");
                                }
                            }
                        }
                    }
                }
            }
            System.out.print("Eщё разок? (y/n) ");
            String st = input.next();
            if (!(st.equals("y"))) {
                System.out.println("Вы ответили нет%(");
                letsContinue=false;
            }
        }

        //Массивы: просто сортировка
        int[] arr = new int[] {8, 4, 11, 36, 90, 34, 41, -4, 6, 55, 20, -7};
        System.out.print("\nДан массив чисел: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\nОтсортировали его: ");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
