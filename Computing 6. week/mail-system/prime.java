
/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prime
{
    int N;
    int a;
    public prime()
    {
        N=3;
        a=2;
        while(N<=100)
        {
            if(a<N)
            {
                if ((N%a==0))
                {
                    N++;
                    a=2;
                }
                else
                {
                    a++;
                }
            }
            else
            {
                System.out.println(N);
                N++;
                a=2;
            }
        }
    }
}
