import java.util.Scanner;

public class View {
    public static String[] addString() {
        System.out.println("������� ������ � ������� - �,�,� ����_�������� �����_�������� ���");
        String[] string;
        try (Scanner scan = new Scanner(System.in)) {
            String text = scan.nextLine();
            string = text.split(" ");
        }
        return string;
    }
}