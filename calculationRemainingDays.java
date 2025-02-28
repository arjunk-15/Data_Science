import java.util.*;
public class calculationRemainingDays {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the total number of days: ");
        int totalDays=scan.nextInt();
        int years=totalDays/365;
        int remDays1=totalDays%365;
        int weeks=remDays1/7;
        int remDays2=remDays1%7;
        System.out.println(years+" years, "+weeks+" weeks, "+remDays2+" days.");
    }
}
