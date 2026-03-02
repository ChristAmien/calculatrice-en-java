package JEUX;

public class joueur {
    // attribut de l'objet joueur

    private String nom;
    private int age;
    private int vies;
    private int degats;

    //creation du constructeur

    public joueur(String nom, int vies, int degats, int age){
        this.nom = nom;
        this.degats = degats;
        this.vies = vies;
        this.age = age;
    }

    //Operation d'attaque des joueurs 

    //creation d'une fonction attaquer
    public void attaquer(joueur cible){
        System.out.println(this.nom + " attaque " + cible.getNom() + " et inflige "+ this.degats+ " points de degats !" );
        cible.recevoirDegats(this.degats);
    }

     public void recevoirDegats(int montant) {
        this.vies -= montant;
        if (this.vies <= 0) {
            this.vies = 0;
            System.out.println(this.nom + " est vaincu !");
        } else {
            System.out.println(this.nom + " a maintenant " + this.vies + " vies.");
        }
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Getter pour les vies
    public int getVies() {
        return vies;
    }

    // Afficher l'état du joueur
    public void afficherEtat() {
        System.out.println(nom + " Vies: " + vies + ", Dégâts: " + degats);
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        joueur joueur1 = new joueur("Mario", 100, 20, 30);
        joueur joueur2 = new joueur("Koffi nango", 120, 15,35 );

        joueur1.afficherEtat();
        joueur2.afficherEtat();

        joueur1.attaquer(joueur2);
        joueur2.attaquer(joueur1);
        joueur1.attaquer(joueur2);

        joueur1.afficherEtat();
        joueur2.afficherEtat();
    }
}




