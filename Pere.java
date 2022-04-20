import java.util.Scanner;

public  class Pere  extends Personne{
    static Scanner sc = new Scanner(System.in);
    private float salaire;
    private int nbreEnfant;
    private int nbreFemme;
   


    public Pere(){

    }
    public Pere(String nom, String prenom, int age, float salaire, int nbreEnfant, int nbreFemme){
        super(nom, prenom, age);
		this.salaire = salaire;
		this.nbreEnfant = nbreEnfant;
		this.nbreFemme = nbreFemme;
    }
    public float getSalaire() {
        return salaire;
    }
    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
    public int getNbreEnfant() {
        return nbreEnfant;
    }
    public void setNbreEnfant(int nbreEnfant) {
        this.nbreEnfant = nbreEnfant;
    }
    public int getNbreFemme() {
        return nbreFemme;
    }
    public void setNbreFemme(int nbreFemme) {
        this.nbreFemme = nbreFemme;
    }
     @Override
    
    public String travailler() {
        
        return super.travailler();
       
        
            
     }
    @Override
    public void saisir() {
        System.out.println("Quel est le salaire du pere? :");
		this.setSalaire(sc.nextFloat());
        sc.nextLine(); 
        System.out.println("Entrer le nom du pere :");
		this.setNom(sc.nextLine());
		System.out.println("Entrer le prenom du pere :");
		this.setPrenom(sc.nextLine());
		System.out.println("l'age du pere :");
		this.setAge(sc.nextInt());
        System.out.println("le nbre d'enfant du pere :");
		this.setNbreEnfant(sc.nextInt());
        System.out.println("le nbre de femme :");
		this.setNbreFemme(sc.nextInt());
        
    }
    @Override
    public void afficher() {    
        System.out.println("Son salaire est : " +"" +this.salaire);
        System.out.println("nom du pere : " +" "+ this.nom);
		System.out.println("prenom du pere : " +" "+ this.prenom);
		System.out.println("l'age du pere : " +" "+ this.age);
        System.out.println("Le nombre d'enfant du pere : " +"" +this.nbreEnfant);
        System.out.println("son nombre de femme : " +"" +this.nbreFemme);

    }
   
    
    

}