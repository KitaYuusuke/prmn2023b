package lecture2;

import java.util.Scanner;

public class Keisan {

    public int addNum(){
        int[] num = new int[5];
        int x = 0;
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.printf("数字%dつめ",i);
            num[i] = scan.nextInt();
            System.out.println("");
        }

        for(int j=0;j<5;j++){
            x += num[j];
        }

        return x;
    }

    public void hanbetu(int x){
        System.out.printf("合計値：%d",x);
        System.out.println("");
        if(x >= 100){
            System.out.println("great!");
        }
        else if(x >= 50){
            System.out.println("big");
        }
        else{
            System.out.println("small");
        }
    }
}
