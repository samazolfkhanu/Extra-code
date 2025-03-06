import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args)
    {
        System.out.print(Find.islongest());
    }
    public class Find
    {
        static String islongest()
        {
            Scanner scan=new Scanner(System.in);
            System.out.print("enter the words: ");
            String s1=scan.nextLine(),l=" ";
            String[] s2=s1.split(" ");
            for(String word: s2)
            {
                if(word.length()>l.length()) l=word;
            }
            return l;
        }
    }
}
