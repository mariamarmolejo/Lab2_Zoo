package model;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
//Atributes
	Calendar fecha = new GregorianCalendar();
    int actualYear = fecha.get(Calendar.YEAR);
    int actualMonth = fecha.get(Calendar.MONTH);
    int actualDay = fecha.get(Calendar.DAY_OF_MONTH);
	private int day;
	private int month;
	private int year;

//Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

//Getters and setters
	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//Method to calculate how many weeks left to vaccine of one kangaroo as a number
	public int calculateWeeksOfBorn() {
		int days = 0;
		int yearDays = 0;
		int yearS = 0;
		int monthDays = 0;
		int daysDays = 0;
		int weeksBorn = 0;
		yearS = (actualYear-year);
		if (yearS==1){
			if(month>actualMonth){
				yearDays=0;
				}
			}else{
			yearDays= yearS*365;
			}
		
		monthDays = (12-month)*30;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			daysDays = (31-day);
		}else if(month==4||month==6||month==9||month==11){
			daysDays = (30-day);
		}else if(month==2){
			daysDays = (28-day);
			}
		days = yearDays+monthDays+daysDays;
		weeksBorn = days/7;
		return weeksBorn;
		}

//Method to calculate how many days left to vaccine of one kangaroo as a number
	public int calculateDaysOfBorn(){
		int days = 0;
		int yearDays = 0;
		int yearS = 0;
		int monthDays = 0;
		int daysDays = 0;
		int daysBorn = 0;
		yearS = (actualYear-year);
		if (yearS==1){
			if(month>actualMonth){
				yearDays=0;
				}	yearDays=0;
			}else{
			yearDays= yearS*365;
			}
		
		monthDays = (12-month)*30;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			daysDays = (31-day);
		}else if(month==4||month==6||month==9||month==11){
			daysDays = (30-day);
		}else if(month==2){
			daysDays = (28-day);
			}
		days = yearDays+monthDays+daysDays;
		daysBorn= days%7;
		return daysBorn;
		}

//Method to calculate how many days and weeks left to vaccine of one kangaroo
	public String calculateWeekAndDaysOfBorn(){
		String message = " ";
		int daysOfBorn = 0;
		int weeksOfBorn = 0;
		daysOfBorn = calculateDaysOfBorn();
		weeksOfBorn = calculateWeeksOfBorn();
		message= +weeksOfBorn+" semanas y "+daysOfBorn+" dias de nacido.";
		return message;
		}

}