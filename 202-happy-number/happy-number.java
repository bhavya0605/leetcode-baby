import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
}

int getNext(int n){
    int d, sum = 0;
    while(n>0){
        d = n % 10;
        sum = sum + d * d;
        n = n / 10;
    }
    return sum;
    }
}