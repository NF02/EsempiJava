Un’agenzia di pratiche automobilistiche deve
com missionare un software per il pagamento
delle tasse annuali sui veicoli. Un professionista
viene incaricato di progettare e implementare la
gerarchia di classi che rappresentano i veicoli.
Durante un’intervista al proprietario dell’agenzia
emerge quanto segue:
- i veicoli possono essere motoveicoli o autoveicoli;
- per ogni veicolo è necessario memorizzare la targa, la marca,
  il modello, l’anno di immatricolazione e il numero di passeggeri 
  consentito oltre al conducente;
- i motoveicoli sono sempre alimentati a benzina e sono 
  caratterizzati dalla potenza espressa in HP: la tassa 
  viene calcolata moltiplicando per la potenza un valore che a
  oggi vale 1,5€/HP;
- gli autoveicoli tradizionali possono essere alimentati 
  a benzina o a gasolio e sono caratterizzati dalla potenza 
  espressa in HP: la tassa viene calcolata moltiplicando per
  la potenza un valore che a oggi vale 2,5€/HP;
- per gli autoveicoli alimentati a gas, oltre alla potenza è 
  necessario memorizzare il tipo gas (*GPL o metano*): questi
  autoveicoli non pagano nessuna tassa per i primi 5 anni
  dall’immatricolazione, trascorso questo periodo la tassa
  viene calcolata moltiplicando per la potenza un valore che
  a oggi vale 0,5€/HP per il metano e 0,75€/HP per il GPL;
- gli autoveicoli alimentati a gas idrogeno pagano una tassa
  che aumenta di 0,1 `/HP per ogni anno di vita del veicolo 
  a partire da una tassa iniziale pari a 0€/HP il primo anno
  di immatricolazione;
- come incentivo governativo gli autoveicoli elettrici 
  non pagano alcuna tassa.
  
L’incarico consiste nel progettare mediante un diagramma UML le classi che rappresentano la
situazione descritta dal proprietario dell’agenzia e di implementarle in linguaggio Java. Per
verificare il lavoro svolto è necessario realizzare una classe Test il cui metodo main istanzi
oggetti corrispondenti alle varie tipologie di
veicoli visualizzando per ciascuno una breve
descrizione delle caratteristiche e la tassa da
pagare.
