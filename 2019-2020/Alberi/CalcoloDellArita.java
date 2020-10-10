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
		}
		else return aggiungiFratello(info,sorgente.getFiglio());

	}

	public int conteggioFigli(NodoAlbero<T> nodo){
		if(nodo==null || nodo.getFiglio()==null)
			return 0;
		int i=1;
		nodo = nodo.getFiglio();
		while(nodo.getFratello()!=null){
			i++;
		nodo = nodo.getFratello();
		}
		return i;
	}

	public int conteggioFratelliRic(NodoAlbero<T> nodo){
		if(nodo==null || nodo.getFratello()==null)
			return 0;
		return 1+conteggioFratelliRic(nodo.getFratello());
	}

	private int conteggioFigliRic(NodoAlbero<T> nodo){
		if(nodo==null || nodo.getFiglio()==null)
			return 0;
		return 1+conteggioFratelliRic(nodo.getFratello());
	}

	public int getArita(){
		return getArita(radice, 0);
	}

	private int getArita(NodoAlbero<T> nodo, int max){
		if(nodo==null)
			return 0;
		int nFigli=nodo.conteggioFigli();
		if(nFigli > max)
			max= nFigli;
		nFigli=getArita(nodo.getFratello(), max);
		if(nFigli > max)
			max= nFigli;
		nFigli=getArita(nodo.getFiglio(), max);
		if(nFigli > max)
			max= nFigli;
		return max;
	}

}
