import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("herhangi bir yıl giriniz");
        int year= scanner.nextInt();
        int artikYil=year%4;
        if (artikYil==0){
            System.out.println(year+ "Artık bir yıldır");
        }else {
            System.out.println(year+ "Artık bir yıl değildir");
        }
    }
}