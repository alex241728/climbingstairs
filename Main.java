public class Main
{
    public static void main(String[] args)
    {
        ClimbingStairs cs = new ClimbingStairs();

        /*
            Input: n = 2
            Output: 2
            Explanation: There are two ways to climb to the top.
            1. 1 step + 1 step
            2. 2 steps
         */
        System.out.println(cs.climbStairs(2));

        /*
            Input: n = 3
            Output: 3
            Explanation: There are three ways to climb to the top.
            1. 1 step + 1 step + 1 step
            2. 1 step + 2 steps
            3. 2 steps + 1 step
         */
        System.out.println(cs.climbStairs(3));

        /*
            Input: n = 45
            Output: 1836311903
         */
        System.out.println(cs.climbStairs(45));
    }
}
