package Arrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "nitte@edu.com";
        String sr[] = s.split("@", 2);
        System.out.println(Arrays.toString(sr));

        String ph = "0123-446-789-58";
        String ph1[] = ph.split("-", 3);
        System.out.println(Arrays.toString(ph1));

        String a = "java";
        System.out.println(a.replace("a", "A"));

        String b = "java python java python";
        System.out.println(b.replaceFirst("java", "C"));

        String c = "Hello java";
        System.out.println(c.trim());

        String html = "<p>Hello</p><p>World</p>";
        System.out.println(html.replace("<p>", "").replace("</p>", ""));

        String x = "java";
        String y = "python";
        System.out.println(x + y);
        System.out.println(x.concat(y));

        String languages[] = {"java", "python", "C++"};
        System.out.println(String.join("@", languages));

        String n = "java@jamil.com";
        System.out.println(n.substring(0, 3));

        String name = "John Doe Smith";
        int start = name.indexOf(" ") + 1;
        int end = name.lastIndexOf(" ");
        System.out.println(name.substring(start, end));
        String name2 = "Neha Sumith Jha";

        String email = "java@gmail.com";
        int start1 = email.indexOf("@");
        System.out.println(email.substring(start1));

        String r1 = "345se";
        System.out.println(r1.matches("^[A-Z].*"));

        String p2 = "165Ahdcvs";
        String p3 = "java123";
        System.out.println(p3.replaceAll("\\d", ""));

        String p4 = "jcbskh367Java";
        System.out.println(p4.matches(".*[A-Z].*"));

        String p5 = "Java%76859";
        System.out.println(p5.matches(".*[A-Z,a-z,0-9].*"));

        String p6 = "abc356";
        System.out.println(p6.replaceAll("[^0-9]", ""));

        String pass = "nsam@1234fv";
        if (pass.length() >= 11) {
            if (pass.matches(".*[A-Z,a-z,0-9]")) {
                if (pass.matches(".*[A-Z,a-z,0-9]")) {
                    System.out.println("STRONG PASS");
                } else {
                    System.out.println("Weak");
                }
            } else {
                System.out.println("Weak");
            }
        }
    }
}
