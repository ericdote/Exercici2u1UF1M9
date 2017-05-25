/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2u1a2;

import java.io.File;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class Exercici2u1a2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        String home = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        if (!"".equals(home)) {
            File f = new File(home + fs + "names.txt");
            if (f.isFile()) {
                Scanner rd = new Scanner(f);
                while (rd.hasNext()) {
                    String name = rd.nextLine();
                    String result = "";
                    try {
                        InetAddress ip = InetAddress.getByName(name);
                        result = ip + "...";
                        Socket s = new Socket(name, 80);
                        System.out.println(result + "AVAILABLE");
                    } catch (UnknownHostException ex) {
                        System.out.println(name + " does not exist!");
                    } catch (ConnectException ex) {
                        System.out.println(result + "UNAVAILABLE");
                    }
                }
                rd.close();
            }
        }
    }
}
