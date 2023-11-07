package lecture2;

import java.util.Scanner;

public class Gakuseki {
    public void gakuseki(String number){

        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください:");
        String gakuseki = scan.next();

        if(number.equals(gakuseki)){
            System.out.println("complete!");
        }
        else{
            System.out.println("error!");
        }
    }
}
