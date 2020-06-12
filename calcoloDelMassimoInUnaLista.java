/*
	1) Restituire il nodo con il max;
	2) Lette in input due liste di numeri interi ognuna delle quali ordinata,
	costruire una terza lista di numeri interi ordinata, ottenuta mediante
	la “fusione” delle prime due.
	3) Data una lista L e due indici i e j restituire la stessa lista in cui
	gli elementi di posto i e di posto j risultino scambiati.
*/
public Nodo getMax() {
	Nodo temp=head;
	Nodo nodoMax=NULL;
	while (temp!=null) {
		if (nodoMax==NULL || temp.getInfo()>nodoMax.getInfo())
			nodoMax=new Nodo(temp);
			temp=temp.getNext();
		}
	return nodoMax;
}

public Lista fusioneListe(Lista l) {
	Lista listaFusione=new Lista();

	Nodo temp1=this.head;
	Nodo temp2=l.head;

	while(temp1!=NULL && temp2!=NULL) {
		if (temp1.getInfo()<temp2.getInfo()) {
			listaFusione.inserisciInCoda(temp1.getInfo());
			temp1=temp1.getNext();
		} else {
			listaFusione.inserisciInCoda(temp2.getInfo());
			temp2=temp2.getNext();
		}
	}

	while(temp1!=NULL) {
		listaFusione.inserisciInCoda(temp1.getInfo());
		temp1=temp1.getNext();
	}

	while(temp2!=NULL) {
		listaFusione.inserisciInCoda(temp2.getInfo());
		temp2=temp2.getNext();
	}


	return listaFusione;
}

public boolean scambiaNodi(int i, int j) {
Nodo tempI=NULL, tempJ=NULL;
Nodo temp;

int indice=0;

while (temp!=NULL && (tempI==NULL || tempJ==NULL)) {
if (indice==i)
tempI=temp;
else if (indice==j)
tempJ=temp;

temp=temp.getNext();
indice++;
}

if (tempI!=NULL && tempJ!=NULL) {
int numTemp=tempI.getInfo();
tempI.setInfo(tempJ.getInfo());
tempJ.setInfo(numTemp);
return true;
}
else return false;
}
