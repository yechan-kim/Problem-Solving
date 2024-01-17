class Solution
{
    public int solution(int n, int a, int b)
    {
        int result = 1;
        while(true){
            if((a + 1 == b && b % 2 == 0) || (b + 1 == a) && a % 2 == 0)
                return result;
            else{
                a = (a+1)/2;
                b = (b+1)/2;
                result++;
            }
        }
    }
}