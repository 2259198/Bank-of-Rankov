package Model;

import java.util.ArrayList;

public class Model {

    private static Model instance = new Model();

    private ArrayList<String> utilisateurs = new ArrayList<String>();
    private ArrayList<String> motDePasses = new ArrayList<String>();

    private Model() {}

    public static Model getInstance()
    {
        return instance;
    }

    public void ajouterUtilisateur(String utilisateur, String motDePasse)
    {
        utilisateurs.add(utilisateur);
        motDePasses.add(motDePasse);

        System.out.println("Utilisateur ajouté :" + utilisateur);
    }

    public boolean utilisateurExiste(String utilisateur)
    {
        return utilisateurs.contains(utilisateur);
    }

    public void printAllUsers() {
        System.out.println("=== Liste des utilisateurs ===");
        for (int i = 0; i < utilisateurs.size(); i++) {
            System.out.println("Utilisateur : " + utilisateurs.get(i) + " | Mot de passe : " + motDePasses.get(i));
        }
    }

}
