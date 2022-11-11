import java.util.Scanner;
public class average {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //taking character as input
        String str=s.nextLine();
        char ch=str.charAt(0);
        //integer as input
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        int avg=(m1+m2+m3)/3;//average
        System.out.println(ch);
        System.out.println(avg);
    }
}
