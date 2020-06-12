public class NodoABR{
	private NodoABR sinistro, destro;
	private int info;
}

public class ABR{
	private NodoABR radice;

	public boolean ricerca(int num){
		return ricercaRic(num, radice);
	}
	private boolean ricercaRic(int num, NodoABR nodo ){
		if(nodo==null)
			return false;
		else if (nodo.getInfo()==num)
			return true;
		else if(num>nodo.getInfo())
			return ricercaRic(num,nodo.getDestro());
		else return ricercaRic(num,nodo.getSinistro());
}

	public boolean ricercaIt(int num){
		NodoABR temp=radice;
		while(temp!=null)
			if(temp.getInfo()==num)
				return true;
			else if(num>temp.getInfo())
				temp=temp.getDestro();
			else temp=temp.getSinistro();
				return false;
	}
}
