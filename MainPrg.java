public class MainPrg {
    public static void main (String[] args ) {

        String newLine = System.getProperty("line.separator");

        System.out.println("Voici un type de bateau à traiter" + newLine);

        String bateauATraiter = "cargo";

        // En fonction de la valeur rentrée
        // Instanciation du bateau et on charge les attributs directement pour que le constructeur initialise les objets du bateau
        // Affichage des caractéristiques du bateau par le biais de la méthode afficherCaractéristique qui elle-même fait appelle aux accesseurs du bateau
        // Appel de la méthode traiterContener qui apelle calculerChargeBateau pour remplir le bateau
        // Appel à la méthode afficherResultat pour avoir le résultat final

        switch (bateauATraiter) {
            case "tanker":
                Tanker tanker = new Tanker(356, 53, 40, 15, 96280, 24, 'A', "liquide en vrac", 0, 45000, 0, 20);
                tanker.afficherCaracteristiqueTanker(tanker);
                tanker.traiterTanker(tanker);
                break;
            case "catamaran":
                Catamaran catamaran = new Catamaran(17, 8, 3, 2, 1200, 20, 'B', "Bateau de course", 0, 4500, 2000, 7);
                catamaran.afficherCaracteristiquesCatamaran(catamaran);
                catamaran.chargerMembresEquipage(catamaran);
                break;
            case "cargo":
                CargoFretMixte cargoFretMixte = new CargoFretMixte(20, 15, 6, 12, 120000, 15, 'C', "cargaison sèche ou liquide", 12, 12000, 0, 10);
                cargoFretMixte.afficherCaractéristiqueBateau(cargoFretMixte);
                cargoFretMixte.traiterCargofretMixte(cargoFretMixte);
                break;
            case "plaisancier":
                Plaisancier plaisancier = new Plaisancier(1200, 1500, 7, 3, 3, 11, 15000, 10, 'D', "Plaisancier", 0, 1000, 1200, 5);
                plaisancier.afficherCaracteristiquePlaisancier(plaisancier);
                plaisancier.chargeNbPassager(plaisancier);
                break;
            default:
                System.out.println("Type de bateau non prévu dans le traitement des bateaux");
                break;
        }


    }
}
