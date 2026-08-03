package P3;
class Nitte{
    void details(){
        System.out.println("from nitte");
    }
}

class nsam extends Nitte{
    void nsam_details(){
        System.out.println("degree clg");
    }
}
class Nmamit extends Nitte{
    void nmamit_details(){
        System.out.println("engg clg");
    }
}
class jks extends Nitte{
    void jks_details(){
        System.out.println("mba clg");
    }
}
public class Pract4 {
    public static void main(String[] args) {
    nsam N=new nsam();
    jks j=new jks();
    Nmamit n=new Nmamit();
    j.details();
    j.jks_details();
    n.details();
    n.nmamit_details();
    N.details();
    N.nsam_details();
    }

}
