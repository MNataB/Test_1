import java.util.ArrayList;

/**
 * Created by Наталья on 27.03.2017.
 */
public class CounterOfWords {
    public static void main(String[] args) {
        String s = " \n  Какой-нибудь  текст, \t для примера. Или для примеров?.. "
                + "Все-таки для примера.  \n  Или даже какой-нибудь пример! ";
        System.out.println(s);
        String ss = "Sebastian Vettel is a German Formula One racing driver currently driving for Red Bull Racing";
        String [] strings = ss.split(" ");
        for (String sss : strings) {
            System.out.println(sss);
        };

        ArrayList<String> list = new ArrayList<String>();
        int i = 0, j = 0;
        for(; j < s.length(); j++) {
            if(s.charAt(j) == ' ' || s.charAt(j) == '\n' || s.charAt(j) == '\t') {
                if(j > i) {
                    list.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if(i < s.length()) {
            list.add(s.substring(i));
        }
        String[] r = list.toArray(new String[list.size()]);

        int k = 0, k2 = 0;
        for (; k < r.length; k++) {
            if(k2 < r[k].length()) k2 = r[k].length();
        }
        // Print
        System.out.println("Всего слов в строке: " + r.length);
        System.out.println("Самое длинное слово: \"" + r[k2] + "\"\n------");
    }
}
