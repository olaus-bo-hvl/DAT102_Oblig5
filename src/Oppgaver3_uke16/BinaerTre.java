package Oppgaver3_uke16;

public class BinaerTre {
    BinaerTreNode rot;

    public BinaerTre(){ //konstruktør
        rot = null;
    }

    private int hentHogde(BinaerTreNode node){
        if(node == null){
            return 0;
        }
        return node.getHogdeU();
    }

    public boolean erBalansert(){
        return erBalansert(rot);
    }

    private boolean erBalansert(BinaerTreNode node){
        if(node == null){
            return true;
        }

        int venstreH = hentHogde(node.venstre);
        int hoyreH = hentHogde(node.hoyre);

        //sjekker balansen
        if(Math.abs(venstreH - hoyreH)>1){
            return false;
        }
        return erBalansert(node.venstre) && erBalansert(node.hoyre);
    }
}
