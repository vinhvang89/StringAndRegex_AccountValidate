import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter a new account :");
        String account = scanner.nextLine();
        AccountExample accountExample = new AccountExample();
        accountExample.validate(account);
    }
}
