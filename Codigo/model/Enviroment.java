package model;

public class Enviroment {
//Atributes
	public int MAX_HOST = 3;
	private int host;
//Relations
	public Kangaroo kangaroo1;
	public Kangaroo kangaroo2;
	public Kangaroo kangaroo3;
//Constructor
	public Enviroment(int host, Kangaroo kangaroo1, Kangaroo kangaroo2, Kangaroo kangaroo3) {
		this.host = host;
		this.kangaroo1 = kangaroo1;
		this.kangaroo2 = kangaroo2;
		this.kangaroo3 = kangaroo3;
	}
//Getters and setters
	public int getHost() {
		return this.host;
	}

	public void setHost(int host) {
		this.host = host;
	}

	public Kangaroo getKangaroo1(){
		return kangaroo1;
	}

	public Kangaroo getKangaroo2(){
		return kangaroo2;
	}

	public Kangaroo getKangaroo3(){
		return kangaroo3;
	}

	public void setKangaroo1(Kangaroo x){
		kangaroo1 = x;
	}

	public void setKangaroo2(Kangaroo kangaroo2){
		this.kangaroo2 = kangaroo2;
	}

	public void setKangaroo3(Kangaroo kangaroo3){
		this.kangaroo3 = kangaroo3;
	}

//Method to calculate the are of one enviroment	
	public double calculateArea(){
		double area = 0;
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			area = (kangaroo1.getHeigth()*8)+(kangaroo2.getHeigth()*8)+(kangaroo3.getHeigth()*8);
			}else if(kangaroo1==null){
				area = (kangaroo2.getHeigth()*8)+(kangaroo3.getHeigth()*8);
				}else if(kangaroo2==null){
					area = (kangaroo1.getHeigth()*8)+(kangaroo3.getHeigth()*8);
					}else if(kangaroo3==null){
						area = (kangaroo1.getHeigth()*8)+(kangaroo2.getHeigth()*8);
					}
		return area;
		}

//Method to show  the amount of feed por all the kangaroo
	public double calculateAllFeedKangaroo(){
		double feedCounter = 0;
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			feedCounter = (kangaroo1.calculateFeedKangaroo())+(kangaroo2.calculateFeedKangaroo())+(kangaroo3.calculateFeedKangaroo());

			}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3!=null){
				feedCounter = (kangaroo2.calculateFeedKangaroo())+(kangaroo3.calculateFeedKangaroo());

				}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3!=null){
					feedCounter = (kangaroo1.calculateFeedKangaroo())+(kangaroo3.calculateFeedKangaroo());

					}else if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3==null){
						feedCounter = (kangaroo1.calculateFeedKangaroo())+(kangaroo2.calculateFeedKangaroo());

						}else if(kangaroo1==null&&kangaroo2==null&&kangaroo3!=null){
							feedCounter = (kangaroo3.calculateFeedKangaroo());

							}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3==null){
								feedCounter = (kangaroo2.calculateFeedKangaroo());

								}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3==null){
									feedCounter = (kangaroo1.calculateFeedKangaroo());	

									}
		return feedCounter;
		}

//Method to show the dates of vaccine of all the kangaroos
	public String calculateList(){
		String message8= " ";
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			message8 = kangaroo1.calculateDatesVaccine()+"\n________________________________\n"+ kangaroo2.calculateDatesVaccine()+"\n________________________________\n"+ kangaroo3.calculateDatesVaccine()+"\n________________________________";
		}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3!=null){
			message8 = kangaroo3.calculateDatesVaccine()+"\n________________________________\n"+ kangaroo2.calculateDatesVaccine()+"\n________________________________";
		}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3!=null){
			message8 = kangaroo3.calculateDatesVaccine()+"\n________________________________\n"+ kangaroo1.calculateDatesVaccine()+"\n________________________________";
		}else if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3==null){
			message8 = kangaroo1.calculateDatesVaccine()+"\n________________________________\n"+ kangaroo2.calculateDatesVaccine()+"\n________________________________";
		}
		return message8;
		}

