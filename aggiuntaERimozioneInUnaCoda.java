public class HelloWorld{

	public class Coda{
		public boolean rimozione(int n){
			if(head==null)
				return false;
			if(head.getInfo()==n){
				head=head.getNext();
			if(head==null)
				tail=null;
			return true;
			}
			Nodo temp=head;
			while(temp.getNext()!=null && temp.getNext().getInfo()!=n)
			temp=temp.getNext();
			if(temp.getNext()==null)
				return false;
			temp.setNext(temp.getNext().getNext());
			if(temp.getNext()==null)
				tail=temp;
			return true;
		}
}

	public static void main(String []args){
		Coda c= new Coda();
		c.enqueue(1);
		c.enqueue(2);
		c.enqueue(4);
		c.enqueue(3);

		if(c.rimozione(3))
			System.out.println("Cancellato");
		else System.out.println("Processo fallito");
	}
}
