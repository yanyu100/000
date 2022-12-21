import java.util.*;
class acctright extends Exception
{
}

class acctwrong extends Exception
{
}

public class 01
{
   public static void main(String args[])
   {
     Scanner scn=new Scanner(System.in);
     int num;
     int num2;
     try
     {
        System.out.print("密碼輸入測試");
        System.out.println("請輸入密碼:");
        num=scn.nextInt();
        System.out.print("請再輸入一次密碼:");
        num2 = scn.nextInt();
        if (num2!=num)
            throw new acctwrong();
        else 
            throw new acctright();
     }
    catch(acctwrong e){
        System.out.print("與第一次輸入的不同");
        return
     }
    catch(acctright e){
        System.out.print("密碼正確");
     }
    }
}
