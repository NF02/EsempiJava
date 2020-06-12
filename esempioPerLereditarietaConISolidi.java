public class HelloWorld{

	abstract public static class Solido {
		private double pesoSpecifico;

		public Solido(double pesoSpecifico) {
			this.pesoSpecifico=pesoSpecifico;
		}

		abstract public double getVolume();

		public double getPeso() {
			System.out.println("SOLIDO");
			return pesoSpecifico * getVolume();
		}
}

	public static class Cubo extends Solido {
		private double lato;
		public Cubo(double lato, double pesoSpecifico) {
			super(pesoSpecifico);
			this.lato=lato;
		}
		public double getVolume() {
			System.out.println("CUBO");
			return lato*lato*lato;
		}

}

	public static class Sfera extends Solido {
		private double raggio;
		public Sfera(double raggio, double pesoSpecifico) {
			super(pesoSpecifico);
			this.raggio=raggio;
		}
		public double getVolume() {
			System.out.println("SFERA");
			return 4/3 Math.PI raggio*raggio*raggio;
		}

	}


	public static void main(String []args){

		Solido v[] = new Solido[10];

		if (Math.random() > 0.5)
			v[0]= new Cubo(1,10);
		else v[0]= new Sfera(2,10);

		//v[1]= new Sfera(2,10);

		//v[2]= new Solido(50);
		System.out.println(v[0].getPeso());
		//System.out.println(v[1].getPeso());
	}
}
