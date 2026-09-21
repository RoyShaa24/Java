package Demo;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int a[]={40,50,30,4,6};
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;

            while(j>=0 && a[j]>key)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println(Arrays.toString(a));
    }

}
