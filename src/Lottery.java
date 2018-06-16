import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery =45;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your GuessDigit: ");
        int number = sc.nextInt();
            int g1 = number / 10;
            int g2 = number % 10;
            int check1 = lottery / 10;
            int check2 = lottery % 10;
            if (g1 == check1 && g2 == check2) {
                System.out.println("Ban da trung doc dac: 10000$");
            } else if (g1 == check2 && g2 == check1) {
                System.out.println("Ban da trung giai nhi: 3000$");
            } else if (g1 == check1 || g2 == check2 || (g1 == check2 || g2 == check1)) {
                System.out.println("Ban da trung phan thuong: 1000$");
            } else {
                System.out.println("Chuc ban may man lan sau!");
            }
        }
    }

