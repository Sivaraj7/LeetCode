class Solution {
    public int getLucky(String s, int k) {

        String s1="";
        int sum=0;
        for(int i=0;i<s.length();i++)
        s1+=(s.charAt(i)-'a'+1);


        s=s1;
        for(int i=1;i<=k;i++)
        {
            sum=0;
            for(int j=0;j<s.length();j++)
            {
                sum+=(s.charAt(j)-'0');
            }

            s=Integer.toString(sum);
        }
        return sum;
    }
}
