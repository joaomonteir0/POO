package classes;
public class Voo {
    private String hora,voo,companhia,origem,atraso,obs;

    public Voo(String hora,String voo, String companhia, String origem, String atraso, String obs){
        this.hora = hora;
        this.voo = voo;
        this.companhia = companhia;
        this.origem = origem;
        this.atraso = atraso;
        String [] horaSplit = this.hora.split("\\W");
        String [] atrasoSplit = this.atraso.split("\\W");

        // hora e atraso em minutos
        if(atraso != " "){
            int horaInt = Integer.parseInt(horaSplit[0])*60 + Integer.parseInt(horaSplit[1]);
            int atrasoInt =  Integer.parseInt(atrasoSplit[0])*60 + Integer.parseInt(atrasoSplit[1]);
            int previstoInt = horaInt + atrasoInt;
            String horasAtraso, minutosAtraso;

            if(previstoInt/60 > 0){
                if(previstoInt/60 < 10){
                    horasAtraso = "0"+Integer.toString(previstoInt/60);
                }else{
                    horasAtraso = Integer.toString(previstoInt/60);
                }
            }else{
                horasAtraso = "00";
            }

            if(previstoInt%60 > 0){
                if(previstoInt%60 < 10){
                    minutosAtraso = "0"+Integer.toString(previstoInt%60);
                }else{
                    minutosAtraso = Integer.toString(previstoInt%60);
                }
            }else{
                minutosAtraso = "00";
            }

            String obsFinal = horasAtraso + ":" + minutosAtraso;
            this.obs = "Previsto: "+obsFinal;
        }else{
            this.obs = " ";
        }
    }


    public String getHora(){
        return this.hora;
    }

    public String getVoo(){
        return this.voo;
    }

    public String getCompanhia(){
        return this.companhia;
    }

    public String getOrigem(){
        return this.origem;
    }

    public String getAtraso(){
        return this.atraso;
    }
    public String getObs(){
        return this.obs;
    }

    public int getAtrasoInt(){
        String [] atrasoSplit = this.atraso.split("\\W");
        if(atraso != " "){
            
            int atrasoInt =  Integer.parseInt(atrasoSplit[0])*60 + Integer.parseInt(atrasoSplit[1]);
            return atrasoInt;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        String darReturn = String.format("%s\t%s\t%s\t%s\t%s", getHora(), getVoo(), getCompanhia(), getOrigem(), getAtraso(), getObs());
        return darReturn;
    }
}