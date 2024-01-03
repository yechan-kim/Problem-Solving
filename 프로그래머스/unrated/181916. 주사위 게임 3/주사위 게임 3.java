class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a == b && b == c && c == d)
            return 1111 * a;
        else if(a == b && b == c) 
            return (10 * a + d) * (10 * a + d);
        else if(b == c && c == d)
            return (10 * b + a) * (10 * b + a);
        else if(c == d && d == a)
            return (10 * a + b) * (10 * a + b);
        else if(d == a && a == b)
            return (10 * a + c) * (10 * a + c);
        else if(a == b && c == d)
            return (a + c) * Math.abs(a - c);
        else if(b == c && a == d)
            return (b + a) * Math.abs(b - a);
        else if(a == c && b == d)
            return (a + b) * Math.abs(a - b);
        else if(a == d && b == c)
            return (a + d) * Math.abs(a - d);
        else if(a == b)
            return c * d;
        else if(b == c)
            return a * d;
        else if(c == d)
            return a * b;
        else if(d == a)
            return b * c;
        else if(a == c)
            return b * d;
        else if(b == d)
            return a * c;
        else
            return Math.min(a,Math.min(b,Math.min(c,d)));
    }
}