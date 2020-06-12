public class HelloWorld{

public static class Animale {
	protected String nome;
	public Animale(String nome) {
		this.nome=nome;
	}
/*public final String esempio() {
return "EsempioAnimale";
}*/
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

/*public String esempio() {
return "EsempioCane" + super.esempio();
}*/
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
		Animale a1 = new Animale("animale");
		Cane c1 = new Cane("cane1");
		Cane c2 = new Cane("cane2");

		Gatto g = new Gatto("gatto");

		Animale a2 = new Cane("caneAnimale");
		Cane c3 = (Cane)a2;

		Animale a3 = new Gatto("gattoAnimale");
//c3 = (Cane)a3;

//Gatto g1 = (Gatto) (new Animale("GattoAnimale"));

//Gatto g2 = (Gatto) (new Cane("caneGatto"));

		Gatto g3 = new Gatto("gatto3");

		a3 = c3;
		Cane c4 = (Cane)a3;

		a3 = g3;
		g = (Gatto) a3;

		Object o = new Animale("ObjectAnimale");

		System.out.println((Animale)o.getNome());
	}
}
