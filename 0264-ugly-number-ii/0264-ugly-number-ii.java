/*class Solution {
    public int nthUglyNumber(int n) {
        int i=0;
        int arr[]=new int [1000];
        arr[i]=1;
        int ans=0;
        while(n>0)
        {
            if(i==n)
            break;
            ans=arr[i]+1;
            if(ans%2==0||ans%3==0||ans%5==0)
            {
            arr[i]+=ans;
            n--;
            }
            i++;
            
        }
        return arr[i];
    }
}
*/
class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        nums[0] = 1; 
        int i2 = 0, i3 = 0, i5 = 0; 

        for (int i = 1; i < n; i++) {
            
            int nextNum = Math.min(nums[i2] * 2, Math.min(nums[i3] * 3, nums[i5] * 5));
            nums[i] = nextNum;
            
            if (nextNum == nums[i2] * 2) i2++;
            if (nextNum == nums[i3] * 3) i3++;
            if (nextNum == nums[i5] * 5) i5++;
        }

        return nums[n - 1];
    }
}