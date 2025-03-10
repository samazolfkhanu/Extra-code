package yy;

import java.util.Scanner;

public class Main
{
    final int M=20;
    public void main(String[] args)
    {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter number of products:");
        int n=scanner.nextInt();
        Products[] p1=new Products[n];
        while(n<=M)
        {
            p1[count]=new Products();
            p1[count].enterInfo();
            count++;
        }
        count=0;
        for(int i=0;i<n;i++)
        {
            p1[i].showInfo();
        }
    }
    class Products
    {
        String name;
        String[] c;
        float p;
        int nc;
        public void enterInfo()
        {
            Scanner scanner=new Scanner(System.in);
            System.out.print("enter name: ");
            name=scanner.nextLine();
            System.out.print("enter price: ");
            p=scanner.nextFloat();
            System.out.print("enter number of colors:");
            nc=scanner.nextInt();
            c=new String[nc];
            for(int i=0;i<c.length;i++)
            {
                System.out.printf("enter color %d",i+1);
                //c[i]=new String();
                c[i]=scanner.nextLine();
            }
        }
        public void showInfo()
        {
            System.out.print("name: "+name+"price: "+p+"colors: ");
            for(int i=0;i<nc;i++)
            {
                System.out.print(c[i]);
                System.out.print("   ");
            }
        }
    }
}