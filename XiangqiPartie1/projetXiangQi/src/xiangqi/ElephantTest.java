package xiangqi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElephantTest {

    public Elephant ElephantNoir = new Elephant(0,2,"elephantNoir","noir");
    public Elephant ElephantRouge = new Elephant(6,0,"elephantRouge","rouge");

    @Test
    void estValide() {
        ElephantNoir.getDepart();
        ElephantRouge.getDepart();

        Position p = new Position(2,4);
        Position p2 = new Position(4,2);
        ElephantNoir.estValide(ElephantNoir.getDepart(),p);
        ElephantRouge.estValide(ElephantRouge.getDepart(),p2);

        System.out.println("Position du roi Noir == : " + ElephantNoir.estValide(ElephantNoir.getDepart(),p));
        System.out.println("Position du roi Rouge == : " + ElephantRouge.estValide(ElephantRouge.getDepart(),p2));

    }
}