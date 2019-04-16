package com.jenking.simple;

public class Reverse {
    public static int reverse(int x) {
        int topInt = 214748364;
        int result = 0;
        while(x!=0){
            int tip = x % 10;
            x = x/10;
            if (x>0||x<10){
                if (Math.abs(result)>topInt||((Math.abs(result)==topInt)&&(tip>7||tip<-8))){
                    return 0;
                }
            }
            result = result * 10 + tip;
            //System.out.print("tip:"+tip+",x:"+x+",result:"+result+"\n");
        }
        return result;
    }

    public static void main(String args[]){
        int target = -2147483641;
        System.out.println(reverse(target));

    }
}
