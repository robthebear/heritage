public class Personne{
    String prenom;
    int age;

    public Personne(String prenom, int age){
this.prenom = prenom;
this.age = age;
    }

    public void dormir() {
        System.out.println("Rrrrrrr Rrrrrrr");
        
    }
    public void manger(String fruit) {
        System.out.println("Miam miam, c’est bon ce fruit, " +fruit+ "!");
        
    }
    public void bonjour() {
        System.out.println("Bonjour, je suis prenom et j’ai "+age+" ans");
        
    }
}