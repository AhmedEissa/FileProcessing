import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Mateusz on 28/06/2016.
 */
public class FileDirectory {
    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("Y:\\Machine learning files\\Dataset\\missing box")).forEach(filePath -> {
            if (Files.isRegularFile(filePath)) {
                String fileName = filePath.toString();
                File file = new File(fileName);

                String fileName1 = fileName.replace("_uncomp","");

                File file1 = new File(fileName1);
                file.renameTo(file1);




                System.out.println(file1);
            }
        });
    }
}
