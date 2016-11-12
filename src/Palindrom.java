
public class Palindrom {


    public boolean checkText(String s, int i, int j) {

        boolean b = true;
        if (s.charAt(i) == s.charAt(j)) {
            if (i <= j) {
                checkText(s, (i+1),(j-1));
            }
        } else
            b = false;

        return b;
    }
}

//Tidskomplexitet:FunktionenupptartidenO(Logn)irelationtillindata(Strings).
//Minneskomplexitet:O(1)













/* Gammal kod.
public class Palindrom {

    String r = "";
    String r2 = "";
    String s2 = "";

    int i = 1;

    public boolean checkText(String s) {

        r = r + s.charAt(s.length() - i);
        if (i <= s.length() - 1) {
            i++;
            checkText(s);
        } else {
            s2 = s.replaceAll("\\s", "").toLowerCase();
            r2 = r.replaceAll("\\s", "").toLowerCase();

        }
        return s2.equals(r2);
    }
}

//Tidskomplexitet:FunktionenupptartidenO(Logn)irelationtillindata(Strings).
//Minneskomplexitet:O(1)



 */