import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yıl Giriniz. ");
        int years=input.nextInt();
        if (years%4==0 && years%100!=0 )
            System.out.println(years+" artık yıldır.");
        else if (years%400==0)
            System.out.println(years+" artık yıldır");
        else
            System.out.println(years+" artık yıl değildir.");

    }
}
