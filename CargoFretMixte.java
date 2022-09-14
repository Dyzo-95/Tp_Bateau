public class CargoFretMixte extends Main.Bateau {


    public CargoFretMixte(int longueur, int largeur, int hauteur, int tirandeau, int propulsion, int vitesse, char categorie, String matierestransportees, int nbPassager, int poidsmax, int charge, int nbrmembreEquipage) {
        super(poidsmax, longueur, largeur, hauteur, tirandeau, propulsion, vitesse, categorie, matierestransportees, charge, nbrmembreEquipage, nbPassager);
    }

    public void afficherCaracteristiquesCargo(CargoFretMixte cargoFretMixte) {
        cargoFretMixte.afficherCaractéristiqueBateau(cargoFretMixte);
        String newLine = System.getProperty("line.separator");
        System.out.println("Matières Transportés" + getMatierestransportees() + newLine);
        System.out.println("Poids maximum autorisé" + getPoidsmax() + newLine);
        System.out.println("Charge actuelle" + getCharge() + newLine);
        System.out.println("Membres d'équipages au complet" + getNbrMembreEquipage() + newLine);
    }

    public void traiterCargofretMixte(CargoFretMixte cargoFretMixte) {
        int lesPassagers = cargoFretMixte.getNbPassager();
        String newLine = System.getProperty("line.separator");
        cargoFretMixte.calculerNbPassager(cargoFretMixte, lesPassagers);
        if (cargoFretMixte.getNbPassager() <=12) {
            System.out.println("Le nombre de passagers embarqués sur le cargo de fret mixte est de " + cargoFretMixte.getNbPassager() + newLine);
        }
        else {
            System.out.println("Le nomre de passagers dépasse la limite autorisée : vous avez demandez " + cargoFretMixte.getNbPassager() + "alors que maximum est de 12 passagers" + newLine);
        }

        int cargaisonSeche = (int) (cargoFretMixte.getPoidsmax() * 0.55);
        int totalCargaisonSeche = 0;

        while (totalCargaisonSeche < cargaisonSeche) {
            cargoFretMixte.calculerChargeBateau(cargoFretMixte, totalCargaisonSeche);
            totalCargaisonSeche = getCharge();
        }

        totalCargaisonSeche = getCharge();
        System.out.println("La cargaison sèche représente " + totalCargaisonSeche + "tonnes sur un poids maximum de " + cargoFretMixte.getPoidsmax() + newLine);

        int cargaisonLiquide = (int) (cargoFretMixte.getPoidsmax() * 0.35);
        int totalCargaisonLiquide = 0;

        while (totalCargaisonLiquide < cargaisonLiquide) {
            cargoFretMixte.calculerChargeBateau(cargoFretMixte, totalCargaisonLiquide);
            totalCargaisonLiquide = cargoFretMixte.getCharge();
        }

        totalCargaisonLiquide = cargoFretMixte.getCharge();
        System.out.println("La cargaison liquide représente " + totalCargaisonLiquide + "sur un poids maximum de " + cargoFretMixte.getPoidsmax() + newLine);

        int totalChargeFret = totalCargaisonSeche + totalCargaisonLiquide;
        System.out.println("Le poids total de charge représente " + totalChargeFret + "sur un poids maximum de " + cargoFretMixte.getPoidsmax() + newLine);

        cargoFretMixte.afficherBateauPret();
    }
}
