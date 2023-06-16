import java.util.Scanner;


public class exceptionsDZ2_4 {
    public static void main(String[] args) {
        empty_string();

    }
    

    public static void empty_string() {
        boolean flag = true;
        System.out.println("Введите сообщение : ");
        try (Scanner scan = new Scanner(System.in)) {
            while (flag) {
                String text = scan.nextLine();
                if (text == "") {
                    System.out.println("Строка должна быть заплнена : ");
                } else {
                    scan.close();
                    flag = false;
                }
            }
        }
    }
}

