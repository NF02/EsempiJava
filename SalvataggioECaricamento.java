package prova;
import java.io.*;


public class provaS implements Serializable {
	private static final long serialVersionUID=1L;
	public int[] v;
	public String s;

	public provaS() {
		v=new int[10];
		for (int i=0; i<v.length; i++)
		v[i]=i;

		s= "ciao";
	}
}

package prova;
import java.io.*;
public class Esempio{

	public static void salvaFile(String nomeFile) throws FileNotFoundException, IOException{
		FileOutputStream file = new FileOutputStream(nomeFile);
		ObjectOutputStream out = new ObjectOutputStream(file);
		provaS o = new provaS();
		out.writeObject(o);
		out.close();
	}

	public static void leggiFile(String nomeFile) throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream file = new FileInputStream(nomeFile);
		ObjectInputStream in = new ObjectInputStream(file);
		provaS o=(provaS)in.readObject();
		in.close();
		for (int i=0; i<o.v.length; i++)
			System.out.println(o.v[i]);
		System.out.println(o.s);
	}

	public static void main(String []args){
		//System.out.println(divisione(10,0));
		try {
			leggiFile("e:\\pippo.txt");
			System.out.println("OK");
		}

		catch(FileNotFoundException e) {
			System.out.public class NodoAlbero<T>{
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

}println(e.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}