//Method to calcular the water required by all the kangaroos as a string of characters.
	public double calculateAllWaterKangaroo(){
		double waterCounter = 0;
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			waterCounter = (kangaroo1.calculateWaterRequiredKangaroo())+(kangaroo2.calculateWaterRequiredKangaroo())+(kangaroo3.calculateWaterRequiredKangaroo());

			}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3!=null){
				waterCounter = (kangaroo2.calculateWaterRequiredKangaroo())+(kangaroo3.calculateWaterRequiredKangaroo());

				}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3!=null){
					waterCounter = (kangaroo1.calculateWaterRequiredKangaroo())+(kangaroo3.calculateWaterRequiredKangaroo());

					}else if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3==null){
						waterCounter = (kangaroo1.calculateWaterRequiredKangaroo())+(kangaroo2.calculateWaterRequiredKangaroo());

						}else if(kangaroo1==null&&kangaroo2==null&&kangaroo3!=null){
							waterCounter = (kangaroo3.calculateWaterRequiredKangaroo());

							}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3==null){
								waterCounter = (kangaroo2.calculateWaterRequiredKangaroo());

								}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3==null){
									waterCounter = (kangaroo1.calculateWaterRequiredKangaroo());	

									}
		return waterCounter;
		}

//Method to find all the kanagaroos that have vowels on the begin and on the end of their names.
	public String calculateVowels(){
		String message0= " ";
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			message0 = kangaroo1.findVowelsName()+"\n"+ kangaroo2.findVowelsName()+"\n"+ kangaroo3.findVowelsName();
		}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3!=null){
			message0 = kangaroo3.findVowelsName()+"\n" + kangaroo2.findVowelsName();
		}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3!=null){
			message0 = kangaroo3.findVowelsName()+"\n" + kangaroo1.findVowelsName();
		}else if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3==null){
			message0 = kangaroo1.findVowelsName()+"\n" + kangaroo2.findVowelsName();
		}
		return message0;
		}

//Method to calculate th cardiac risk of all the kangaroos
	public String calculateRisk(){
		String message9= " ";
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			message9 = kangaroo1.calculateCardiacRisk()+"\n"+ kangaroo2.calculateCardiacRisk()+"\n"+ kangaroo3.calculateCardiacRisk();
		}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3!=null){
			message9 = kangaroo3.calculateCardiacRisk()+"\n" + kangaroo2.calculateCardiacRisk();
		}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3!=null){
			message9 = kangaroo3.calculateCardiacRisk()+"\n" + kangaroo1.calculateCardiacRisk();
		}else if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3==null){
			message9 = kangaroo1.calculateCardiacRisk()+"\n" + kangaroo2.calculateCardiacRisk();
		}
		return message9;
		}

//Method to calculate how many days and weeks left to vaccine of all the kangaroos
	public String calculateVaccinate(){
		String message = " ";
		if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3!=null){
			message = kangaroo1.calculateDaysToBeVaccinate()+"\n"+ kangaroo2.calculateDaysToBeVaccinate()+"\n"+ kangaroo3.calculateDaysToBeVaccinate();
		}else if(kangaroo1==null&&kangaroo2!=null&&kangaroo3!=null){
			message = kangaroo3.calculateDaysToBeVaccinate()+"\n" + kangaroo2.calculateDaysToBeVaccinate();
		}else if(kangaroo1!=null&&kangaroo2==null&&kangaroo3!=null){
			message = kangaroo3.calculateDaysToBeVaccinate()+"\n" + kangaroo1.calculateDaysToBeVaccinate();
		}else if(kangaroo1!=null&&kangaroo2!=null&&kangaroo3==null){
			message = kangaroo1.calculateDaysToBeVaccinate()+"\n" + kangaroo2.calculateDaysToBeVaccinate();
		}
		return message;
		}
}