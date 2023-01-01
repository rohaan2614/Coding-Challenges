import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReserveElf {

    public static void main(String[] args) throws FileNotFoundException {
        // read input file
        File inputObject = new File("data/testInput.txt");
        Scanner myReader = new Scanner(inputObject);
        String data = "";
        while (myReader.hasNextLine()) {
            data += myReader.nextLine() + " ";
        }
        System.out.println(data);
    }
    
}
