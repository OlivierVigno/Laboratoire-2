/**
 This program computes the average,maximum and minimum of a set
 of height values.
 */
public class PersonneAnalyzer {
    public static void main(String[] args)
    {
        DataSet personneData = new DataSet();

        personneData.add(new Personne("Olivier", 180));
        personneData.add(new Personne("Samuel", 165));
        personneData.add(new Personne("William", 124));

        Measurable min = personneData.getMinimum();
        Measurable max = personneData.getMaximum();

        System.out.println("hauteur moyenne : " + personneData.getAverage() + "\n");
        System.out.println( "nom de la plus petite personne : " + min.getName());
        System.out.println("hauteur : " + min.getMeasure() + "\n");
        System.out.println( "nom de la plus grande personne : " + max.getName());
        System.out.println("hauteur : " + max.getMeasure());

    }
}
