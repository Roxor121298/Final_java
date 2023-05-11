package xiangqi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoiTest {

    public Roi RoiNoir = new Roi(4,1,"Roi","noir");
    public Roi RoiRouge = new Roi(4,7,"Roi","rouge");

    @Test
    void getdepart() {
        RoiNoir.getdepart();
        RoiRouge.getdepart();

        System.out.println("Les lignes des Roi sont : " + RoiNoir.getdepart().getLigne() + " et " + RoiNoir.getdepart().getColonne());
        System.out.println("Les colonnes des Roi sont : " + RoiRouge.getdepart().getLigne() + " et " + RoiRouge.getdepart().getColonne());
    }

    @Test
    void estValide() {
        Position p = new Position(3,0);
        Position p2 = new Position(3,7);
        RoiNoir.estValide(RoiNoir.getdepart(),p);
        RoiRouge.estValide(RoiRouge.getdepart(),p2);

        System.out.println("Position du roi Noir == : " + RoiNoir.estValide(RoiNoir.getdepart(),p));
        System.out.println("Position du roi Rouge == : " + RoiRouge.estValide(RoiRouge.getdepart(),p2));

    }

}