import java.util.Scanner;

public class PrintNumber {
    public static int inNumber(int number){
        if (number <= 1)
            return 1;
        else
            return inNumber(number - 1) + inNumber(number - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong so Fibonacci muon in ra:  ");
        int M = input.nextInt();
        for (int i = 0; i < M; i++){
            System.out.println(inNumber(i) + " ");
        }

    }
}
