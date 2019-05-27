package JumpFloor1_N;
public class Solution {
    public int jumpFloor(int target)
    {
        //
        if (target == 0)
            return 0;
        else if (target == 1)
            return 1;
        else
            return 2*jumpFloor(target - 1);
    }
    //----------UNIT TEST------//
    public static void main(String[] args)
    {
        Solution s= new Solution();
        System.out.print(s.jumpFloor(6));
    }
}
