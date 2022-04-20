public class Enfant extends Personne{
    private Mere mere;
    private Pere pere;
    private String classe;
    private String ecole;

    public Enfant(){

    }
    public Enfant(String nom, String prenom, int age, Mere mere, Pere pere, String classe, String ecole){
      super(nom,prenom,age);
      this.pere = pere;
      this.mere = mere;
      this.classe = classe;
      this.ecole = ecole;  
    }

    public Mere getMere() {
        return mere;
    }
    public void setMere(Mere mere) {
        this.mere = mere;
    }
    public Pere getPere() {
        return pere;
    }
    public void setPere(Pere pere) {
        this.pere = pere;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getEcole() {
        return ecole;
    }
    public void setEcole(String ecole) {
        this.ecole = ecole;
    }
     

    @Override
    public String manger() {
       return super.manger();  
        
    }

    @Override
    public void saisir() {
        System.out.println("Entrer le nom de l'enfant :");
		this.setNom(sc.nextLine());
		System.out.println("Entrer le prenom de l'enfant :");
		this.setPrenom(sc.nextLine());
		System.out.println("l'age de lenfant :");
		this.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("la classe de lenfant :");
		this.setClasse(sc.nextLine());
        System.out.println("l'ecole de l'enfant");
        this.setEcole(sc.nextLine());
       
    }
    @Override
    public void afficher() {
        System.out.println("La mère de l'enfant est :"+ mere.getPrenom() + " "+ mere.getNom() );
		System.out.println("Le père de l'enfant est :"+ pere.getPrenom() + " "+ pere.getNom() );
        System.out.println("Nom de l'enfant : " +" "+ this.nom);
		System.out.println("Prenom de l'enfant : " +" "+ this.prenom);
		System.out.println("Age de l'enfant : " +" "+ this.age);
        System.out.println("Classe de l'enfant: " +"" + this.classe);
        System.out.println("Ecole de l'enfant: " +"" + this.ecole);
        
    }
   
}