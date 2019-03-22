package model;

public class ZoneKangaroo {
//Atributes
	private double temperature;
	private double feed;
	private double hydration;
//Relations
	public Enviroment enviroment1;
	public Enviroment enviroment2;
	public Enviroment enviroment3;
//Constructor
	public ZoneKangaroo(double temperature, double feed, double hydration, Enviroment enviroment1, Enviroment enviroment2, Enviroment enviroment3) {
		this.temperature = temperature;
		this.feed = feed;
		this.hydration = hydration;
		this.enviroment1 = enviroment1;		
		this.enviroment2 = enviroment2;
		this.enviroment3 = enviroment3;
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

	public Enviroment getEnviroment1(){
		return enviroment1;
	}

	public Enviroment getEnviroment2(){
		return enviroment2;
	}

	public Enviroment getEnviroment3(){
		return enviroment3;
	}

	public void setEnviroment1(Enviroment enviroment1){
		this.enviroment1 = enviroment1;
	}

	public void setEnviroment2(Enviroment enviroment2){
		this.enviroment2 = enviroment2;
	}

	public void setEnviroment3(Enviroment enviroment3){
		this.enviroment3 = enviroment3;
	}

//Method to show  the amount of feed por every kangaroo
	public String showFoodForAllKangaroo() {
		String messagenviroment3 = " ";
		double totalFood = 0;
			if(enviroment1!=null&&enviroment2!=null&&enviroment3!=null){
				totalFood = enviroment1.calculateAllFeedKangaroo()+enviroment2.calculateAllFeedKangaroo()+enviroment3.calculateAllFeedKangaroo();
				}else if(enviroment1==null&&enviroment2!=null&&enviroment3!=null){
					totalFood = enviroment2.calculateAllFeedKangaroo()+enviroment3.calculateAllFeedKangaroo();
					}else if(enviroment1!=null&&enviroment2==null&&enviroment3!=null){
						totalFood = enviroment1.calculateAllFeedKangaroo()+enviroment3.calculateAllFeedKangaroo();
						}else if(enviroment1!=null&&enviroment2!=null&&enviroment3==null){
							totalFood = enviroment1.calculateAllFeedKangaroo()+enviroment2.calculateAllFeedKangaroo();
							}else if(enviroment1==null&&enviroment2==null&&enviroment3!=null){
								totalFood = enviroment3.calculateAllFeedKangaroo();
								}else if(enviroment1==null&&enviroment2!=null&&enviroment3==null){
									totalFood = enviroment2.calculateAllFeedKangaroo();
									}else if(enviroment1!=null&&enviroment2==null&&enviroment3==null){
										totalFood = enviroment1.calculateAllFeedKangaroo();
										}

		if(enviroment1!=null&&enviroment2!=null&&enviroment3!=null){
				messagenviroment3 = "Ambiente 1:Se requiere de alimento para los canguros "+enviroment1.calculateAllFeedKangaroo()+"\nAmbiente 2:Se requiere de alimento para los canguros"+enviroment2.calculateAllFeedKangaroo()+"\nAmbiente 3:Se requiere de alimento para los canguros "+enviroment3.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
				}else if(enviroment1==null&&enviroment2!=null&&enviroment3!=null){
					messagenviroment3 = "Ambiente 2:Se requiere de alimento para los canguros "+enviroment2.calculateAllFeedKangaroo()+"\nAmbiente 3:Se requiere de alimento para los canguros "+enviroment3.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
					}else if(enviroment1!=null&&enviroment2==null&&enviroment3!=null){
						messagenviroment3 = "Ambiente 1:Se requiere de alimento para los canguros "+enviroment1.calculateAllFeedKangaroo()+"\nAmbiente 3:Se requiere de alimento para los canguros "+enviroment3.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
						}else if(enviroment1!=null&&enviroment2!=null&&enviroment3==null){
							messagenviroment3 = "Ambiente 1:Se requiere de alimento para los canguros "+enviroment1.calculateAllFeedKangaroo()+"\nAmbiente 2:Se requiere de alimento para los canguros "+enviroment2.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
							}else if(enviroment1==null&&enviroment2==null&&enviroment3!=null){
								messagenviroment3 = "Ambiente 3:Se requiere de alimento para los canguros "+enviroment3.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
								}else if(enviroment1==null&&enviroment2!=null&&enviroment3==null){
									messagenviroment3 = "Ambiente 2:Se requiere de alimento para los canguros "+enviroment2.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
									}else if(enviroment1!=null&&enviroment2==null&&enviroment3==null){
										messagenviroment3 = "Ambiente 1:Se requiere de alimento para los canguros "+enviroment1.calculateAllFeedKangaroo()+"\nTotal:"+totalFood;
										}
		return messagenviroment3;

		}

//Method to calculate the are of each enviroment
	public String calculateAreaEachEnviroment(){
		String messagenviroment1 = " ";
		double totalArea = 0;
		if(enviroment1!=null&&enviroment2!=null&&enviroment3!=null){
			totalArea = enviroment1.calculateArea()+enviroment2.calculateArea()+enviroment3.calculateArea();
			messagenviroment1 = "Ambiente 1: area total es "+enviroment1.calculateArea()+"\nAmbiente 2: area total es "+enviroment2.calculateArea()+"\nAmbiente 3: area total es "+enviroment3.calculateArea()+"\nTotal:"+totalArea;
				}else if(enviroment1==null){
					totalArea = enviroment2.calculateArea()+enviroment3.calculateArea();
					messagenviroment1 = "Ambiente 2: area total es "+enviroment2.calculateArea()+"\nAmbiente 3: area total es "+enviroment3.calculateArea()+"\nTotal:"+totalArea;
					}else if(enviroment2==null){
						totalArea = enviroment1.calculateArea()+enviroment3.calculateArea();
						messagenviroment1 = "Ambiente 1: area total es "+enviroment1.calculateArea()+"\nAmbiente 3: area total es "+enviroment3.calculateArea()+"\nTotal:"+totalArea;
						}else if(enviroment3==null){
							totalArea = enviroment1.calculateArea()+enviroment2.calculateArea();
							messagenviroment1 = "Ambiente 1: area total es "+enviroment1.calculateArea()+"\nAmbiente 2: area total es "+enviroment2.calculateArea()+"\nTotal:"+totalArea;
							}
		return messagenviroment1;
		}

//Method to calcular the water required by kangaroos as a string of characters.
	public String showWaterForAllKangaroo() {
		String message6 = " ";
		double totalWater = 0;
			if(enviroment1!=null&&enviroment2!=null&&enviroment3!=null){
				totalWater = enviroment1.calculateAllWaterKangaroo()+enviroment2.calculateAllWaterKangaroo()+enviroment3.calculateAllWaterKangaroo();
				}else if(enviroment1==null&&enviroment2!=null&&enviroment3!=null){
					totalWater = enviroment2.calculateAllWaterKangaroo()+enviroment3.calculateAllWaterKangaroo();
					}else if(enviroment1!=null&&enviroment2==null&&enviroment3!=null){
						totalWater = enviroment1.calculateAllWaterKangaroo()+enviroment3.calculateAllWaterKangaroo();
						}else if(enviroment1!=null&&enviroment2!=null&&enviroment3==null){
							totalWater = enviroment1.calculateAllWaterKangaroo()+enviroment2.calculateAllWaterKangaroo();
							}else if(enviroment1==null&&enviroment2==null&&enviroment3!=null){
								totalWater = enviroment3.calculateAllWaterKangaroo();
								}else if(enviroment1==null&&enviroment2!=null&&enviroment3==null){
									totalWater = enviroment2.calculateAllWaterKangaroo();
									}else if(enviroment1!=null&&enviroment2==null&&enviroment3==null){
										totalWater = enviroment1.calculateAllWaterKangaroo();
										}

		if(enviroment1!=null&&enviroment2!=null&&enviroment3!=null){
				message6 = "Ambiente 1:Se requiere de agua para los canguros "+enviroment1.calculateAllWaterKangaroo()+"\nAmbiente 2:Se requiere de agua para los canguros"+enviroment2.calculateAllWaterKangaroo()+"\nAmbiente 3:Se requiere de agua para los canguros "+enviroment3.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
				}else if(enviroment1==null&&enviroment2!=null&&enviroment3!=null){
					message6 = "Ambiente 2:Se requiere de agua para los canguros "+enviroment2.calculateAllWaterKangaroo()+"\nAmbiente 3:Se requiere de agua para los canguros "+enviroment3.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
					}else if(enviroment1!=null&&enviroment2==null&&enviroment3!=null){
						message6 = "Ambiente 1:Se requiere de agua para los canguros "+enviroment1.calculateAllWaterKangaroo()+"\nAmbiente 3:Se requiere de agua para los canguros "+enviroment3.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
						}else if(enviroment1!=null&&enviroment2!=null&&enviroment3==null){
							message6 = "Ambiente 1:Se requiere de agua para los canguros "+enviroment1.calculateAllWaterKangaroo()+"\nAmbiente 2:Se requiere de agua para los canguros "+enviroment2.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
							}else if(enviroment1==null&&enviroment2==null&&enviroment3!=null){
								message6 = "Ambiente 3:Se requiere de agua para los canguros "+enviroment3.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
								}else if(enviroment1==null&&enviroment2!=null&&enviroment3==null){
									message6 = "Ambiente 2:Se requiere de agua para los canguros "+enviroment2.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
									}else if(enviroment1!=null&&enviroment2==null&&enviroment3==null){
										message6 = "Ambiente 1:Se requiere de agua para los canguros "+enviroment1.calculateAllWaterKangaroo()+"\nTotal:"+totalWater;
										}
		return message6;

		}

}