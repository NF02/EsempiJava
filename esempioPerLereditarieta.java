public class HelloWorld{

     public static class Animale {
         protected String nome;
         public Animale(String nome) {
             this.nome=nome;
         }
         public String getNome() {
             return this.nome;
         }
     }
     
     public static class Cane extends Animale {
         public Cane(String nome) {
             super(nome);
         }
         public String getVerso() {
             return "Bau";
         }
         /*public String getNome() {
             return "Sono nella classe Cane " + nome;
         }*/
     }
     
     public static class Gatto extends Animale {
         public Gatto(String nome) {
             super(nome);
         }
         public String getVerso() {
             return "Miao";
         }
     }

     public static void main(String []args){
        Animale a = new Animale("animale");
        Cane c = new Cane("cane");
        Gatto g = new Gatto("gatto");
        
        a = c;

        System.out.println(a.getVerso());
     }
}
