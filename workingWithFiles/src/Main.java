import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu.");
            } else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student.txt");
        if(file.exists()) {
           System.out.println("Dosya Adı: " + file.getName());
           System.out.println("Dosya Yolu: " + file.getAbsolutePath());
           System.out.println("Dosya Yazılabilir mi: " + file.canWrite());
           System.out.println("Dosya Okunabilir mi: " + file.canRead());
           System.out.println("Dosya Boyutu: " + file.length() + " byte");
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Tufan Düzel\\Documents\\javademos2\\files\\student.txt", true));
            writer.newLine();
            writer.write("Writer");
            System.out.println("- Dosyaya Yazıldı. -");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}