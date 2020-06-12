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
			System.out.println(e.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}
