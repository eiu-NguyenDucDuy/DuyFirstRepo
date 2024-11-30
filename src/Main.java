import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String name = "Duy";
        sb.append("Welcome to " + name + "'s Java Repository.").append("\n");
        sb.append("Hello " + name + ".").append("\n");
        sb.append("Welcome to my repository.").append("\n");
        
        String userName = sc.next();
        sb.append("Hello " + userName).append("\n");
        sb.append("Welcome to my Java Repository").append("\n");

        System.out.println(sb);
        sc.close();
    }
}