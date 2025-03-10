import java.util.Scanner;

public class Property {
    public void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Time t=new Time();
        t.setTime(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println(t.getTime());
    }
    class Time
    {
        int h;
        int m;
        int s;
        public void setTime(int h,int m,int s)
        {
            if(h<=23&&m<=59&&s<=59)
            {
                this.h=h;
                this.m=m;
                this.s=s;
            }
        }
        public String getTime()
        {
            return h+":"+m+":"+s;
        }
    }
}
