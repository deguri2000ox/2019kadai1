package ox_ite_cafe;

import java.util.Scanner;

public class Script {
    static String Menu_List[] = {"[0]終了","[1]冷やしコーヒ","[2]カフェモカ","[3]エスプレッソ","[4]ペペロンチーノ"};
    static int price_List[]={0,300,350,300,600};
    static int Total_value = 0;
    static int In_value = 0;
    static int value = 0;
    
   
       static void Sucan(){
       while(true){
           System.out.println("\n\n購入するアイテムを選び、半角数字で入力してください\n0を入力すると会計に行きます");
   for(String list : Menu_List){
       System.out.println(list);
   }   
   try{
   value = new Scanner(System.in).nextInt();
   }catch(NumberFormatException e){System.out.println("文字が誤入力されました、数字を入力してください");continue;}
   int Result = 0;
   if(value == 0){
       System.out.println("受け取り金額を入力してください（釣銭を求めます）");
       int cash = new Scanner(System.in).nextInt();
       Result = cash - Total_value;
       Total_value = 0;
       System.out.println(cash+"円の受け取り"+Result+"円のお釣りです"+"\nお疲れさまでした");
       continue;
   }    
       if (Result<0){
           System.out.println(Result*-1+"円不足しています");
       }
       
      
   
   System.out.println("サイズを入力してください"+"\n...[S] [M] [L]"+"exitを入力するとシステム自体を終了します");
   String size = new Scanner(System.in).nextLine().toUpperCase();
   try{
   switch (size){
       
        case "S":
            In_value = price_List[value];
            break;    
         
        case "M":
            In_value = price_List[value]+50;
            break;
       
        case "L":
            In_value = price_List[value]+100;
            break;
               
        case "EXIT":
           System.exit(0);
        
        default:
            System.out.println("不正な値が入力されました");
            continue;
    }
    }catch(Exception e){
        System.out.println("なにか例外が発生しました");
        System.exit(0);
    }
   Total_value += In_value;
   System.out.println(Menu_List[value]+"["+size+"]"+"..."+In_value+"円");
   System.out.println("現在合計"+Total_value+"円");
       }
}
}
