package algoritmos;

import java.util.HashMap;

public class Vertice implements Comparable<Vertice> {
    
    int id, grad = 0;
    String name, data;
    double x,y;
    boolean visited = false;
    HashMap<Integer, Vertice> adjacentNodes = new HashMap<>();
    double cost = 0;
    //Comentario para probar los commit
    
    public Vertice() {
    }
    
    public Vertice(int id, String name, String data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }
    
    public Vertice(int id, String name, double x, double y, String data) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.x = x;
        this.y = y;
    }
    
    public void setAdjacent(Vertice nodo) {
        adjacentNodes.put(nodo.getId(), nodo);
    }
    
    public HashMap<Integer, Vertice> getAdjacentNodes() {
        return adjacentNodes;
    }
    
    public void setId(int Id) {
        id = Id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setName(String Name) {
        name = Name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setData(String Data) {
        data = Data;
    }
    
    public String getData() {
        return data;
    }
    
    public void setCoord(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void updateGrad() {
        this.grad += 1;
    }
    
    public int getGrad() {
        return grad;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public double getCost() {
        return cost;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vertice nodo = (Vertice) o;
        return Double.compare(nodo.cost, cost) == 0;
    }

    @Override
    public int hashCode() {
        return (int)Double.hashCode(this.cost);
    }

    @Override
    public int compareTo(Vertice node) {
        if (this.getCost() > node.getCost()) {
            return 1;
        } else if (this.getCost() < node.getCost()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return "Node " + this.getId() + " it has a cost: " + this.getCost() + " and it is " + this.visited + " that's been visited.\n";
    }
}
