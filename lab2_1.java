import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class lab2_1 {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Введите дату :");
        String text = b.nextLine();
        Pattern pattern = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/((?:19|[2-9]\\d)\\d{2})$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Введенное выражение является датой");
        } else {
            System.out.println("Введенное выражение не является датой  или не введено в формате dd/mm/yyyy :) ") ;
        }
    }
}
