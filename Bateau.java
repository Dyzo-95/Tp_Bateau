import static java.lang.Math.random;

class Main {
    static class Bateau {
        private int poidsmax;
        private int longueur;
        private int largeur;
        private int hauteur;
        private int tirandeau;
        private int propulsion;
        private int vitesse;
        private char categorie;
        private String matierestransportees;
        private int charge;
        private int nbrmembreEquipage;
        private int nbPassager;



        public Bateau (int longueur, int largeur, int hauteur, int tirandeau, int propulsion, int vitesse, char categorie, String matierestransportees, int nbPassager, int poidsmax, int charge, int nbrmembreEquipage) {
            this.poidsmax = poidsmax;
            this.longueur=longueur;
            this.largeur=largeur;
            this.hauteur=hauteur;
            this.tirandeau=tirandeau;
            this.propulsion=propulsion;
            this.vitesse=vitesse;
            this.categorie=categorie;
            this.matierestransportees=matierestransportees;
            this.charge=charge;
            this.nbrmembreEquipage=nbrmembreEquipage;
            this.nbPassager=nbPassager;
        }



        public int getPoidsmax() {
            return poidsmax;
        }

        public int getLongueur() {
            return longueur;
        }

        public int getLargeur() {
            return largeur;
        }

        public int getHauteur() {
            return hauteur;
        }

        public int getTirandeau() {
            return tirandeau;
        }

        public int getPropulsion() {
            return propulsion;
        }

        public int getCharge() {
            return charge;
        }

        public int getVitesse() {
            return vitesse;
        }

        public char getCategorie() {
            return categorie;
        }

        public String getMatierestransportees() {
            return matierestransportees;
        }

        public int getNbrMembreEquipage() {
            return nbrmembreEquipage;
        }

        public int getNbPassager() {
            return nbPassager;
        }

        public void setNbPassager(int nbPassager) {
            this.nbPassager = nbPassager;
        }

        public void setPoidsmax(int poidsmax) {
            this.poidsmax = poidsmax;
        }

        public void setCategorie(char categorie) {
            this.categorie = categorie;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public void setHauteur(int hauteur) {
            this.hauteur = hauteur;
        }

        public void setLargeur(int largeur) {
            this.largeur = largeur;
        }

        public void setLongueur(int longueur) {
            this.longueur = longueur;
        }

        public void setMatierestransportees(String matierestransportees) {
            this.matierestransportees = matierestransportees;
        }

        public void setNbrmembreEquipage(int nbrmembreEquipage) {
            this.nbrmembreEquipage = nbrmembreEquipage;
        }

        public void setPropulsion(int propulsion) {
            this.propulsion = propulsion;
        }

        public void setTirandeau(int tirandeau) {
            this.tirandeau = tirandeau;
        }

        public void setVitesse(int vitesse) {
            this.vitesse = vitesse;
        }

        public static void remplirBateau() {
            int poidsmax = 0;

            poidsmax = poidsmax +100;

        }
        public void afficherCaractéristiqueBateau(Bateau categorie) {

            String newLine = System.getProperty("line.separator");
            System.out.println("Caractéristique du bateau" + newLine);

            switch (getCategorie()) {
                case 'A':
                    System.out.println("Catégorie" + getCategorie() + "Bateau de type Tanker" + newLine);
                    break;
                case 'B':
                    System.out.println("Catégorie" + getCategorie() + "Bateau de Catamaran" + newLine);
                    break;
                case 'C':
                    System.out.println("Catégorie" + getCategorie() + "Bateau de type Cargo de fret Mixte" + newLine);
                    break;
                case 'D':
                    System.out.println("Catégorie" + getCategorie() + "Bateau de type Plaisancier" + newLine);
                    break;
                default:
                    System.out.println("Type de catégorie bateau non prévu dans le traitement des bateaux" + newLine);
                    break;
            }

            System.out.println("Longueur" + getLongueur() + newLine);
            System.out.println("Largeur" + getLargeur() + newLine);
            System.out.println("Hauteur" + getHauteur() + newLine);

            System.out.println("Tirant d'eau" + getTirandeau() + newLine);
            System.out.println("Propulsion" + getPropulsion() + newLine);
            System.out.println("Vitesse" + getVitesse() + newLine);
        }

        public void afficherBateauPret() {
            String newLine = System.getProperty("line.separator");
            System.out.println("Bateau pret à prendre la mer" + newLine);
        }

        public int calculerChargeBateau(CargoFretMixte cargoFretMixte, int charge) {
            charge = (int) (charge + random()*(1000 - 10));
            return charge;
        }

        public int calculerNbPassager(CargoFretMixte cargoFretMixte, int nbPassager) {
            nbPassager = (int) (nbPassager + random()*(15-0));
            return nbPassager;
        }

        public int trouverEquipage(Catamaran catamaran, int nbrmembreEquipage) {
            nbrmembreEquipage = (int) (nbrmembreEquipage + random()*(20-1));
            return nbrmembreEquipage;
        }

    }


}

