import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Mateusz on 28/06/2016.
 */
public class CompareNames {


    public static void main(String[] args) throws IOException {
        ArrayList<String> allInOne = new ArrayList<>();
        ArrayList<String> labels = new ArrayList<>();
        Files.walk(Paths.get("Y:\\Machine learning files\\Dataset\\All in One")).forEach(filePath -> {
            String name = filePath.getFileName().toString();
            String name1 = name.replace(".avi","");
            allInOne.add(name1);
                //System.out.println(name1);
        });
        Files.walk(Paths.get("Y:\\Machine learning files\\Dataset\\Lables")).forEach(filePath -> {
            String name = filePath.getFileName().toString();
            String name1 = name.replace(".txt","");
            labels.add(name1);
            //System.out.println(name1);
        });
        for(String label : labels){
            if(!allInOne.contains(label)){
                System.out.println(label);
            }
        }

    }

}
