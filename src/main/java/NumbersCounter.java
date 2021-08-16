import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumbersCounter {
    public double countNumbers (String path){
        double sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.startsWith("#") || line.length() <= 0){
                    continue;
                }
                double currentLineValue;
                try{
                    currentLineValue = Double.parseDouble(line);
                    sum += currentLineValue;
                }
                catch (Exception ex){

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    public static void main(String[] args) {
        NumbersCounter numbersCounter = new NumbersCounter();
        System.out.println(numbersCounter.countNumbers("C:\\Users\\38095\\Downloads\\numbers.txt"));
    }
}