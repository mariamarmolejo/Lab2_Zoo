package model;

public class Dragon {

//Atributes
	public char NO_FEMALE = 'N';
	public char FEMALE = 'F';
	private String name;
	private char gender;
	private double weigth;
	private double heigth;
	private String blood;
	private String born;

//Constructor
	public Dragon(String name, char gender, double weigth, double heigth, String blood, String born) {
		this.name = name;
		this.gender = gender;
		this.weigth = weigth;
		this.heigth = heigth;
		this.blood = blood;
		this.born = born;
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

	public String getBorn() {
		return this.born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

//Method to calculate de body index mas of dragon.
	public double calculateIBM(){
		double index = 0;
		index = weigth/((heigth)*(heigth));
		return index;
		}

//Method to find the dragons that have vowels on the begin and on the end of their names.
	public String findVowelsName(){
		String message = " ";

		if((name.charAt(0)=='a'||name.charAt(0)=='e'||name.charAt(0)=='i'||name.charAt(0)=='o'||name.charAt(0)=='u'||name.charAt(0)=='A'||name.charAt(0)=='E'||name.charAt(0)=='I'||name.charAt(0)=='O'||name.charAt(0)=='U')&&(name.charAt(name.length()-1)=='a'||name.charAt(name.length()-1)=='e'||name.charAt(name.length()-1)=='i'||name.charAt(name.length()-1)=='o'||name.charAt(name.length()-1)=='u'||name.charAt(name.length()-1)=='A'||name.charAt(name.length()-1)=='E'||name.charAt(name.length()-1)=='I'||name.charAt(name.length()-1)=='O'||name.charAt(name.length()-1)=='U')){
			message = "El dragon "+name+" tiene vocales al inicio y al final de su nombre.";
			}else{
				message = "El dragon "+name+" NO tiene vocales al inicio y al final de su nombre.";
			}
			return message;
		}

//Method to calcular the water required by dragons as a number.
	public double calculateWaterRequiredDragon() {
		double water = 0;
		water= (calculateIBM()*75)/100;
		return water;
		}

}