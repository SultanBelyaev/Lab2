import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PasswordVerification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пароль:");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Пароль должен содержать не менее 8 символов");
        } else {
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])\\w{8,}$");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                System.out.println("Пароль надежен");
            } else {
                System.out.println("Пароль ненадежен. Повторите ввод");
            }
        }
    }
}
