package Oppgaver3_uke16;

public class BinaerTre<T extends Comparable<T>> {

    BinaerTreNode<T> rot;

    public BinaerTre(){
        rot = null;
    }

    private int hentHogde(BinaerTreNode<T> node){
        if(node == null){
            return 0;
        }
        return node.getHogdeU();
    }

    public boolean erBalansert(){
        return erBalansert(rot);
    }

    private boolean erBalansert(BinaerTreNode<T> node){
        if(node == null){
            return true;
        }

        int venstreH = hentHogde(node.getVenstre());
        int hoyreH = hentHogde(node.getHoyre());

        if(Math.abs(venstreH - hoyreH) > 1){
            return false;
        }

        return erBalansert(node.getVenstre()) &&
                erBalansert(node.getHoyre());
    }
}
