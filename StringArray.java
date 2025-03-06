import java.lang.reflect.Array;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args)
    {
        System.out.print(Find.islongest());
        System.out.print("\n");
        Find.reverse();
    }
    public class Find
    {
        private static String s1;
        static String islongest()
        {
            String l=" ";
            Scanner scan=new Scanner(System.in);
            System.out.print("enter the words: ");
            s1=scan.nextLine();
            String[] s2=s1.split(" ");
            for(String word: s2)
            {
                if(word.length()>l.length()) l=word;
            }
            return l;
        }
        static void reverse()
        {
            String s3=new String();
            String[] s2=s1.split(" ");
            for(int i=0;i<((s2.length)-1)/2;i++)
            {
                s3=s2[i];
                s2[i]=s2[(s2.length)-1];
                s2[(s2.length)-1]=s3;
            }
            System.out.print(String.join(" ",s2));
        }
    }
}
