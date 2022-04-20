public class Main{
public static void main(String[] args) {
    Pere cheikh = new Pere();

    String test = cheikh.travailler();
    cheikh.saisir();

    System.out.println("le travail du pere : " + test);
    cheikh.afficher();


    Mere maimouna = new Mere();
    maimouna.saisir();
    maimouna.afficher();


    Enfant dior = new Enfant();

     String mange = dior.manger();

     dior.setPere(cheikh);
	 dior.setMere(maimouna);
      
     dior.saisir();

    System.out.println("L'enfant a mangé:" + mange);
    dior.afficher();
 }
 
 
}
