package xiangqi;

public class Mandarin extends Piece{
    private Position depart;
    private Position arrivee;

    public Mandarin(int x, int y, String nom, String couleur) {
        super(nom, couleur);
        this.depart = new Position(x, y);
    }


    public Position getDepart() {return depart;}
    public void setDepart(Position depart) {this.depart = depart;}
    public Position getArrivee() {return arrivee;}
    public void setArrivee(Position arrivee) {this.arrivee = arrivee;}

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        double i = norme(depart, arrivee);
        int y = 0;
        //le mandarin est il rouge ou noir
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
                if (i == 2) {
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
