package Demo;

public class Demo1{

        static int[] bubble_sort(int a[])
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a.length-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            return a;
        }

    public static void main(String[] args) {
            int a[]={3,7,4,8,2};
    }

}
