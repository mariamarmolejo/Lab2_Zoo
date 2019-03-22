package model;

public class ZoneDragon {

//Atributes
	private double temperature;
	private double feed;
	private double hydration;

//Relations
	public Dragon dragon1;
	public Dragon dragon2;

//Constructor
	public ZoneDragon(double temperature, double feed, double hydration, Dragon dragon1, Dragon dragon2) {
		this.temperature = temperature;
		this.feed = feed;
		this.hydration = hydration;
		this.dragon1 = dragon1;
		this.dragon2 = dragon2;
	}

//Getters and setters
	public double getTemperature() {
		return this.temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getFeed() {
		return this.feed;
	}


	public void setFeed(double feed) {
		this.feed = feed;
	}

	public double getHydration() {
		return this.hydration;
	}


	public void setHydration(double hydration) {
		this.hydration = hydration;
	}

	public Dragon getDragon1(){
		return dragon1;
	}

	public Dragon getDragon2(){
		return dragon2;
	}

	public void setDragon1(Dragon dragon1){
		this.dragon1 = dragon1;
	}

	public void setDragon2(Dragon dragon2){
		this.dragon2 = dragon2;
	}

//Method for calculate feed status of dragons
	public String calculateFeedStatusDragon() {
		String message4 = " ";
		double mas = 0;
		if(feed<5){
			mas = 5-feed;
			message4 = "              NOTIFICACION                \n==========================================\n            ESTATUS DE COMIDA:            \n==========================================\nEn el ambiente de dragones solo hay "+feed+"KG.\nREABASTECER "+mas+"KG como minimo.";
		}else{
			message4 = "              NOTIFICACION                \n==========================================\n            ESTATUS DE COMIDA:            \n==========================================\nEn el ambiente de dragones hay suficiente comida, no es necesario reabastecer.";
		}
		return message4;

		}

//Method to find dragons with vowels in their names
	public String calculateVowels(){
		String message0= " ";
		if(dragon1!=null&&dragon2!=null){
			message0 = dragon1.findVowelsName()+"\n"+ dragon2.findVowelsName();
		}else if(dragon1==null&&dragon2!=null){
			message0 = dragon2.findVowelsName();
		}else if(dragon1!=null&&dragon2==null){
			message0 = dragon1.findVowelsName();
		}
		return message0;
		}
		
//Method to show the water required by drangos as a string of characters
	public String showWaterRequiredForEnviromentDragon(){
		String message6 = " ";
		double totalWater = 0;
		if(dragon1!=null&&dragon2!=null){
			totalWater = dragon1.calculateWaterRequiredDragon()+dragon2.calculateWaterRequiredDragon();
			message6 = "El agua requerida para los dragones es:"+totalWater;
			}else if(dragon1!=null&&dragon2==null){
				totalWater = dragon1.calculateWaterRequiredDragon();
				message6 = "El agua requerida para los dragones es:"+totalWater;
				}else if(dragon2!=null&&dragon1==null){
					totalWater = dragon2.calculateWaterRequiredDragon();
					message6 = "El agua requerida para los dragones es:"+totalWater;
					}
		return message6;
		}

}