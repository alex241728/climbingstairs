public class ClimbingStairs
{
    public int climbStairs(int n)
    {
        // Basis: n = 1 and n = 2
        if (n == 1)
        {
            return 1;
        }
        if (n == 2)
        {
            return 2;
        }

        // Recursive Step
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
