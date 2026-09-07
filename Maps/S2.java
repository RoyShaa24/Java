package Maps;

public class S2 {
//    static int[] bubble(int a[]){
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a.length;j++){
//                if(a[j]<a[j+1]);
//                {
//                    int temp=a[j] ;
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//        return a;
//    }
    public static void main(String[] args) {
        //in--NSam
        //out--nsAM
        //A-z=65-90,a-b=97
        String s = "Welcome to Java session";
        String res = "";
//        String s="Welcome to Java session";
//        String res=""; for(int i=0;i<s.length();i++){ char ch=s.charAt(i);
//        if(ch>=65 && ch<=91){ ch=(char)(ch+32); res+=ch; }
//        else { ch=(char)(ch-32);
//        res+=ch; }

            for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                res += (char)(ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                res += (char)(ch - 32);
            }
            else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
