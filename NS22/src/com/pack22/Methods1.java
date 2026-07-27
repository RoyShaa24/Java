package com.pack22;

public class Methods1 {
    public static void main(String[] args){
        int num=12345;
        int sum=0;
//        while(num!=0){
//            int dig=num%10;//extract the last digit
//            sum=sum+dig;// add the last digit to th sum
//            num=num/10;//update the "num" remaining digits
//        }
//        System.out.println("Sum:"+sum);
        while(num!=0){
            int dig=num%10;//extract the last digit
            sum=sum+1;// add the last digit to th sum
            num=num/10;//update the "num" remaining digits
        }
        System.out.println("total digit="+sum);
    }
}
