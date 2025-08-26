package ru;

public class Main {
    public static void main(String[] args) {

        /*Java. Условия*/

        //Задача 6
        /*Тройная сумма. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал true, если два любых числа (из трех принятых) можно сложить так, чтобы получить третье.*/


        /*
        //Задача 5
        Тройной максимум. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел. Подсказка: идеальное решение включает всего две инструкции if и не содержит вложенных if. При реализации метода не использовать методы класса Math.

        System.out.println(max3(5,7,7));
        System.out.println(max3(8,-1,4));
        System.out.println(max3(-10,-8,-1));

        //Задача 4
        Строка сравнения. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал строку, которая включает два принятых методом числа и корректно выставленный знак операции сравнения (больше, меньше, или равно).

        System.out.println(makeDecision(5,7));
        System.out.println(makeDecision(8,-1));
        System.out.println(makeDecision(4,4));

        //Задача 3
        Максимум. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал максимальное значение из двух полученных методом чисел. При реализации метода не использовать методы класса Math.

        System.out.println(max(5,7));
        System.out.println(max(8,-1));
        System.out.println(max(0,0));

        //Задача 2
        Безопасное деление. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал деление x на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При делении на 0 следует вернуть из метода число 0. Подсказка: смотри ограничения на операции типов данных.

        System.out.println(safeDiv(5,0));
        System.out.println(safeDiv(8,2));
        System.out.println(safeDiv(0,0));

        //Задача 1
        Модуль числа. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х (если он был положительным, то таким и остается, если он был отрицательным – то необходимо вернуть его без знака минус). При реализации метода не использовать методы класса Math.

        System.out.println(abs(5));
        System.out.println(abs(-3));
         */

        /*Java. Классы и методы*/
        /*
        //Задача10 (Вариант решения 1)
        int res = lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1);
        System.out.println(res);

        //Задача10 (Вариант решения 2)
        System.out.println(lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1));

        //Задача10
        Многократный вызов. Дан следующий метод:
        Выполните с его помощью последовательное сложение пяти чисел: 5, 11, 123, 14, 1, и результат выведите на экран. Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.
        Ответом на данное задание является код метода main, в котором происходит вызов данной функции.
        Решение выполняется в таком порядке:
        5+11 это 6
        6+123 это 9
        9+14 это 13
        13+1 это 4
        Итого 4

        int res = lastNumSum(5,11);
        res = lastNumSum(res,123);
        res = lastNumSum(res,14);
        res = lastNumSum(res,1);
        System.out.println(res);

        //Задача9
        Равенство. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал true если все три полученных методом числа равны

        System.out.println(isEqual(3,3,3));
        System.out.println(isEqual(2,15,2));

        //Задача8
        Делитель. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из принятых чисел делит другое нацело.

        System.out.println(isDivisor(3,6));
        System.out.println(isDivisor(2,15));

        //Задача7
        Диапазон. Дана следующая сигнатура метода:
        Метод принимает левую и правую границу [a и b] некоторого числового диапазона. Необходимо реализовать метод таким образом, чтобы он возвращал true, если num входит в указанный диапазон (включая границы). Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а кто меньше)

        System.out.println(isInRange(1, 5, 4));
        System.out.println(isInRange(1, 5, 6));
        System.out.println(isInRange(1, 5, -1));

        //Задача6
        Большая буква. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true если это большая буква в диапазоне от ‘A’ до ‘Z’. При реализации метода не использовать методы класса Character.

        System.out.println(isUpperCase('A'));
        System.out.println(isUpperCase('a'));

        //Задача5
        Двузначное. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он принимал положительное число x и возвращал true если оно двузначное.

        System.out.println(is2Digits(10));
        System.out.println(is2Digits(100));
        System.out.println(is2Digits(-99));

        //Задача4
        Есть ли позитив. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.

        System.out.println(isPositive(0.01));

        //Задача3
        Букву в число. Дана следующая сигнатура метода:
        Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число. При реализации метода не использовать методы класса Character. Подсказка: код символа ‘0’ — это число 48

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
        Сумма знаков. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х, предполагая, что знаков в числе не менее двух. Подсказки:

        System.out.println(sumLastNums(4568));
        --
        //Задача 1
        Дробная часть. Дана следующая сигнатура метода:
        Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х. При выводе результата необходимо обеспечить точность вычислений — три знака после запятой Подсказка: вещественное число может быть преобразовано к целому путем отбрасывания дробной части.

        System.out.println(fraction(12.1234));
        System.out.println(fraction(15.789));
        System.out.println(fraction(-13.123));
        System.out.println(fraction(0.002));*/
    }

    /*Java. Классы и методы*/
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

    /*Java. Условия*/

    //Задача 1
    public static int abs(int x) {
        if (x >= 0) return x;
        return -x;
    }

    //Задача 2
    public static int safeDiv(int x, int y){
        if (y != 0) return x / y;
        return 0;
    }

    //Задача 3
    public static int max(int x, int y){
        return x > y ? x : y;
    }

    //Задача 4
    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "=" + y;
        }
    }

    //Задача 5
    public static int max3(int x, int y, int z){
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
}