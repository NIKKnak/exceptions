import java.util.Scanner;

public class View {
    public static String[] addString() {
        System.out.println("Введите данные в формате - Ф,И,О дата_рождения номер_телефона пол");
        String[] string;
        try (Scanner scan = new Scanner(System.in)) {
            String text = scan.nextLine();
            string = text.split(" ");
        }
        return string;
    }
}