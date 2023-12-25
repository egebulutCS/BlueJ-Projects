
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class grade
{
    int a;
    int b;
    int c;
    int d;
    int[] theList = new int[4];
    public grade(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        theList[0]=a;
        theList[1]=b;
        theList[2]=c;
        theList[3]=d;
    }

    public grade()
    {
        a=90;
        b=70;
        c=45;
        d=25;
        theList[0]=a;
        theList[1]=b;
        theList[2]=c;
        theList[3]=d;
    }

    public void checkNextGrades()
    {
        int index=0;
        int N=theList[index];
        int M=theList[index++];
        if(N>M)
        {
            System.out.println(N);
            if(M>=50)
            {
                System.out.println("Both "+M+" and "+N+" passes.");
                index=index++;
            }
            else if(M<50)
            {
                System.out.println(N+" passes,but "+M+" fails.");
                index=index++;
            }
            else
            {
                System.out.println("Both "+M+" and "+N+" fails");
                index=index++;
            }
        }
        else if(N<M)
        {
            System.out.println(M);
            if(N>=50)
            {
                System.out.println("Both "+M+" and"+N+" passes.");
                index=index++;
            }
            else if(N<50)
            {
                System.out.println(M+" passes,but "+N+" fails.");
            }
            else
            {
                System.out.println("Both "+M+" and "+N+" fails");
                index=index++;
            }
        }
        else
        {
            if(N<50)
            {
                System.out.println("Both "+M+" and "+N+" fails");
                index=index++;
            }
            else
            {
                System.out.println("Both "+M+" and "+N+" passes.");
                index=index++;
            }
        }
    }
    
    public void test()
    {
        int index=0;
        int N=theList[index];
        System.out.println(N);
        System.out.println(a+", "+b);
    }
}
