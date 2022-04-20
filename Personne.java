import java.util.Scanner;
public class Personne implements IPersonne{
    static Scanner sc = new Scanner(System.in);

    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(){

    }

    public Personne( String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;	
	}
   
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String manger(){
        System.out.println("que mange l'enfant?");     
        String ligne = sc.nextLine();
        return ligne;

    }

    public String travailler(){
        System.out.println("quel est le travail d du pere?");     
        String travail = sc.nextLine();
        return travail;

    }
    public void saisir(){
        System.out.println("Entrer votre nom :");
		this.setNom(sc.nextLine());
		System.out.println("Entrer votre prenom :");
		this.setPrenom(sc.nextLine());
		System.out.println("Entrer votre age :");
		this.setAge(sc.nextInt());

    }
    public void afficher(){
        System.out.println("Nom : " +" "+ this.nom);
		System.out.println("Prenom : " +" "+ this.prenom);
		System.out.println("Age : " +" "+ this.age);

    }

}
