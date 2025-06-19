

class AI
{
    int a=10,b=20,d=30,i=0,c;
    public void add()
    {
        c=a+b;
        System.out.println(c);
    }
    public void sub()
    {
        c=a-b;
        System.out.println(c);
    }
    public void mul()
    {
        c=a*b;
        System.out.println(c);
    }
    public void div()
    {
        c=a/b;
        System.out.println(c);
    }
    public void even()
    {
        for(i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public void odd()
    {
        for(i=0;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
    public void num2()
    {
        if(a>b)
        {
            System.out.println("a is big");
        }
        else
        {
            System.out.println("b is big");
        }
    }
    public void num3()
    {
        if(a>b)
        {
            if(a>d)
            {
                System.out.println("a is big");
            }
            else
            {
                System.out.println("d is big");
            }
        }
        else
        {
            if(b>d)
            {
                System.out.println("b is big");
            }
            else
            {
                System.out.println("d is big");
            }
        }
    }
    public static void main (String args[])
    {
        AI k = new AI();
        k.add();
        k.sub();
        k.mul();
        k.div();
        k.even();
        k.num2();
        k.num3();
        k.odd();
    }
}
