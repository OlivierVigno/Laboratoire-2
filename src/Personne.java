/**
 * Class that contains the name and height of a person
 */
public class Personne implements Measurable
{
    private String nom;
    private double hauteur;

    public Personne(String nomPersonne, double hauteurPersonne)
    {
        nom = nomPersonne;
        hauteur = hauteurPersonne;
    }

    @Override
    public double getMeasure() {
        return hauteur;
    }

    public String getName() {return nom; };
}
