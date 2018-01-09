import model.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/images/ilegra_64.txt");
        fileReader.readFile();
    }
}
