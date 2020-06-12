public class ABR{
	private NodoABR radice;

	public void cancella(int n){
		if(radice!=null){
			if(radice.getInfo()==n){
				if(radice.getDestro()==null && radice.getSinistro()==null) //foglia
					radice=null;
				else if(radice.getDestro()==null) //un solo figlio, il sinistro
					radice=radice.getSinistro();
				else if(nodo.getSinistro()==null) //un solo figlio, il destro
					radice=radice.getDestro();
				else //2 figli
					radice.setInfo(cancellaMin(radice.getDestro()));
			}else if(n>radice.getInfo())
				cancellaRic(n, radice.getDestro(), radice);
			else cancellaRic(n, radice.getSinistro(), radice);
		}
	}

	private void cancellaRic(int n, NodoABR nodo, NodoABR padre){
		if(nodo.getInfo()==n){
			if(nodo.getDestro()==null && nodo.getSinistro()==null){ //foglia
				if(n>padre.getInfo())
					padre.setDestro(null);
				else padre.setSinistro(null);
			}else if(nodo.getDestro()==null){ //un solo figlio, il sinistro
				if(n>padre.getInfo())
					padre.setDestro(nodo.getSinistro());
				else padre.setSinistro(nodo.getSinistro());
			}else if(nodo.getSinistro()==null){ //un solo figlio, il destro
				if(n>padre.getInfo())
					padre.setDestro(nodo.getDestro());
				else padre.setSinistro(nodo.getDestro());
			}else //2 figli
				nodo.setInfo(cancellaMin(nodo.getDestro()));
			}
		else if(n>nodo.getInfo())
			cancellaRic(n, nodo.getDestro(), nodo);
		else cancellaRic(n, nodo.getSinistro(), nodo);
	}

	private int cancellaMin(NodoABR nodo){
		int temp;
		while(nodo.getSinistro().getSinistro()!=null)
			nodo=nodo.getSinistro();
		temp=nodo.getSinistro().getInfo();
		nodo.setSinistro(nodo.getSinistro().getDestro());
		return temp;
	}
}
