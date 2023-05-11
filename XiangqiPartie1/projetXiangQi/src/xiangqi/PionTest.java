package xiangqi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PionTest {


    public Pion pionnoir = new Pion(0,2,"pionNoir","noir");
    public Pion pionrouge = new Pion(6,0,"pionRouge","rouge");

    @Test
    void estValide() {
        Position p = new Position(0,2);
        Position p2 = new Position(7,0);

        System.out.println("Position du roi Noir == : " + pionnoir.estValide(pionnoir.getdepart(),p));
        System.out.println("Position du roi Rouge == : " + pionrouge.estValide(pionrouge.getdepart(),p2));
    }
}