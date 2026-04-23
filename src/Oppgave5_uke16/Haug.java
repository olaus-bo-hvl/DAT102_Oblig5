package Oppgave5_uke16;

public class Haug {

/*
a)
binærhaug/binary heap, skiller mellom max heap og min heap.
i max heap er størrelesorden som føgler: rot>forelder>barn
i min heap er størrelesorden som følger: (høyre>venstre)barn>forelder>rot

b)
forutsatt at starter på indeks 1, skal dette stemme for enhver max/min haug tabellorden:

nåværende node:      (i)ndeks
venstre barn:   2i
høyre barn:     2i+1
forelder:       i/2

a) feiler allerede i rot fordi 9<15 & 9<12

    9
  /   \
15     12

b) feiler på nivå 3 siden 2<8

        15
      /
    12
  /    \
11      2
  \   /
    8

c) ja makshaug

         15
       /    \
     10      14
   /    \   /  \
  8      7 13   6
 / \    /
2   5  4

c) i) etter fjerning av verdi 15 ser treet slik ut:
             4
          /     \
        10       14
       /  \     /  \
      8    7   13   6
    /   \
   2     5

c) ii) 4 10 14 8 7 13 6 2 5 13

             4
          /     \
        10       14
       /  \     /  \
      8    7   13   6
    /   \  /
  2     5 13

d) det er haugsortering, man bygger først en haug, deretter flytter største element til slutten av arrayet.

e) holder på, papir-oppg

*/
}