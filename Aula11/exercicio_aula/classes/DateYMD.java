package classes;

public class DateYMD {
    private int month;
    private int year;
    private int days;

    public DateYMD(int dias,  int mes, int ano){
        days = dias;
        month = mes;
        year = ano;
    }

    public int getDia(){return days;}
    public int getMes(){return month;}
    public int getAno(){return year;}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(days);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(month);
		result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(year);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
            DateYMD other = (DateYMD) obj;
		if (Double.doubleToLongBits(days) != Double.doubleToLongBits(other.days))
			return false;
		if (Double.doubleToLongBits(month) != Double.doubleToLongBits(other.month))
			return false;
        if (Double.doubleToLongBits(year) != Double.doubleToLongBits(other.year))
			return false;    
		return true;
	}
}
