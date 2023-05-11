package xiangqi;

public class Pion extends Piece {
    private Position depart;
    private Position arrivee;
    private boolean riviere;

    public Pion(int x, int y, String nom, String couleur) {
        super(nom, couleur);
        this.riviere= false;
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
        if (isRiviere()) {
            if (i == 1 && depart.getLigne() == arrivee.getLigne()) {
                return true;
            } else
                return false;
        } else {
            if (i == 1)
                return true;
            else
                return false;
        }
    }

    public boolean isRiviere() {
        return riviere;
    }

    public void setRiviere(boolean riviere) {
        this.riviere = riviere;
    }
}
