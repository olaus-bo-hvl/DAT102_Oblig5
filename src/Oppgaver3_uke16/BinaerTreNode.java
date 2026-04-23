package Oppgaver3_uke16;

public class BinaerTreNode<T extends Comparable<T>> {

    T verdi;
    BinaerTreNode<T> venstre;
    BinaerTreNode<T> hoyre;
    int hogdeU;

    public BinaerTreNode(T verdi){
        this.verdi = verdi;
        this.venstre = null;
        this.hoyre = null;
        this.hogdeU = 1;
    }

    // brukes av InordenBST
    public T getElement() {
        return verdi;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public BinaerTreNode<T> getHoyre() {
        return hoyre;
    }

    public int getHogdeU(){
        return hogdeU;
    }

    public void setHogdeU(int hogdeU){
        this.hogdeU = hogdeU;
    }
}
