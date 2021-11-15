import java.util.Scanner;

public class lb1task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int flag = 0;
        do {
            System.out.println("Введите целое числовое значение а");
            while(!s.hasNextInt()) {
                System.out.println("Введите корректные данные");
                s.next();
            }
            a = s.nextInt();
            flag =1;
        } while (flag ==0 ) ;
        {
            Scanner z = new Scanner(System.in);
            int b;
            int flag2 =0;
            do {
                System.out.println("Введите целое числовое значение b");
                while(!z.hasNextInt()) {
                    System.out.println("Введите корректные данные");
                    z.next();
                }
                b = z.nextInt();
                flag2 =1;
            } while (flag2 == 0) ;
            {
                Scanner y = new Scanner(System.in);
                int c;
                int flag3 =0;
                do {
                    System.out.println("Введите целое числовое значение c");
                    while(!y.hasNextInt()) {
                        System.out.println("Введите корректные данные");
                        y.next();
                    }
                    c = y.nextInt();
                    flag3 = 1;
                } while (flag3 ==0) ;
        if (c < b && c < a) {
            System.out.println("c наименьшее");
        }
        if (b < a && b < c) {
            System.out.println("b наименьшее");
        }
        if (a < c && a < b) {
            System.out.println("a наименьшее");
        }

    }}}}