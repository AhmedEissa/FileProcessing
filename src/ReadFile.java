import java.io.*;

/**
 * Created by Mateusz on 24/06/2016.
 */
public class ReadFile {

    public static void main(String[] args) throws IOException {
        String sCurrentLine;

        BufferedReader br = new BufferedReader(new FileReader("Labels1.txt"));
        FileWriter fw = null;
        PrintWriter pw = null;
        while ((sCurrentLine = br.readLine()) != null) {
            String [] parts = sCurrentLine.split(" ");
            int x=0;
//            if(parts.length==5){
//                fw = new FileWriter("incorrect.txt",true);
//                pw = new PrintWriter(fw);
//                for(String part : parts){
//                    pw.write(part + " ");
//                }
//                pw.write("\n");
//                pw.close();
//            }else{
//                fw = new FileWriter("correct.txt",true);
//                pw = new PrintWriter(fw);
//                for(String part : parts){
//                    pw.write(part + " ");
//                }
//                pw.write("\n");
//                pw.close();
//            }
            fw = new FileWriter(parts[0]+".txt", true);
            pw = new PrintWriter(fw);
            String word = parts[parts.length-1];
            int end = Integer.parseInt(word.substring(word.length() - 3));
            int classification=-1;
            if(parts[0].contains("boxing")){
                classification=0;
            }else if(parts[0].toLowerCase().contains("handclapping")){
                classification=1;
            }else if(parts[0].toLowerCase().contains("running")){
                classification=2;
            }else if(parts[0].toLowerCase().contains("walking")){
                classification=3;
            }else if(parts[0].toLowerCase().contains("jogging")){
                classification=4;
            }
            for(int i =1;i<=end;i++){

                pw.write(classification+"\n");
            }
            pw.flush();
            pw.close();
            fw.close();
        }

    }


}
