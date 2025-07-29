package org.example.level2;

import org.example.level2.concreteObserver.StockAgency;
import org.example.level2.concreteSubject.StockAgent;

public class Main {
    public static void main(String[] args){

        StockAgent agent = new StockAgent();

        agent.register(new StockAgency("Global Exchange"));
        StockAgency arbolito = new StockAgency("Arbolito");
        agent.register(arbolito);

        System.out.println("\n*** Notificando suba ***");
        agent.setMarketState(178542.24, "subiendo");

        System.out.println("\n*** Notificando baja ***");
        agent.setMarketState(169874.79, "bajando");

        agent.remove(arbolito);

        System.out.println("\n*** Notificando suba a un solo observador ***");

        agent.setMarketState(197554.77, "subiendo");
    }
}
