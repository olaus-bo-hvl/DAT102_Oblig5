package Oppgave2_uke16;

public class InordenBST {

    public void skrivVerdier(T nedre, T ovre) {
        skrivVerdierRek(rot, nedre, ovre);

    }

    private void skrivVerdierRek(BinaerTreNode<T> t, T min, T maks) {

        if (t != null) {
            skrivVerdierRek(t.getVenstre(), min, maks);
        }

		/*
		forrige metode var ikke optimal fordi den bruker unødig mye tid ved å sjekke både om nåværende node er >= minste node
		og om nåværende node er <= største node, hvis vi separerer mulighetene for verdien til nåværende node der den ikke er
		innenfor intervallet sparer vi kjøretid.
		*/

        // nåværende node større enn minste node
        if (t.getElement().compareTo(min) > 0) {
            skrivVerdierRek(t.getVenstre(), min, maks);
        }
        // innenfor intervallet
        if ((t.getElement().compareTo(min) >= 0) && (t.getElement().compareTo(maks) <= 0)) {
            System.out.print(t.getElement() + " ");
        }
        // nåværende node mindre enn største node
        if (t.getElement().compareTo(maks) < 0) {
            skrivVerdierRek(t.getHogre(), min, maks);
        }
    }
}
