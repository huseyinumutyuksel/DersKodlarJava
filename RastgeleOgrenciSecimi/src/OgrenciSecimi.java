import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OgrenciSecimi {
    public static void main(String[] args) throws IOException {
        List<String> allStudents = Files.readAllLines(Paths.get("src/students.txt"));
        /*String veri tipinde bir liste oluşturdum. Bu listeyi Files sınıfının readAllLines
        * metodu ile okuduk. Listeyi okuyabilmek için Paths sınıfının get metodu ile dosya adını ve yolunu gösterdik
        */
        List<String> selectedStudents = new ArrayList<>(); // Bir ArrayList oluşturduk

        File selectedFile = new File("src/selected.txt"); //Dosyayı belirtilen yol ve isim ile oluşturduk
        if (selectedFile.exists()) {
            //Eğer selectedFile dosyası var ise
            selectedStudents = Files.readAllLines(selectedFile.toPath());
        }
        else {
            selectedFile.createNewFile(); // yok ise bu isimde dosya oluştur.
        }
        //Kalan öğrencileri bulmak için
        List<String> remainingStudents = new ArrayList<>(allStudents);
        remainingStudents.removeAll(selectedStudents);

        if (remainingStudents.isEmpty()){
            System.out.println("Tüm öğrenciler seçildi. Sunum tamamlandı");
            return;
        }

        //Rastgele seçim
        Random random = new Random();
        int randomIndex = random.nextInt(remainingStudents.size());
        String chosenStudent =remainingStudents.get(randomIndex);

        //Ekrana yaz ve dosyaya ekle
        System.out.println("Seçilen öğrenci:"+chosenStudent);
        Files.write(selectedFile.toPath(), Collections.singletonList(chosenStudent), StandardOpenOption.APPEND);
        Files.write(selectedFile.toPath(), Collections.singletonList(System.lineSeparator()),StandardOpenOption.APPEND);

    }
}
