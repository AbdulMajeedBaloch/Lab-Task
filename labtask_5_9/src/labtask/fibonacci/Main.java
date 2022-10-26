package labtask.fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int n = scanner.nextInt();
        System.out.println(fib(n));

    }
    public static int fib(int n){
        if(n<=1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

}
