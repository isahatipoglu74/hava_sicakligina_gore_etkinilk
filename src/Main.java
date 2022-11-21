
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Hava Sıcalığını giriniz: ");
        int sicaklik=inp.nextInt();

        if(sicaklik<5){
            System.out.print("Kayak yapmanızı öneririz");
        }
        if(sicaklik>=5 && sicaklik<10){
            System.out.print("Sinemaya gitmenizi öneririz");
        }
        if(sicaklik>15 && sicaklik<=25){
            System.out.print("Pikniğe gitmenizi öneririz");
        }
        if(sicaklik>25){
            System.out.print("Yüzmeye gidebilirsiniz");
        }
        if(sicaklik>=10 && sicaklik<=15){
            System.out.print("İsterseniz sinemaya veya pikniğe gidebilirsiniz");
        }
    }
}