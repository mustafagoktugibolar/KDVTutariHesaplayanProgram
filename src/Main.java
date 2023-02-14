import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        double tutar;
        double kdv;

        System.out.print("Turari Giriniz: ");
        tutar = sc.nextDouble();

        if(tutar > 0 && tutar <= 1000){
            kdv = 0.18;
        }
        else{
            kdv = 0.08;
        }

        double result = tutar + tutar*kdv;

        System.out.println("Odenecek Miktar : " + result);
    }
}
