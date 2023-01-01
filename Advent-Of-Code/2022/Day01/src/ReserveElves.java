import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReserveElves {
    // max values to be stored in the following order
    private int[] maxValues = new int[] { -1, -2, -3 };

    public void evaluate(int x) {
        if (x > maxValues[2]) {
            if (x > maxValues[1]) {
                if (x > maxValues[0]) {
                    maxValues[0] = x;
                } else {
                    maxValues[1] = x;
                }
            } else {
                maxValues[2] = x;
            }
        }
        // do nothing
    }

    public int sumOfMaxValues() {
        return maxValues[0] + maxValues[1] + maxValues[2];
    }

    public static void main(String[] args) throws FileNotFoundException {
        // read input file
        File inputObject = new File("data/input.txt");
        Scanner myReader = new Scanner(inputObject);
        ReserveElves myEvaluator = new ReserveElves();
        int tempSum = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if (!data.equals("")) {
                tempSum += Integer.parseInt(data);
            } else {
                myEvaluator.evaluate(tempSum);
                tempSum = 0;
            }
        }
        System.out.println(String.format("Greatest Calories Total: %s", myEvaluator.sumOfMaxValues()    ));

    }

}
