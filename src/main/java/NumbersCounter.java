import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumbersCounter {
    public static double countNumbers(String path) {
        double sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#") || line.length() <= 0) {
                    continue;
                }
                double currentLineValue;
                try {
                    currentLineValue = Double.parseDouble(line);
                    sum += currentLineValue;
                } catch (Exception ex) {

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers("C:\\Users\\igorv\\Desktop\\numbers.txt"));
    }
}