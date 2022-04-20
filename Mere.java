public  class Mere  extends Personne{
    private boolean indo;

    public Mere(){

    }
    public Mere(String nom, String prenom, int age, boolean indo) {
        super(nom, prenom, age);
        this.indo = indo;
    }

    public boolean isIndo() {
        return indo;
    }

    public void setIndo(boolean indo) {
        this.indo = indo;
    }
    public void saisir(){
        System.out.println("Entrer le nom de la mère :");
		this.setNom(sc.nextLine());
		System.out.println("Entrer le prenom de la mere :");
		this.setPrenom(sc.nextLine());
		System.out.println("l'age de la mère :");
		this.setAge(sc.nextInt());
        System.out.println("est-elle indo? :");
		this.setIndo(sc.nextBoolean());
        sc.nextLine();

    }

    public void afficher(){
        System.out.println(" Nom de la mere : " +" "+ this.nom);
		System.out.println(" Prenom de la mere : " +" "+ this.prenom);
		System.out.println(" Age de la mere : " +" "+ this.age);
        System.out.println("est-elle indo?? : " +" "+ this.indo);

    }
}