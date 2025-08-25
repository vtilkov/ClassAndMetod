package ru;

public class Main {
    public static void main(String[] args) {
        //Задача10
        int res = lastNumSum(5,11);
        res = lastNumSum(res,123);
        res = lastNumSum(res,14);
        res = lastNumSum(res,1);
        System.out.println(res);
        /*
        //Задача9
        System.out.println(isEqual(3,3,3));
        System.out.println(isEqual(2,15,2));
        //Задача8
        System.out.println(isDivisor(3,6));
        System.out.println(isDivisor(2,15));
        //Задача7
        System.out.println(isInRange(1, 5, 4));
        System.out.println(isInRange(1, 5, 6));
        System.out.println(isInRange(1, 5, -1));
        //Задача6
        System.out.println(isUpperCase('A'));
        System.out.println(isUpperCase('a'));
        //Задача5
        System.out.println(is2Digits(10));
        System.out.println(is2Digits(100));
        System.out.println(is2Digits(-99));
        //Задача4
        System.out.println(isPositive(0.01));
        //Задача3
        System.out.println(charToNum('0'));
        System.out.println(charToNum('1'));
        System.out.println(charToNum('2'));
        System.out.println(charToNum('3'));
        System.out.println(charToNum('4'));
        System.out.println(charToNum('5'));
        System.out.println(charToNum('6'));
        System.out.println(charToNum('7'));
        System.out.println(charToNum('8'));
        System.out.println(charToNum('9'));
        System.out.println(charToNum('A'));
        --
        //Задача 2
        System.out.println(sumLastNums(4568));
        --
        //Задача 1
        System.out.println(fraction(12.1234));
        System.out.println(fraction(15.789));
        System.out.println(fraction(-13.123));
        System.out.println(fraction(0.002));*/
    }
    //Задание 1
    public static double fraction(double x) {
        //полчаем целую часть
        int intPart = (int) x;
        //вычислим дробную часть
        double doublePart = x - intPart;

        //округляем до 3-х знаком после запятой
        return Math.round(doublePart*1000.0)/1000.0;
    }

    //Задание 2
    public static int sumLastNums(int x) {
        // Абсолютное значение, чтобы работать с int
        int absX = Math.abs(x);
        //Два крайних числа
        int one = absX % 10;
        int two = (absX/10) % 10;

        //Сложить два числа
        return one+two;
    }

    public static int charToNum(char x) {
        if (x>='0' && x <= '9') {
            return x - '0';
            //Подсказка: код символа ‘0’ — это число 48
        } else {
            throw new IllegalArgumentException("Символ должен быть от 0 до 9");
        }
    }

    //Задание4
    public static boolean isPositive(double x){
        return x>0.0;
    }

    //Задание5
    public static boolean is2Digits(int x){
        if (x <= 0) {
            return false;
        }
        return x>=10 && x <=99;
    }

    //Задание6
    public static boolean isUpperCase(char x){
        return x>= 'A' && x<= 'Z';
    }

    //Задача7
    public static boolean isInRange(int a, int b, int num){
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        return num >= min && num <= max;
    }

    //Задача8
    public static boolean isDivisor (int a, int b){
        if (a ==0 || b ==0) {
            return false; //делить на ноль нельзя
        }
        return a % b ==0 || b % a ==0;
    }

    //Задача9
    public static boolean isEqual (int a, int b, int c){
        return a == b && b == c;
    }

    //Задача10
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}