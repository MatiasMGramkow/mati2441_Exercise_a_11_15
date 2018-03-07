import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exercise15 {

    /*
    Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
    most frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary storage.
    If the list is empty, return 0.
     */

    public static void main(String[] args)
    {

        List list = new LinkedList();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);


        String metodeKald = maxOccurrences(list);

        System.out.println(metodeKald);






    }

    private static String maxOccurrences (List liste)
    {

        // laver en ny liste som tæller
        Map counter = new HashMap();

        // Hvis Listen størrelse er 0 gør følgende:
        if (liste.size() == 0)
        {
            return "Tomt for helvede";
        }


        for (int index = 0; index < liste.size(); index++) {
            int tal = (int) liste.get(index);

            if (!counter.containsKey(tal)) {
                counter.put(tal, 1);
            }
            else
            {
               int count = (int) counter.get(tal);
               counter.put(tal, count + 1);
            }
        }

        int maxValue;
        int nøgleValue;

        nøgleValue = (int) liste.get(0);

        maxValue = (int) counter.get(liste.get(0));

        for (Object key :
                counter.keySet()) {
            int count = (int) counter.get(key);

            if (count > maxValue)
            {
                nøgleValue = (int) key;
                maxValue = count;
            }
        }
        return "Det mest brugte element er: \t" + nøgleValue + " \nDette element er i index: \t\t" + maxValue + " gange";
    }

}
