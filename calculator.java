import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input= new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz :");
        n1= input.nextInt();
        System.out.print("ikinci Sayıyı Giriniz :");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        System.out.print("Seçimi Yazınız :");
        select= input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama :" + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma :" + (n1 -n2));
                break;
            case 3:
                System.out.print("Çarpma :" + (n1*n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bölme işlemi :" + (n1 / n2));
                }else {
                    System.out.println("Hatalı Giriş Yatınız!");
                    }
                    }
    }
}







