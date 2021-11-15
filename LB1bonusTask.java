import java.util.Scanner;

public class LB1bonusTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        String seasonString;
        System.out.print("Введите номер месяца: ");
        if(s.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            a = s.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            switch (a) {
                case 12: case 1: case 2: seasonString = "Зима ";break;
                case 3: case 4: case 5: seasonString = "Весна";break;
                case 6: case 7: case 8: seasonString = "Лето";break;
                case 9: case 10: case 11: seasonString = "Осень";break;
                default: seasonString = "Введены некорректные данные";break;
            }
            System.out.print(seasonString);
        } else System.out.println("Введены некорректные данные");
    }}
