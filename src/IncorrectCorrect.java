import java.io.*;

/**
 * Created by Mateusz on 28/06/2016.
 */
public class IncorrectCorrect {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("incorrect.txt"));
        String sCurrentLine;
        FileWriter fw = null;
        PrintWriter pw = null;

        while ((sCurrentLine = br.readLine()) != null) {
            String[] parts=null;
            String part1=null;
            int x;
            if(sCurrentLine.contains("d1")){

                parts = sCurrentLine.split("d1");
                x = sCurrentLine.indexOf("d1");
                part1 = sCurrentLine.substring(0,x+2);
            }else if(sCurrentLine.contains("d2")){
                parts = sCurrentLine.split("d2");
                x = sCurrentLine.indexOf("d2");
                part1 = sCurrentLine.substring(0,x+2);
            }else if(sCurrentLine.contains("d3")){
                parts = sCurrentLine.split("d3");
                x = sCurrentLine.indexOf("d3");
                part1 = sCurrentLine.substring(0,x+2);
            }else if(sCurrentLine.contains("d4")){
                parts = sCurrentLine.split("d4");
                x = sCurrentLine.indexOf("d4");
                part1 = sCurrentLine.substring(0,x+2);
            }
            fw = new FileWriter("correctedIncorrect.txt",true);
            pw = new PrintWriter(fw);

            for(int i =1; i<parts.length;i++){
                if(i==1){
                    System.out.println("test1");
                    pw.write(part1);
                }
                System.out.println("test2");
                pw.write(parts[i] + " ");
            }
//            for(String part : parts){
//                pw.write(part + " ");
//            }
            pw.write("\n");
            pw.close();

        }
    }
}
