import java.util.Scanner;
class calculator {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st and 2nd Number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("choose and enter the type of operation you want to perform (+,-,*,/,%)");
    char op = sc.next().charAt(0);
    solve(a, b, op);
   }
   public static int solve(int a, int b, char op)
   {
    int ans = 0;
    // addition
    if (op == '+') {
        ans = a + b;
        // subtraction
    }
    else if (op == '-') {
        ans = a - b;
        // multiplication
    }
    else if (op == '*') {
        ans = a * b;
        // modulo
    }
    else if (op == '%') {
        ans = a % b;
        // division
    }
    else if (op == '/') {
        ans = a / b;
    }

    // printing the final result
    System.out.println("Your answer is  " + ans);
    return ans;
}

}