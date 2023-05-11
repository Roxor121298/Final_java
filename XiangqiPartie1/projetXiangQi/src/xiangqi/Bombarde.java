package xiangqi;

public class Bombarde extends Piece{
    private Position depart;
    private Position arrivee;

    public Bombarde(int x, int y, String nom, String couleur) {
        super(nom, couleur);
        this.depart = new Position(x, y);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if(depart.getLigne() != arrivee.getLigne() && depart.getColonne() == depart.getColonne()){
            return true;
        }
        else if (depart.getLigne() == arrivee.getLigne() && depart.getColonne() != depart.getColonne())
            return true;
        else
            return false;
    }

    public Position getDepart() {
        return depart;
    }

    public void setDepart(Position depart) {
        this.depart = depart;
    }

    public Position getArrivee() {
        return arrivee;
    }

    public void setArrivee(Position arrivee) {
        this.arrivee = arrivee;
    }
}
