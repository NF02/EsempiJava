public class NodoAlberoBinario<T>{
    private T info;
    private NodoAlberoBinario<T> sinistro,destro;
    //Costruttore, equals e altre cose già dichiarate
}
public class AlberoBinario<T>{
    private NodoAlberoBinario radice;
    
    public void visitaSimmetrica(){
         visitaSimmetricaRic(radice);   
    }
    private void visitaSimmetricaRic(NodoAlberoBinario<T> nodo){
        if(nodo!=null){
            visitaSimmetricaRic(nodo.getSinistro());
            System.out.println(nodo.getInfo());
            visitaSimmetricaRic(nodo.getDestro());
        }
    }
    
    ///
     public void visitaDifferita(){
         visitaDifferitaRic(radice);   
    }
    private void visitaDifferitaRic(NodoAlberoBinario<T> nodo){
        if(nodo!=null){
            visitaDifferitaRic(nodo.getSinistro());
            visitaDifferitaRic(nodo.getDestro());
            System.out.println(nodo.getInfo());
        }
    }
    //
     public void visitaAnticipata(){
         visitaAnticipataRic(radice);   
    }
    private void visitaAnticipataRic(NodoAlberoBinario<T> nodo){
        if(nodo!=null){
            System.out.println(nodo.getInfo());
            visitaAnticipataRic(nodo.getSinistro());
            visitaAnticipataRic(nodo.getDestro());
        }
    }
    public T getMax(){
        getMaxRic(radice);
    }
    private T getMaxRic(NodoAlberoBinario<T> nodo){
            if(nodo.getSinistro()==null && nodo.getDestro()==null)
                return nodo.getInfo();
            else{
                T maxSinistro=getMaxRic(nodo.getSinistro());
                T maxDestro=getMaxRic(nodo.getDestro());
                if(maxSinistro>nodo.getInfo()&& maxSinistro>maxDestro)
                    return maxSinistro;
                else if(maxDestro>nodo.getInfo()&& maxDestro>maxSinistro)
                    return maxDestro;
                    else return nodo.getInfo();
                    
            }
        
    }
    //compare To e controllo del null
    //funzione per calcolare l'altezza dell'albero binario
}
