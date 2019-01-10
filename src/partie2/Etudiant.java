/**
 * @author : Mohammed FAKHAM
 * @date : 4 January 2019
 */

package partie2;

public class Etudiant {

    private int num;
    private String nom;
    private String prenom;
    private char genre;
    private double note;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Etudiant(int num, String nom, String prenom, char genre, double note) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.note = note;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "[" + num + ", " + nom + ", " + prenom + ", " + genre + ", " + note + "]";
    }
}
