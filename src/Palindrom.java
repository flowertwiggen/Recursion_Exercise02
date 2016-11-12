
public class Palindrom {

    String r = "";
    String r2 = "";
    String s2 = "";

    int i = 1;

    public boolean checkText(String s) {

        r = r + s.charAt(s.length() - i);
        if (i <= s.length()-1) {
            i++;
            checkText(s);
        }
        else {
            s2 = s.replaceAll("\\s", "").toLowerCase();
            r2 = r.replaceAll("\\s", "").toLowerCase();

        }
        return s2.equals(r2);
    }
}

//Tidskomplexitet: Funktionen upptar tiden O(Log n) i relation till indata (String s).
//Minneskomplexitet: O(1)