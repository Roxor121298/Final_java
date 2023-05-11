package xiangqi;

public class Elephant extends Piece {
    private Position depart;
    private Position arrivee;
    private Position[] controle;

    public Elephant(int x, int y, String nom, String couleur) {
        super(nom, couleur);
        this.depart = new Position(x, y);
        // Creer un liste des position possible pour l'elephant
        this.controle= new Position[7];
        if(couleur.equals("noir")) {
            controle[0]= new Position(0, 2);
            controle[1]= new Position(2, 0);
            controle[2]= new Position(2, 4);
            controle[3]= new Position(4, 2);
            controle[4]= new Position(6, 0);
            controle[5]= new Position(6, 4);
            controle[6]= new Position(8,2);
        }
        else {
            controle[0] = new Position(0, 7);
            controle[1] = new Position(2, 5);
            controle[2] = new Position(2, 9);
            controle[3] = new Position(4, 7);
            controle[4] = new Position(6, 5);
            controle[5] = new Position(6, 9);
            controle[6] = new Position(8, 7);
        }
    }


    public Position getDepart() {return depart;}
    public void setDepart(Position depart) {this.depart = depart;}
    public Position getArrivee() {return arrivee;}
    public void setArrivee(Position arrivee) {this.arrivee = arrivee;}


    @Override
    public boolean estValide(Position depart, Position arrivee) {
        double i = norme(depart, arrivee);
        String p = (String) getCouleur();
        //l'elephant est il rouge ou noir
        //n'est pas necessaire dans ce cas
        if (getCouleur().equals("noir")) {
            p = "noir";
        } else if ((getCouleur().equals("rouge"))) {
            p="rouge";
        } else {
            System.out.println("La couleur n'est pas valide");
            return false;
        }


        if(pointDeControle(p,arrivee) == true) {
                if (i == 8) {
                    return true;
                }
        }

        return false;
    }

    public void setControle(Position[] controle) {this.controle = controle;}

    public Position getControle(int i) {return controle[i];}

    public boolean pointDeControle(String couleur,Position arrivee){
        for (int y = 1;y < 7;y++) {
            if (getControle(y).getLigne() == arrivee.getLigne() && getControle(y).getColonne() == arrivee.getColonne())
                return true;
        }
        return false;
    }
}




