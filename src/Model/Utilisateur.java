package Model;

public class Utilisateur {

    protected String utilisateur;
    protected String motDePasse;

    public Utilisateur(String utilisateur, String motDePasse)
    {
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;
    }

    public String getUtilisateur()
    {
        return utilisateur;
    }

    public String getMotDePasse()
    {
        return motDePasse;
    }

}
