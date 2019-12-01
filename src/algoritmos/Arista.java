
package algoritmos;

import java.util.*;

public class Arista implements Comparable<Arista> {
    
    Vertice a;
    Vertice b;
    String data;
    double weight = 1.0;
    
    public Arista() {
        // Constructor sin parametros because java
    }
    
    public Arista(Vertice a, Vertice b, String data) {
        this.a= a;
        this.b = b;
        this.data = data;
    }
    
    public Arista(Vertice a, Vertice b, String data, double weight) {
        this.a= a;
        this.b = b;
        this.data = data;
        this.weight = weight;
    }
    
    public void setNodes(Vertice A, Vertice B) {
        this.a = A;
        this.b = B;
    }
    
    public HashMap<Integer, Vertice> getNodes() {

        HashMap<Integer, Vertice> hm = new HashMap<>();
        hm.put(1, a);
        hm.put(2, b);
        return hm;
    }
    
    public void setData(String Data) {
        this.data = Data;
    }
    
    public String getData(){
        return data;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(!(o instanceof Arista)) {
            return false;
        }
        Arista ed = (Arista)o;
        return Double.compare(a.getId(), ed.getNodes().get(1).getId()) == 0 && Double.compare(b.getId(), ed.getNodes().get(2).getId()) == 0;
    }

    @Override
    public int hashCode() {
        return (int)Double.hashCode(this.weight);
    }

    @Override
    public int compareTo(Arista edge) {
        if (this.getWeight() > edge.getWeight()) {
            return 1;
        } else if (this.getWeight() < edge.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return "Edge connects node " + this.a.getId() + " to node " + this.b.getId() + " and it has a weight of: " + this.getWeight() + "\n";
    }
}
