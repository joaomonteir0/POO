import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int cc;
    private Date birthDate;
    private List<String> bilhetes = new ArrayList<String>();


    public Person(String name, int cc, Date birthDate) {
        this.name = name;
        this.cc = cc;
        this.birthDate = birthDate;
    }

    public void addBilhete(String bilhete){
        bilhetes.add(bilhete);
    }

    public void getBilhetes(){
        String retorno = "";
        for(int i =0; i < bilhetes.size();i++){
            retorno+=bilhetes.get(i)+"\n";
        }
        System.out.println(getName()+" - nº bilhetes: "+bilhetes.size()+"\n"+retorno);
    }

    public boolean getBilhetesSize(){
        return bilhetes.size() < 2;
    }

    public String getName() {
        return name;
    }

    public int getCc() {
        return cc;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + "; CC: " + cc + "; Data de Nascimento: " + birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Person other = (Person) obj;
        return this.cc == other.cc && this.name.equals(other.name) && this.birthDate.equals(other.birthDate);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        result = prime * result + cc;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

}