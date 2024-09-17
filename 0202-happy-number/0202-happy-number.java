import java.util.LinkedList;

class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
//This code implements a solution to determine whether a given number is a "Happy Number" using Floyd's Cycle-Finding Algorithm (also known as the "Tortoise and Hare" algorithm)
        do {


            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);



        return slow == 1;
    }
    


    public int square(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }
}