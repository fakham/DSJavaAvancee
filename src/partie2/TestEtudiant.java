/**
 * @author : Mohammed FAKHAM
 * @date : 4 January 2019
 */

package partie2;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class TestEtudiant {

    public static void main(String[] args) throws Exception {
        List<Etudiant> list = new ArrayList<>();
        list.add(new Etudiant(1, "test", "test", 'h', 18.5));
        list.add(new Etudiant(2, "test", "test", 'h', 17.5));
        list.add(new Etudiant(3, "test", "test", 'h', 15.0));

        RandomAccessFile file = ajouter("lpglaasri.dat", list);
        afficher(file);
        modifier(file, 2, 16.2);
        afficher(file);

    }

    static RandomAccessFile ajouter(String ficher, List<Etudiant> etudiants) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(ficher, "rw");

        for (Etudiant e : etudiants) {
            raf.writeInt(e.getNum());
            raf.writeUTF(e.getNom());
            raf.writeUTF(e.getPrenom());
            raf.writeChar(e.getGenre());
            raf.writeDouble(e.getNote());
        }

        return raf;
    }

    static void modifier(RandomAccessFile fichier, int numero, double nouveauNote) throws IOException {

        fichier.seek(0);

        try {
            while(true) {
                int num = fichier.readInt();
                fichier.readUTF();
                fichier.readUTF();
                fichier.readChar();
                if (num == numero) {
                    fichier.writeDouble(nouveauNote);
                } else {
                    fichier.readDouble();
                }
            }
        } catch (EOFException ex) {

        }

    }

    static void afficher(RandomAccessFile file) throws IOException{
        file.seek(0);
        Etudiant e = null;

        try {
            while(true) {
                e = new Etudiant(file.readInt(), file.readUTF(), file.readUTF(), file.readChar(), file.readDouble());
                System.out.println(e);
            }
        } catch (EOFException ex) {

        }
    }

}
