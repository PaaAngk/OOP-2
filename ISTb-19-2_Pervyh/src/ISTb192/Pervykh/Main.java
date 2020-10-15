package ISTb192.Pervykh;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вывод первой программы: ");
        Programm1();
        System.out.println();
        System.out.println("Вывод второй программы: ");
        Programm2();
        System.out.println();
        System.out.println("Вывод третьей программы: ");
        Programm3();
        System.out.println();
        Constructor();
    }

    static void Programm1() {
        Digit pr1 = new Digit(30);
        System.out.println("Данный ряд:");
        pr1.Print(pr1.naturalRyadx2(30));// Создание натурального ряда
        System.out.println();
        System.out.println("Четные: ");
        pr1.Print(pr1.p1(30, 1));// Вывод четных элементов массива pr1
        System.out.println();
        System.out.println("Нечетные: ");
        pr1.Print(pr1.p1(30, 2));// Вывод нечетных элементов массива pr1
    }
    static void Programm2() {
        Input input = new Input();
        String str1 = input.inputVerPr2();//Ввожу строку

        Sentenc str = new Sentenc(str1);// Объявляю объект str класса Sentenc
        str.inp2Symb(65, 91);
        str.inp2Symb(48, 58);
        str.inp1Symb(32);
        str.inp1Symb(44);
        str.inp1Symb(46);
    }
    static void Programm3() {
        Scanner sc = new Scanner(System.in);
        int n, moreThan;

        Input input = new Input();
        System.out.println("Введите длину множества чисел: ");
        int msize = input.inputVer();

        System.out.println("Введите условие Ваше услови, > 0 || < 10: ");
        String s = sc.nextLine();
        Sentenc str = new Sentenc(s);
        moreThan = str.moreThan();// Определение знака больше или меньше в веденной строке
        n = str.numStr();// Определения числа в введенной строке

        Digit digi = new Digit(msize);
        digi.inpMass(msize);//Задаю массива

        System.out.println("Множество чисел удовлетворяющие условию: ");
        digi.printMass(moreThan, n, msize);
    }

    static void Constructor() {
        Sentenc str = new Sentenc();
        str.Print();
        Sentenc str1 = new Sentenc("Конструтор с параметром");
        str1.Print();
        Sentenc str2 = new Sentenc(str1);//Конструктор копирования
        str2.Print();

        int msize = 5;
        Digit digi = new Digit(msize);
        Digit digi1 = new Digit(new int[] {84, 72, 5, 34, 2, 2, 43});
        digi1.Print1();
        System.out.println();
        Digit digi2 = new Digit(digi1);
        digi2.Print1();
    }
}
