public class NodoAlbero<T>{
	private T info;
	private NodoAlbero figlio, fratello;

}
public class Albero<T>{
	private NodoAlbero<T> radice;

	public boolean setRadice(T info){
		if(this.radice!=null)
			return false;
		else{ this.radice = new NodoAlbero<T>(info);
			return true;
		}
	}

	public boolean aggiungiFratello(T info, NodoAlbero<T> sorgente){
		if(sorgente==radice || sorgente==null)
			return false;
		NodoAlbero<T> nodo = new NodoAlbero<T>(info);
		while(sorgente.getFratello()!= null)
			sorgente= sorgente.getFratello();
		sorgente.setFratello(nodo);
		return true;
	}
	public boolean aggiungiFiglio(T info, NodoAlbero<T> sorgente){
		if(sorgente.getFiglio()==null){
			NodoAlbero<T> nodo = new NodoAlbero<T>(info);
			sorgente.setFiglio(nodo);
			return true;
		} else return aggiungiFratello(info,sorgente.getFiglio());

	}

	public int conteggioFigli(NodoAlbero<T> nodo){
		int i=0;
		if(nodo==null || nodo.getFiglio()==null){
			return i;
			nodo = nodo.getFiglio();
		}else while(nodo.getFiglio()!=null){
			i++;
		nodo = nodo.getFratello();
	}
}
