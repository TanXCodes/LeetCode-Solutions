class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while(i< s.length() - 1){
            if( num(s.charAt(i)) < num(s.charAt(i+1))){
                sum -= num(s.charAt(i));
            }
            else{
                sum += num(s.charAt(i));
            }
            i++;
        }
        sum += num(s.charAt(i));
        return sum;
    }
    private int num(char ch){
        if(ch=='I') return 1;
        else if(ch =='V') return 5;
        else if(ch =='X') return 10;
        else if(ch =='L') return 50;
        else if(ch =='C') return 100;
        else if(ch =='D') return 500;
        else if(ch =='M') return 1000;

        return -1;

    }
}