package model;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kangaroo {
//Constant
	public char FEMALE = 'F';
	public char NO_FEMALE = 'N';
	public char H_RISK = 'H';
	public char L_RISK = 'L';
	public char M_RISK = 'M';

//Atributes
	private String name;
	private char gender;
	private double weigth;
	private double heigth;
	private String blood;
	private boolean vaccine;

//Relations
	public Date born;

//Constructor
	public Kangaroo(String name, char gender, double weigth, double heigth, String blood, boolean vaccine, int dayB, int monthB, int yearB) {
		this.name = name;
		this.gender = gender;
		this.weigth = weigth;
		this.heigth = heigth;
		this.blood = blood;
		this.vaccine = vaccine;
		born = new Date(dayB, monthB, yearB);
	}

//Getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getWeigth() {
		return this.weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public double getHeigth() {
		return this.heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public String getBlood() {
		return this.blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public boolean getVaccine() {
		return this.vaccine;
	}

	public void setVaccine(boolean vaccine) {
		this.vaccine = vaccine;
	}

//Method to show the dates of vaccine of every kangaroo.
	public String calculateDatesVaccine(){
		Calendar fecha = new GregorianCalendar();
	    int actualYear = fecha.get(Calendar.YEAR);
	    int actualMonth = fecha.get(Calendar.MONTH);
	    int actualDay = fecha.get(Calendar.DAY_OF_MONTH);
		String message = " ";
		int daysLeft = 0;
		int weeksLeft = 0;
		if(born.calculateWeeksOfBorn()<52){
			weeksLeft = 52-born.calculateWeeksOfBorn();
			daysLeft = born.calculateDaysOfBorn();
			message ="NOMBRE: "+name+"\nFECHA: "+born.getDay()+"-"+born.getMonth()+"-"+actualYear+".";
			}else if(born.calculateWeeksOfBorn()==52&&born.calculateDaysOfBorn()==1){
				message ="NOMBRE: "+name+"\nFECHA: "+actualDay+"-"+actualMonth+"-"+actualYear+".";
				}else if(born.calculateWeeksOfBorn()>52&&born.calculateDaysOfBorn()!=0&&born.calculateDaysOfBorn()!=1){
				message ="NOMBRE: "+name+"\nFECHA: 0-0-0.";
				}
		return message;
		}

//Method to calculate de body index mas of dragon.
	public double calculateIBM(){
		double index = 0;
		index = weigth/((heigth)*(heigth));
		return index;
		}

//Method to find the kanagaroos that have vowels on the begin and on the end of their names.
	public String findVowelsName(){
		String message = " ";

		if((name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u'||name.charAt(0)=='A'||name.charAt(0)=='E'||name.charAt(0)=='I'||name.charAt(0)=='O'||name.charAt(0)=='U')&&(name.charAt(name.length()-1)=='a'||name.charAt(name.length()-1)=='e'||name.charAt(name.length()-1)=='i'||name.charAt(name.length()-1)=='o'||name.charAt(name.length()-1)=='u'||name.charAt(name.length()-1)=='A'||name.charAt(name.length()-1)=='E'||name.charAt(name.length()-1)=='I'||name.charAt(name.length()-1)=='O'||name.charAt(name.length()-1)=='U')){
			message = "El canguro "+name+" tiene vocales al inicio y al final de su nombre.";
			}else{
				message = "El canguro "+name+"  NO tiene vocales al inicio y al final de su nombre.";
			}
			return message;
		}

////Method to calcular the water required by kangaroos as a number.
	public double calculateWaterRequiredKangaroo() {
		double water = 0;
		water= calculateIBM()*1.5;
		return water;

		}

//Method to calculate how many days and weeks left to vaccine every kangaroo
	public String calculateDaysToBeVaccinate(){
		String message = " ";
		int daysLeft = 0;
		int weeksLeft = 0;
		if(born.calculateWeeksOfBorn()<52){
			weeksLeft = 52-born.calculateWeeksOfBorn();
			daysLeft = born.calculateDaysOfBorn();
			message ="El canguro:"+name+" tiene que ser vacunado en "+weeksLeft+" semanas y "+daysLeft+" dias.\nPues tiene menos de un anio de vida: "+born.calculateWeekAndDaysOfBorn()+"\n";	
			vaccine = false;
			}else if(born.calculateWeeksOfBorn()==52&&born.calculateDaysOfBorn()==1){
				vaccine = false;
				message = "El canguro:"+name+" tiene que ser vacunado hoy.\nPorque esta cumpliendo un anio: "+born.calculateWeekAndDaysOfBorn()+"\n";
				}else if(born.calculateWeeksOfBorn()>52&&born.calculateDaysOfBorn()!=0&&born.calculateDaysOfBorn()!=1){
				vaccine = true;
				message = "El canguro:"+name+" no tiene que ser vacunado.\nPorque tiene mas de un anio de vida: "+born.calculateWeekAndDaysOfBorn()+"\n";
				}
		return message;
		}

//Method to calculate th cardiac risk of every kangaroo
	public String calculateCardiacRisk() {
		String risk = "aa";
		double ibm = 0;
		ibm= calculateIBM();
		if(ibm<18){
				if(blood.equals("A")||blood.equals("AB")){
					risk = "El canguro "+name+" tiene riesgo bajo cardiaco";
					}else{
						risk = "El canguro "+name+" tiene riesgo moderado cardiaco";
						}
			}else if(ibm>18&&ibm<25){
					risk = "El canguro "+name+" tiene riesgo bajo cardiaco";
				}else if(ibm>25){
					if(blood.equals("A")||blood.equals("B")||blood.equals("O")){
						risk = "El canguro "+name+" tiene riesgo alto cardiaco";
						}else{
							risk = "El canguro "+name+" tiene riesgo moderado cardiaco";
							}
					}		
		return risk;

		}

//Method to calculate the amount of feed por every kangaroo
	public double calculateFeedKangaroo(){
		double feed = 0;
		double weigthPercentage = 0;
		double weigthMorethan48 = 0;
		if(weigth<30){
			weigthPercentage = (weigth*80)/100;
			feed = weigthPercentage;
			}else if(weigth<48&&weigth>31){
				weigthPercentage = (weigth*10)/100;
				feed = weigth+weigthPercentage;
				}else if(weigth>49){
					weigthMorethan48 = weigth-48;
					feed = 40+(0.4*weigthMorethan48);
					}
		return feed;
		}
}