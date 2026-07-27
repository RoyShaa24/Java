package com.pack22;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

        public static void main(String[] args) {
            // int a[]={10,20,30,40};
            // System.out.println(a[2]);
            // System.out.println(a[3]);
            //System.out.println(a.length);
            //System.out.println(java.util.Arrays.toString(a));
            Scanner s = new Scanner(System.in);
            // String arr[]=new String[5];
            //System.out.println("Enter the Array Strings");
            // for(int i=0;i< arr.length;i++)
            // {
            //     arr[i]=s.next();
            // }
            // System.out.println(java.util.Arrays.toString(arr));
//            int a[][] = {
//                    {10, 20, 30},
//                    {40, 50, 60},
//                    {70, 80, 90}
//            };
//            System.out.println(Arrays.deepToString(a));
            // for(int i=0;i<a.length;i++){
            //  for(j=0;j<a[i].length;j+=){
            //    System.out.println(a[i][j]+" ");
            //}}
//            int rows = a.length;
//            int cols = a[i].length;
//            int t[][] = new t[][];
//            for (int i = 0; i < rows; i++) {
//                for (int j = 0; j < cols; j++) {
//                    int t[ i][j]=a[j][i];
//                    System.out.println(t[i][j] + " ");
//                }
//            }

//            for (int i = 0; i < a.length; i++) {
//                int sum=0;
//                for (int j = 0; j < a[i].length; j ++) {
//                    sum=sum+a[i][j];
//                }
//                System.out.println("sum"+sum);
//
//            }

            int a[]={10,20,30};
//            int b[]={40,50,60};
//            System.out.println(Arrays.equals(a,b));
//
//            int c[][]={
//                    {10,20},
//                    {40,50}
//            };
//            int d[][]={
//                    {10,20},
//                    {40,50}
//            };
//            System.out.println(Arrays.equals(c,d));
            int b[]=Arrays.copyOf(a,5);
            System.out.println(Arrays.binarySearch(b,20));



        }


}
