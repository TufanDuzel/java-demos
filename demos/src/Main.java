import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        readFile();
        writeFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student2.txt");

        try {
            if(file.createNewFile()) {
                System.out.println("Dosya Başarıyla Oluşturuldu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student2.txt");

        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student2.txt", true));
            writer.newLine();
            writer.write("Harika");
            System.out.println("Dosyaya Yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}