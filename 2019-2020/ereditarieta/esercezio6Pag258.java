abstract public class Veicolo{
	private String targa;
	private String marca;
	private int anno;
	private byte nPasseggeri;
	private double hp;
	public Veicolo(String targa, String marca, int anno, byte nPasseggeri,
double hp){
		this.targa=targa;
		this.marca=marca;
		this.anno=anno;
		this.nPasseggeri=nPasseggeri;
		if(hp>0)
			this.hp=hp;
		else this.hp=-1;
	}
	abstract public double getTassa();
}

abstract public class Auto extends Veicolo{
	public Auto(String targa, String marca, int anno, byte nPasseggeri,
double hp){
			super(targa,marca,anno,nPasseggeri,hp);
	}
	abstract public double getTassa();
}
public class AutoGas extends Auto{
	private boolean gpl;
	public AutoGas(String targa, String marca, int anno, byte nPasseggeri,
double hp, boolean gpl){
		super(targa,marca,anno,nPasseggeri,hp);
		this.gpl=gpl;
	}
	public double getTassa(){
		if(gpl)
			return 0.75/getHp();
		else return 0.5/getHp();
	}
}
public class AutoIdrogeno extends Auto{
	public AutoIdrogeno(String targa, String marca, int anno, byte nPasseggeri,
double hp) {
		super(targa,marca,anno,nPasseggeri,hp);
	}
	public double getTassa(){
		int annoCorrente=2020;
		return (0.1/getHp())*(annoCorrente-getAnno());
	}

}
public class AutoTradizionali extends Auto{
	public double getTassa(){
		return 2.5/getHp();	
	}

}
public class Moto extends Veicolo{
	public double getTassa(){
		return 1.5/getHp();	
	}
}
