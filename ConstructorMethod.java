import java.util.Scanner;

public class ConstructorMethod
{
    public void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String n;
        int a;
        Person p=new Person(scan.nextLine(), scan.nextInt());
        p.r();
    }
    class Person
    {
        String name;
        int age;
        public Person(String name,int age)
        {
            this.age=age;
            this.name=name;
        }
        public void r()
        {
            System.out.println("name: "+name+"\tage: "+age);
        }
    }
}