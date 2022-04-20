package classes;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.TimeZone;

public class Aluno extends Pessoa{

    private int nMec;
    private Date sub;
    private static int count = 100;

    public Aluno(String nome, int cc, Date dataNasc, Date sub) {
        super(nome, cc, dataNasc);
        this.sub = sub;
        this.nMec = count;
        count++;

    }

    public Aluno(String nome, int cc, Date dataNasc) {
        super(nome, cc, dataNasc);
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
        int currentDay = localCalendar.get(Calendar.DATE);
        int currentYear = localCalendar.get(Calendar.YEAR);
        Date nova = new Date(currentDay, currentMonth, currentYear);
        this.sub = nova;
        this.nMec = count;
        count++;

    }


    public int getNMec (){
        return nMec;
    }

    public Date getSUB (){
        return this.sub;
    }

    @Override
    public String toString() {
        return "'"+getName()+"'; CC:"+getCC()+"; Data de Nascimento: "+getSUB();
    }

    
}
