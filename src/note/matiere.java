package note;
import java.util.ArrayList;
import note.note;
import note.matieresEnum;
public class matiere {
    protected ArrayList<note> liste = new ArrayList<note>();
    protected matieresEnum name;
    protected int coeff;
    protected void setCoeff(int coeff) {
        this.coeff = coeff;
    }
    protected int getCoeff(){
        return this.coeff;
    }
    protected matieresEnum getName(){
        return name;
    }
    protected void addNote(int Note, int coeff){
        note noteobject = new note(Note, coeff);
        liste.add(noteobject);
    }

}
