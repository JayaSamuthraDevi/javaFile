
import java.util.*;
class time{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int hr =sc.nextInt();
         int min =sc.nextInt();
          int sec =sc.nextInt();

          if(hr>=0&&hr<24)
          {
            if(min>=0&&min<60)
            {
                if(sec>=0&&sec<60)
                {
                    System.out.println("valid time");
                }
            }
          }
          else{
            System.out.println("invalid time");
          }
    }

}