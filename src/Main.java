import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        boolean artik = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = sc.nextInt();

        if (yil % 4 == 0 ){
            if ( yil % 100 == 0 ){

                if(yil % 400 == 0 )

                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
            }else
                artik= false;
        if(artik)
            System.out.print(yil + "--Artık Yıldır.");
        else
            System.out.print(yil +  "--Artık Yıl Değildir.");




    }
}
