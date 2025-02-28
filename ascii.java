import java.util.*;
public class ascii{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter a character to display its ASCII value: ");
        char e=scan.next().charAt(0);
        int ascii=(int)e;
        System.out.println(ascii);

        System.out.print("Enter a number to display its Alpha value: ");
        int f=scan.nextInt();
        char alpha=(char)f;
        System.out.println(alpha);
    }
}
