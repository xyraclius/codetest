import java.util.Scanner;

public class e {
    public String mask(String test) {
        if (test.length() > 2) {
            test = test.replaceAll("(?!^.?).(?!.{0}$)", "*");
        }
        return test;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        e e = new e();
        System.out.print("Input String: ");
        String inputString = scanner.nextLine();
        System.out.println(e.mask(inputString));
    }
}
