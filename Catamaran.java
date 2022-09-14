class Catamaran extends Main.Bateau {

    public Catamaran(int longueur, int largeur, int hauteur, int tirandeau, int propulsion, int vitesse, char categorie, String matierestransportees, int nbPassager, int poidsmax, int charge, int nbrmembreEquipage) {
        super(poidsmax, longueur, largeur, hauteur, tirandeau, propulsion, vitesse, categorie, matierestransportees, charge, nbrmembreEquipage, nbPassager);

    }
    public void afficherCaracteristiquesCatamaran(Catamaran catamaran) {
        catamaran.afficherCaractéristiqueBateau(catamaran);
    }

    public void chargerMembresEquipage(Catamaran catamaran) {
        int lesmembresEquipes = catamaran.getNbrMembreEquipage();
        catamaran.trouverEquipage(catamaran, lesmembresEquipes);
        String newLine = System.getProperty("line.separator");

        if (getNbrMembreEquipage() <= 7) {
            System.out.println("Les membres d'équipage sont composés de : " + catamaran.getNbrMembreEquipage() + "membre(s)" + newLine);
        }
        else {
            System.out.println("Nombre des membres de l'équipage supérieur au nombre requis: " + catamaran.getNbrMembreEquipage() + "équipage refus" + newLine);
        }

    }


}

