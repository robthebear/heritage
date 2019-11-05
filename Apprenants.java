package heritage;

public class Apprenants extends Personne {
String lieuDeTravail;
Os systeme;
    

public enum Os{
    INDEFINI, 
    WINDOWS, 
    MAC, 
    LINUX,

}
    public Apprenants(String prenom, int age, String lieuDeTravail, Os systeme){
super(prenom, age);
this.lieuDeTravail= lieuDeTravail;
this.systeme = systeme;
    }

    public void travailler() {
        System.out.println("Dur dur java !");
    }

    public void chomer() {
        System.out.println("Ah que j’aime les pauses café …");
    }

    public void bonjour() {
        super.bonjour();
        String sys = "";
        if (systeme == Os.INDEFINI) {
            sys = "Tu ne connais pas encore ton OS !";
        }else if (systeme == Os.WINDOWS) {
            sys = "Tu vas bosser sur Windows ! Super, comme en formation !";
        }else if (systeme == Os.LINUX) {
            sys = "Tu vas bosser sur Linux ! Tu aimes la liberté !";
        }else if (systeme == Os.MAC) {
            sys = "Tu vas bosser sur Mac ! Wahou ! Mais tu as le plus de chance toi!!!";
        }
        System.out.println( sys +"\nTon lieu de travail est à "+lieuDeTravail+"." );
    }
}