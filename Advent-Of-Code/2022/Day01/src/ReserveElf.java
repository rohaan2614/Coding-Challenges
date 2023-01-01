import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReserveElf {

    public static void main(String[] args) throws FileNotFoundException {
        // read input file
        File inputObject = new File("data/input.txt");
        Scanner myReader = new Scanner(inputObject);
        // String data = "";
        int maxValue = 0;
        int tempSum = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if (!data.equals("")) {
                tempSum += Integer.parseInt(data);
                if (tempSum > maxValue) maxValue = tempSum;
            } else {
                tempSum = 0;
            }
        }
        System.out.println(String.format("Greatest Number of Calories Carried: %s", maxValue));

    }

}
