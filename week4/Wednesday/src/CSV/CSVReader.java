package CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "text.csv.txt";
        String line= "";
        String cvsSlitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSlitBy);
                System.out.println("Country [code= " + country[4] + ", name =" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
