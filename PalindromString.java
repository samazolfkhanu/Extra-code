import java.util.Scanner;

public class PalindromString
{
    public static void main(String[] args)
    {
        Str.isPalindrom();
    }
    public class Str
    {
        private static String s;

        public static void isPalindrom()
        {
            Scanner scan=new Scanner(System.in);
            System.out.print("enter your name: ");
            s=scan.nextLine();
            s.toLowerCase();
            s.trim();
            char[] o=new char[s.length()];
            int i,j;
            for(i=(s.length()-1),j=0;i>=0;i--,j++)
            {
                o[j]=s.charAt(i);
            }
            String str=String.valueOf(o);
            if(str.equals(s)) System.out.print("it is palindrom");
            else System.out.print("it is not palindrom");

        }
    }
}