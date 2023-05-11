package xiangqi;

public class Cavalier extends Piece {
    private Position depart;
    private Position arrivee;

    public Cavalier(int x, int y, String nom, String couleur) {
        super(nom, couleur);
        this.depart = new Position(x, y);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if(norme(depart,arrivee) == 10){
            return true;
        }
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
