import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Наталья on 28.02.2017.
 */
public class Sorter {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("input.txt");
        String[] array = loadAndSort(in);
        for (String s : array){
            System.out.println(s);
        }
    }

    static String[] loadAndSort(FileReader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            lines.add(line);
        }
        reader.close();
        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        return array;
    }
}
