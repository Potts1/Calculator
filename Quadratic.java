import java.util.List;
import java.util.ArrayList;

public class Quadratic
{
    private int a;
    private int b;
    private int c;

    public Quadratic(int a, int b, int c)
    {
        this.a = a;
        this.b = b * -1;
        this.c = c;
    }

    public String getTopQuadratic()
    {
        int[] sqr = squareRoot((b*b) - (4 * a * c));
        return sqr[0] + "|" + sqr[1];
    }

    private int[] squareRoot(int number) 
    {
        int number1 = number;
        List<Integer> roots = new ArrayList<>();
        int coefficient = 1;
        for (int i = 2; i < number1; i++)
        {
            if (number1 % (i * i) == 0)
            {
                roots.add(i);
                number1 /= i * i;
                for (int j = 2; j < number1; j++)
                {
                    if (number1 % (j * j) == 0)
                    {
                        roots.add(j);
                        number1 /= j * j;
                    }
                }
            }
        }
    for (int root : roots) coefficient *= root;
    return new int[]{coefficient, number1};
}

    public String toString()
    {
        return b + " (+-) (" + getTopQuadratic() + ") / " + 2*a;
    }
}