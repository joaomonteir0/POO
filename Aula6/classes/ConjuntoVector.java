package classes;

public class ConjuntoVector {
    private int size;
    private int[] vector;

    public ConjuntoVector(){
        this.size = 0;
        this.vector = new int[1];
    }

    public void insert(int n){
        if(this.size == this.vector.length){
            this.vector = this.aumentar(this.vector.length);
        }
        if(!this.contains(n)){
            this.vector[this.size++] = n;
        } 
    }

    public boolean contains(int n) {
        for(int i=0; i < this.size; i++) {
            if( this.vector[i] == n ) return true;
        }
        return false;
    }

    public void remove(int n){
        for(int i = 0; i < this.size; i++){
            if(this.vector[i] == n){
                this.size--;
                for(int j = i; j < this.size; j++) {
                    this.vector[j] = this.vector[j+1];
                }
            }
        }
    }


    public int size(){
        return this.size;
    }


    private int [] aumentar(int n) {
        int[] newVector = new int[this.vector.length + n];
        for (int i = 0; i < this.vector.length; i++) {
            newVector[i] = this.vector[i];
        }

        return newVector;
    }

    public ConjuntoVector unir(ConjuntoVector add){
        ConjuntoVector uniao = new ConjuntoVector();
        for (int i = 0; i < this.size(); i++) {
            uniao.insert(this.vector[i]);
        }
        for (int i = 0; i < add.size(); i++) {
            uniao.insert(add.getElem(i));
        }
        return uniao;
    }

    public ConjuntoVector intersect(ConjuntoVector inter){
        ConjuntoVector res = new ConjuntoVector();
        for (int a = 0; a < this.size(); a++) {
            for (int b = 0; b < inter.size(); b++) {
                if (this.getElem(a) == inter.getElem(b)) {
                    res.insert(this.getElem(a));
                }
            }
        }
        return res;
    }

    public ConjuntoVector subtrair(ConjuntoVector dif){
        ConjuntoVector sub = new ConjuntoVector();
        for (int i = 0; i < this.size(); i++) {
            sub.insert(this.getElem(i));
        }
        for (int i = 0; i < dif.size(); i++) {
            sub.remove(dif.getElem(i));
        }
        return sub;
    }


    public void empty(){
        this.size = 0;
        int[] novo = new int[1]; 
        this.vector = novo;
    }


    public int getElem(int n){
        assert this.size > n;
        return this.vector[n];
    }


    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < this.size; i++) {
            string += this.vector[i] + " ";
        }
        return string;
    }
}
