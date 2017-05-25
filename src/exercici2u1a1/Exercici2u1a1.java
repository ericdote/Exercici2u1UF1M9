package exercici2u1a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Eric
 */
public class Exercici2u1a1 {

    public static void main(String[] args) throws Exception {
        File fichero = new File("C:\\Test.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader buffer = new BufferedReader(fr);
        String cad;
        while ((cad = buffer.readLine()) != null) {
            System.out.println(cad);
        }

    }
}
