package lecture2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Pass {

    Scanner scan = new Scanner(System.in);
    String id = "example";
    String pass = "example";
    Map<String,String> dic = new HashMap<String,String>() {
        {
            put("B2210750", "otohu");
            put("B2210760","daizu");
            put("B2210770","okara");
            put("B2210780","azuki");
            put("B2210790","anko");
        }
    };

    public String idScan(){
        System.out.print("your id : ");
        id = scan.next();

        if(dic.containsKey(id)){
            System.out.println("OK");
        }
        else{
            System.out.println("error!");
            System.exit(0);
        }

        return id;
    }

    public void passScan(String id){
        System.out.println("your pass : ");
        pass = scan.next();
        if(dic.get(id).equals(pass)){
            System.out.println("complete!");
        }
        else{
            System.out.println("error!");
        }
    }


}
