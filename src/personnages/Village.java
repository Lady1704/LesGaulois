package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois[] villageois; 
    private int nbVillageois;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.villageois = new Gaulois[100]; 
        this.nbVillageois = 0; 
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
        } else {
            System.out.println("Le village est plein, pas de place pour plus de villageois.");
        }
    }

}
