package xiangqi;

public class Roi extends Piece {

    private Position depart;
    private Position arrivee;

    public Roi(int x, int y, String nom, String couleur) {
        super(nom, couleur);
        this.depart = new Position(x, y);
    }

    public Position getdepart() {
        return depart;
    }

    public void setdepart(Position positiondepart) {
        this.depart = positiondepart;
    }

    public Position getarrivee() {
        return arrivee;
    }

    public void setarrivee(Position arrivee) {
        this.arrivee = arrivee;
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        double i = norme(depart, arrivee);
        int y = 0;
        //le roi est il rouge ou noir
        if (getCouleur().equals("noir")) {
            y = 2;
        } else if ((getCouleur().equals("rouge"))) {
            y = 7;
        } else {
            System.out.println("La couleur n'est pas valide");
            return false;
        }

        // verification des position de depart et d'arrivée
        if ((depart.getColonne()) >= y && (depart.getLigne()) >= 3 && (depart.getLigne()) <= 5) {
            if ((arrivee.getColonne()) >= y && (arrivee.getLigne()) >= 3 && (arrivee.getLigne()) <= 5) {
                if (i == 1) {
                    return true;
                } else
                    return false;
            }
            else
                return false;
        }
        else
        return false;
    }

}
