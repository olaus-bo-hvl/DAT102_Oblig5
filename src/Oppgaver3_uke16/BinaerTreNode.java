package Oppgaver3_uke16;

public class BinaerTreNode {
    int verdi;  //verdi i noden
    BinaerTreNode venstre, hoyre;   //pekere til venstre og høyre barn
    int hogdeU; //høyden til undertreet med denne noden som rot

    public BinaerTreNode(int verdi){    //konstruktør
        this.verdi = verdi;
        this.venstre = null;
        this.hoyre = null;
        this.hogdeU = 1;
    }

    public int getHogdeU(){ //get metode
        return hogdeU;
    }

    public void setHogdeU(int hogdeU){  //set metode
        this.hogdeU = hogdeU;
    }
}
