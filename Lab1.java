import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
import java.util.Random;

public class Lab1 {
    Scanner scanner = new Scanner(System.in);

    public int inputInt(){
        int number;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;

            } else {
                System.out.print("Ошибка! Введите целое число: ");
                scanner.next();
            }
        }
        return number;
    }

    public int sumLastNums(int x) {
        return x % 10 + ((x / 10) % 10);
    }

    public void task1() {
        int x;
        System.out.println("Задание 1");
        while (true) {
            System.out.print("Введите число x (больше 2 цифр): ");
            x = inputInt();
            if (x / 10 > 0) {
                break;
            }
        }
        System.out.println("Сумма двух последних цифр = " + sumLastNums(x));
    }

    public boolean isPositive(int x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void task2() {
        System.out.println("Задание 2");
        System.out.print("Введите число x: ");
        int x = inputInt();
        System.out.println("Число положительное: " + isPositive(x));
    }

    public boolean isUpperCase(char x) {
        if ((int) x >= 65 && (int) x <= 90) {
            return true;
        } else {
            return false;
        }
    }

    public void task3() {
        System.out.println("Задание 3");
        System.out.print("Введите символ: ");
        char x = scanner.next().charAt(0);
        System.out.println("Символ от A до Z: " + isUpperCase(x));
    }

    public boolean isDivisor(int a, int b) {
        if (a % b == 0 || b % a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void task4() {
        System.out.println("Задание 4");
        System.out.print("Введите число a: ");
        int a = inputInt();
        System.out.print("Введите число b: ");
        int b = inputInt();
        System.out.println("Одно из чисел делит нацело другое: " + isDivisor(a, b));
    }

    public int lastNumSum(int a, int b) {
        a = a % 10 + b % 10;
        return a;
    }

    public void task5() {
        System.out.println("Задание 5");
        System.out.print("Введите 1 число: ");
        int a = inputInt();
        int b = 0;
        for (int i = 2; i <= 5; i++) {
            System.out.print("Введите " + i + " число: ");
            b = inputInt();
            a = lastNumSum(a,b);
        }
        System.out.println("Итого: " + a);
        System.out.println("Последовательное сложение цифр двух чисел из разряда единиц");
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            double x1 = x;
            double y1 = y;
            if (x == 0 || y == 0) {
                return 0;
            }
            else {
                return x1 / y1;
            }
        }
    }

    public void task6() {
        System.out.println("Задание 6");
        System.out.print("Введите число x: ");
        int x = inputInt();
        System.out.print("Введите число y: ");
        int y = inputInt();
        System.out.println("x / y = " + safeDiv(x, y));
    }

    public String makeDecision(int x, int y) {
        String str = "";
        if (x == y) {
            str = x + " == " + y;
        }
        if (x > y) {
            str = x + " > " + y;
        }
        if (x < y) {
            str = x + " < " + y;
        }
        return str;
    }

    public void task7() {
        System.out.println("Задание 7");
        System.out.print("Введите число x: ");
        int x = inputInt();
        System.out.print("Введите число y: ");
        int y = inputInt();
        System.out.println(makeDecision(x, y));
    }

    public boolean sum3(int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        } else {
            return false;
        }
    }

    public void task8() {
        System.out.println("Задание 8");
        System.out.print("Введите число x: ");
        int x = inputInt();
        System.out.print("Введите число y: ");
        int y = inputInt();
        System.out.print("Введите число z: ");
        int z = inputInt();
        System.out.println("Сумма двух любых чисел равна третьему: " + sum3(x, y, z));
    }

    public String age(int x) {
        String str = "";
        if (x % 10 == 1 && x != 11) {
            str = x + " год";
        } else {
            if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 != 12) && (x % 100 != 13) && (x % 100 != 14)) {
                str = x + " года";
            } else {
                str = x + " лет";
            }
        }
        return str;
    }

    public void task9() {
        System.out.println("Задание 9");
        System.out.print("Введите число x: ");
        int x = inputInt();
        System.out.println(age(x));
    }

    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;

        }
    }

    public void task10() {
        System.out.println("Задание 10");
        System.out.print("Введите день недели (словом): ");
        String x = scanner.next();
        printDays(x);
    }

    public String reverseListNums(int x) {
        String str = "";
        for (int i = x; i >= 0; i--) {
            str = str + Integer.toString(i) + " ";
        }
        return str;
    }

    public void task11() {
        System.out.println("Задание 11");
        int x;
        while (true) {
            System.out.print("Введите число x ( больше 0 ): ");
            x = inputInt();
            if (x >= 0) {
                break;
            }
        }
        System.out.println("Строка чисел от x до 0");
        System.out.println(reverseListNums(x));
    }

    public int pow(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            int p = x;
            for (int i = 2; i <= y; i++) {
                p = p * x;
            }
            return p;
        }
    }

    public void task12() {
        System.out.println("Задание 12");
        System.out.print("Введите число x: ");
        int x = inputInt();
        int y;
        while (true) {
            System.out.print("Введите число y ( больше 0 ): ");
            y = inputInt();
            if (y >= 0) {
                break;
            }
        }
        System.out.println("x ^ y = " + pow(x, y));
    }

    public boolean equalNum(int x) {
        boolean flag = true;
        while (x / 10 != 0) {
            if (x % 10 != (x / 10) % 10) {
                flag = false;
                break;
            }
            x = x / 10;
        }
        return flag;
    }

    public void task13() {
        System.out.println("Задание 13");
        System.out.print("Введите число x: ");
        int x = inputInt();
        System.out.println("Все цифры числа одинаковые: " + equalNum(x));
    }

    public void leftTriangle(int x) {
        String out = "";
        for (int i = 0; i < x; i++) {
            out += "*";
            System.out.println(out);
        }
    }

    public void task14() {
        System.out.println("Задание 14");
        int x;
        while (true) {
            System.out.print("Введите число x ( больше 0 ): ");
            x = inputInt();
            if (x >= 0) {
                break;
            }
        }
        System.out.println("Построение треугольника из * высоты " + x);
        leftTriangle(x);
    }

    public void guessGame() {
        Random random = new Random();
        int randomInt = random.nextInt(0, 10);
        int count = 0;
        int x;
        while (true) {
            while (true) {
                System.out.print("Введите число от 0 до 9: ");
                x = inputInt();
                if (x >= 0 && x <= 9) {
                    break;
                }
            }
            count++;
            if (x == randomInt) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + count + " попытки");
                break;
            } else {
                System.out.print("Вы не угадали( ");
            }
        }
    }

    public void task15() {
        System.out.println("Задание 15");
        System.out.println("Отгадайте число");
        guessGame();
    }

    public int findLast(int[] arr, int x) {
        int result = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }
    public void task16() {
        System.out.println("Задание 16");
        int size;
        while (true) {
            System.out.print("Введите размер массива (больше 1): ");
            size = inputInt();
            if (size >= 1) {
                break;
            }
        }
        int[] arr = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr[i - 1] = inputInt();
        }
        System.out.print("Введите искомое число х: ");
        int x = inputInt();
        System.out.println("Индекс последнего вхождения x (-1 - число не входит): " + findLast(arr, x));
    }

    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        newArr[pos] = x;
        int i = 0;
        for (int j = 0; j <= arr.length; j++) {
            if (j != pos) {
                newArr[j] = arr[i];
                i++;
            }
        }
        return newArr;
    }

    public void task17() {
        System.out.println("Задание 17");
        int size;
        while (true) {
            System.out.print("Введите размер массива (больше 1): ");
            size = inputInt();
            if (size >= 1) {
                break;
            }
        }
        int[] arr = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr[i - 1] = inputInt();
        }
        int pos;
        while (true) {
            System.out.print("Введите позицию вставляемого числа (от 0 до " + size + "): ");
            pos = inputInt();
            if (pos >= 0 && pos <= size) {
                break;
            }
        }
        System.out.print("Введите вставляемое число x: ");
        int x = inputInt();
        int[] newArr = new int[size + 1];
        newArr = add(arr, x, pos);
        System.out.println("Новый массив: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public void reverse(int[] arr) {
        int reverse;
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            reverse = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = reverse;
        }
    }

    public void task18() {
        System.out.println("Задание 18");
        int size;
        while (true) {
            System.out.print("Введите размер массива (больше 1): ");
            size = inputInt();
            if (size >= 1) {
                break;
            }
        }
        int[] arr = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr[i - 1] = inputInt();
        }
        reverse(arr);
        System.out.println("Обратный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[i + arr1.length] = arr2[i];
        }
        return newArr;
    }

    public void task19() {
        System.out.println("Задание 19");
        int size1;
        while (true) {
            System.out.print("Введите размер массива 1 (больше 1): ");
            size1 = inputInt();
            if (size1 >= 1) {
                break;
            }
        }
        int[] arr1 = new int[size1];
        for (int i = 1; i <= size1; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr1[i - 1] = inputInt();
        }
        int size2;
        while (true) {
            System.out.print("Введите размер массива 2 (больше 1): ");
            size2 = inputInt();
            if (size2 >= 1) {
                break;
            }
        }
        int[] arr2 = new int[size2];
        for (int i = 1; i <= size2; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr2[i - 1] = inputInt();
        }
        int[] newArr = new int[size1 + size2];
        newArr = concat(arr1, arr2);
        System.out.println("Новый массив: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] >= 0){
                count++;
            }
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] >= 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
    public void task20() {
        System.out.println("Задание 20");
        int size;
        while (true) {
            System.out.print("Введите размер массива (больше 1): ");
            size = inputInt();
            if (size >= 1) {
                break;
            }
        }
        int[] arr = new int[size];
        for (int i = 1; i <= size; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            arr[i - 1] = inputInt();
        }
        int[] newArr = new int[size];
        newArr = deleteNegative(arr);
        System.out.println("Массив без отрицательных чисел: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
