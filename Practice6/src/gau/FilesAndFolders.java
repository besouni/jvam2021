package gau;

import java.io.*;

public class FilesAndFolders {
    File f;

    public void createFileAndFolder(){
        f = new File("JavaFolder");
        //            f.createNewFile();
        f.mkdir();
        System.out.println(f.isDirectory());
    }

    public void writeIntoFiles(){
        try {
            FileWriter fileWriter = new FileWriter("JavaFolder/text1.txt", true);
            fileWriter.write("\n87");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeIntoFiles1(){
        try {
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter("JavaFolder/text2.txt", true));
            int x = 487;
            Integer x1  = x;
            Integer x2 = 345;
            bufferedWriter.write(x1.toString());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){
        try {
            FileReader fileReader = new FileReader("JavaFolder/text2.txt");
            int symbol;
            while ((symbol = fileReader.read())!=-1){
                System.out.println((char)symbol);
            }
//            char t = (char) fileReader.read();
//            System.out.println(t);
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile1(){
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("JavaFolder/text2.txt"));
            String s;
            while ((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
