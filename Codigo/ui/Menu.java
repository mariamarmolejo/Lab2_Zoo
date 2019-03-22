//package ui
package ui;
//imports
import model.*;
import java.util.Scanner;

public class Menu{
	//instances
	private Scanner input = new Scanner(System.in);
	private Kangaroo kangaroo11 = new Kangaroo("Julia", 'F', 49.0, 1.8,"B",false, 4,1,2015);
	private Kangaroo kangaroo21 = new Kangaroo("Ana", 'F', 37.0, 1.5,"AB",false, 4,4,2018);
	private Kangaroo kangaroo31 = new Kangaroo("Paco", 'N', 22.0, 1.9,"A",false, 4,2,2017);
	private Kangaroo kangaroo12 = new Kangaroo("Pixie", 'F', 38.0, 2.1,"O",false, 4,5,2019);
	private Kangaroo kangaroo22 = new Kangaroo("Aura", 'F', 32.0, 1.4,"O",false, 4,6,2018);
	private Kangaroo kangaroo32 = new Kangaroo("Gus", 'N', 29.0, 1.7, "A",false, 4,7,2019);
	private Kangaroo kangaroo13 = new Kangaroo("Cati", 'F', 45.0, 1.2,"AB",false, 4,8,2018);
	private Kangaroo kangaroo23 = new Kangaroo("Minxy", 'F', 25.0, 1.9,"B",false, 4,3,2016);
	private Kangaroo kangaroo33 = new Kangaroo("Nio", 'N', 54.0, 1.6,"A",false, 4,9,2019);
	private Enviroment enviroment1 = new Enviroment(3, kangaroo11, kangaroo21, kangaroo31);
	private Enviroment enviroment2 = new Enviroment(3, kangaroo12, kangaroo22, kangaroo32);
	private Enviroment enviroment3 = new Enviroment(3, kangaroo13, kangaroo23, kangaroo33);
	private Dragon dragon1 = new Dragon("Mari", 'F', 35.0, 1.8, "AB", "4 de julio 2010");
	private Dragon dragon2 = new Dragon("Polo", 'N', 28.0, 1.5, "O", "25 de noviembre 2015");
	private ZoneDragon dragonZone = new ZoneDragon(38.0, 4.0, 52.0, dragon1, dragon2);
	private ZoneKangaroo kangarooZone = new ZoneKangaroo(35.0, 5.0, 25.0, enviroment1, enviroment2, enviroment3);
	private Exhibition apo1 = new Exhibition("Australia, donde el agua es oro", 1500.0, dragonZone, kangarooZone);
	//constructor
	public Menu(){
		requirement();
	}

	//The requirements
	public void requirement(){
		System.out.println("======================================================================\n        Bienvenido al Sistema de monitoreo del Zoologico de Cali       \n======================================================================\nPorfavor eliga la opcion que corresponda a sus necesidades.\n======================================================================");
		System.out.println(" 1  || Conocer el area para cada ambiente\n 2  || Conocer la cantidad de alimento para canguros\n 3  || Conocer periodo de vacunacion de los canguros\n 4  || Conocer el riesgo cardiaco de los canguros\n 5  || Conocer el estatdo de alimento de los dragones\n 6  || Conocer la cantidad de agua necesaria para canguros y dragones\n 7  || Crear y anadir un canguro a un ambiente\n 8  || Eliminar un canguro\n 9  || Cambiar un canguro de ambiente\n 10 || Buscar animales que los nombres comienzan y terminan con vocal.\n 11 || Lista de fechas para vacunacion de los canguros\n 12 || Salir\n*******************CREADO POR MARIA JOSE MARMOLEJO*******************");
		int opcionUsuario = input.nextInt();
		switch (opcionUsuario){
			//1.Deploying the area of each environment 
			case 1:
				System.out.println("============================================");
				System.out.println("      AREA TOTAL DE TODOS LOS AMBIENTES     ");
				System.out.println("============================================");
				System.out.println(apo1.getKangarooZone().calculateAreaEachEnviroment());
				System.out.println("============================================");
				backToMenu();
				break;
			//2.Calculate the amount of food to the kangaroo 
			case 2:
				System.out.println("=======================================================================");
				System.out.println("                    AREA TOTAL DE TODOS LOS AMBIENTES                  ");
				System.out.println("=======================================================================");
				System.out.println(apo1.getKangarooZone().showFoodForAllKangaroo());
				System.out.println("=======================================================================");
				backToMenu();
				break;
			//3.Administer vaccine to kangaroo
			case 3:
				System.out.println("====================================================================");
				System.out.println("                     ADMINISTRADOR DE VACUNACION                    ");
				System.out.println("====================================================================");
				System.out.println("                            AMBIENTE 1:                             ");
				System.out.println("____________________________________________________________________");
				System.out.println(apo1.getKangarooZone().getEnviroment1().calculateVaccinate()+"____________________________________________________________________");
				System.out.println("                            AMBIENTE 2:                             ");
				System.out.println("____________________________________________________________________");
				System.out.println(apo1.getKangarooZone().getEnviroment2().calculateVaccinate()+"____________________________________________________________________");
				System.out.println("                            AMBIENTE 3:                             ");
				System.out.println("____________________________________________________________________");
				System.out.println(apo1.getKangarooZone().getEnviroment3().calculateVaccinate());
				System.out.println("===================================================================");
				backToMenu();
				break;
			//4.Calculate risk of heart disease of Kangaroo 
			case 4:
				System.out.println("====================================================================");
				System.out.println("             RIESGO DE ENFERMEDADES CARDIACAS EN CANGUROS           ");
				System.out.println("====================================================================");
				System.out.println("                            AMBIENTE 1:                             ");
				System.out.println("____________________________________________________________________");
				System.out.println(apo1.getKangarooZone().getEnviroment1().calculateRisk());
				System.out.println("____________________________________________________________________");
				System.out.println("                            AMBIENTE 2:                             ");
				System.out.println("____________________________________________________________________");
				System.out.println(apo1.getKangarooZone().getEnviroment2().calculateRisk());
				System.out.println("____________________________________________________________________");
				System.out.println("                            AMBIENTE 3:                             ");
				System.out.println("____________________________________________________________________");
				System.out.println(apo1.getKangarooZone().getEnviroment3().calculateRisk());
				System.out.println("===================================================================");
				backToMenu();
				break;
			//5.Notify feed status of the dragon 
			case 5:
				System.out.println("==========================================");
				System.out.println(apo1.getDragonZone().calculateFeedStatusDragon());
				System.out.println("==========================================");
				backToMenu();
				break;
			//6.Know the amount of water required for environments 
			case 6:
				System.out.println("===================================================================");
				System.out.println("                   AGUA REQUERIDA PARA CANGUROS                    ");
				System.out.println("===================================================================");
				System.out.println(apo1.getKangarooZone().showWaterForAllKangaroo());
				System.out.println("===================================================================");
				System.out.println("                   AGUA REQUERIDA PARA DRAGONES                    ");
				System.out.println("===================================================================");
				System.out.println(apo1.getDragonZone().showWaterRequiredForEnviromentDragon());
				System.out.println("===================================================================");
				backToMenu();
				break;
			//7.Create new kangaroo and add them to an Environment
			case 7:
				createKangaroo();
				break;
			//8.Remove kangaroos of the zoo
			case 8:
				removeKangaroo();
				break;
			//9.Change environment kangaroos
			case 9:
				changeKangarooOfEnviroment();
				break;
			//10.Find animals the names that begin and end with vowel.
			case 10:
				System.out.println("====================================================================");
				System.out.println("         ANIMALES CUYOS NOMBRES EMPIEZAN Y TERMINAN EN VOCAL        ");
				System.out.println("====================================================================");
				System.out.println("                              DRAGONES                              ");
				System.out.println("====================================================================");
				System.out.println(apo1.getDragonZone().calculateVowels());
				System.out.println("====================================================================");
				System.out.println("                              CANGUROS                              ");
				System.out.println("====================================================================");
				System.out.println(apo1.getKangarooZone().getEnviroment2().calculateVowels());
				System.out.println(apo1.getKangarooZone().getEnviroment3().calculateVowels());
				System.out.println(apo1.getKangarooZone().getEnviroment1().calculateVowels());
				System.out.println(apo1.getKangarooZone().getEnviroment2().calculateVowels());
				System.out.println(apo1.getKangarooZone().getEnviroment3().calculateVowels());
				System.out.println("====================================================================");
				backToMenu();
				break;
			//11.Give a report of the vaccination dates of the kangaroos.
			case 11:
				System.out.println("================================");
				System.out.println("FECHAS DE VACUNACION EN CANGUROS");
				System.out.println("================================");
				System.out.println(apo1.getKangarooZone().getEnviroment1().calculateList());
				System.out.println(apo1.getKangarooZone().getEnviroment2().calculateList());
				System.out.println(apo1.getKangarooZone().getEnviroment3().calculateList());
				System.out.println("================================");
				backToMenu();
				break;
			//12.Salir
			case 12:
				System.out.println("==========================================================================");
				System.out.println("    A     DDDDD   IIIII   OOO      SSS");
				System.out.println("   A A    D    D    I    O   O    S");
				System.out.println("  A   A   D     D   I   O     O    SSS");
				System.out.println(" AAAAAAA  D    D    I    O   O        S");
				System.out.println("A       A DDDDD   IIIII   OOO      SSS");
				System.out.println("==========================================================================");
				System.out.println("CREADO POR MARIA JOSE MARMOLEJO");
				System.out.println("==========================================================================");
				System.exit(0);
				break;		
			default:
				System.out.println("=============================================================================================================");
				System.out.println("Opcion invalida");
				System.out.println("=============================================================================================================");
				backToMenu();
				break;
		}
	}

//Method to back to menu
	public void backToMenu(){
		System.out.println("Presione 1 para volver al menu o 2 para salir");
		int opcion = input.nextInt();
		if(opcion==1){
			requirement();	
		}else{
				System.out.println("==========================================================================");
				System.out.println("    A     DDDDD   IIIII   OOO      SSS");
				System.out.println("   A A    D    D    I    O   O    S");
				System.out.println("  A   A   D     D   I   O     O    SSS");
				System.out.println(" AAAAAAA  D    D    I    O   O        S");
				System.out.println("A       A DDDDD   IIIII   OOO      SSS");
				System.out.println("==========================================================================");
				System.out.println("CREADO POR MARIA JOSE MARMOLEJO");
				System.out.println("==========================================================================");
			System.exit(0);
			}
		
			}
	
//Method to create a kangaroo
	public void createKangaroo(){
				System.out.println("==========================================================");
				System.out.println("                    CREACION DE CANGURO                   ");
				System.out.println("==========================================================");
				System.out.println("Escoga el ambiente en el que quiere crear el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
					int ambiente = input.nextInt();
					switch (ambiente){
						case 1:
							System.out.println("==========================================================");
							System.out.println("              Usted ha ingresado al ambiente 1            ");	
							if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
								System.out.println("Ya hay 3 canguros en este ambiente: "+apo1.getKangarooZone().getEnviroment1().getKangaroo1().getName()+", "+apo1.getKangarooZone().getEnviroment1().getKangaroo2().getName()+", "+apo1.getKangarooZone().getEnviroment1().getKangaroo3().getName()+".");
								System.out.println("Puede eliminar o cambiar un canguro de ambiente en el menu");
								System.out.println("==========================================================");
								backToMenu();
							}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
								System.out.println("Se puede agregar un canguro en el puesto 1");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC= 'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment1().getKangaroo2().getGender()=='N'||apo1.getKangarooZone().getEnviroment1().getKangaroo3().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo11 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
								System.out.println("Se puede agregar un canguro en el puesto 2");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC= 'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment1().getKangaroo1().getGender()=='N'||apo1.getKangarooZone().getEnviroment1().getKangaroo3().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo21 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("Se puede agregar un canguro en el puesto 3");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC =  'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment1().getKangaroo1().getGender()=='N'||apo1.getKangarooZone().getEnviroment1().getKangaroo2().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo31 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
								}
							System.out.println("==========================================================");	
							break;
						case 2:
							System.out.println("==========================================================");
							System.out.println("              Usted ha ingresado al ambiente 2            ");	
							if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
								System.out.println("Ya hay 3 canguros en este ambiente: "+apo1.getKangarooZone().getEnviroment2().getKangaroo1().getName()+", "+apo1.getKangarooZone().getEnviroment2().getKangaroo2().getName()+", "+apo1.getKangarooZone().getEnviroment2().getKangaroo3().getName()+".");
								System.out.println("Puede eliminar o cambiar un canguro de ambiente en el menu");
								System.out.println("==========================================================");
								backToMenu();
							}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
								System.out.println("Se puede agregar un canguro en el puesto 1");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC= 'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment2().getKangaroo2().getGender()=='N'||apo1.getKangarooZone().getEnviroment2().getKangaroo3().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo12 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("Se puede agregar un canguro en el puesto 2");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC= 'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment2().getKangaroo1().getGender()=='N'||apo1.getKangarooZone().getEnviroment2().getKangaroo3().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo22 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("Se puede agregar un canguro en el puesto 3");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC=  'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment2().getKangaroo1().getGender()=='N'||apo1.getKangarooZone().getEnviroment2().getKangaroo2().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo32 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
								}
							System.out.println("==========================================================");
							break;
						case 3:
							System.out.println("==========================================================");
							System.out.println("              Usted ha ingresado al ambiente 3            ");	
							if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
								System.out.println("Ya hay 3 canguros en este ambiente: "+apo1.getKangarooZone().getEnviroment3().getKangaroo1().getName()+", "+apo1.getKangarooZone().getEnviroment3().getKangaroo2().getName()+", "+apo1.getKangarooZone().getEnviroment3().getKangaroo3().getName()+".");
								System.out.println("Puede eliminar o cambiar un canguro de ambiente en el menu");
								System.out.println("=======================================================");
								backToMenu();
							}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
								System.out.println("Se puede agregar un canguro en el puesto 1");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC= 'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment3().getKangaroo3().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo13 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
								System.out.println("Se puede agregar un canguro en el puesto 2");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC =  'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment3().getKangaroo1().getGender()=='N'||apo1.getKangarooZone().getEnviroment3().getKangaroo3().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo23 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("Se puede agregar un canguro en el puesto 3");
									System.out.println("Escriba el nombre del nuevo canguro");
									String nameC = input.next();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el genero del canguro \n1 para hembra\n2 para macho");
									char genderC = 'F';
									int genderO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (genderO){
										case 1:
										genderC = 'F';
										break;
										case 2:
										if(apo1.getKangarooZone().getEnviroment3().getKangaroo1().getGender()=='N'||apo1.getKangarooZone().getEnviroment3().getKangaroo2().getGender()=='N'){
											System.out.println("lo sentimos, no puede haber mas de un canguro macho en el ambiente");
											backToMenu();
										}else{
											genderC = 'N';
										}
										break;
									}
									System.out.println("Escriba el peso del canguro");
									double weigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Escriba la altura del canguro");
									double heigthC = input.nextDouble();
									System.out.println("__________________________________________________________");
									System.out.println("Indique el tipo de sangre:\n1 para A\n2 para AB\n3 para B\n4 para O");
									String bloodC = " ";
									int bloodO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (bloodO){
										case 1:
										bloodC = "A";
										break;
										case 2:
										bloodC = "AB";
										break;
										case 3:
										bloodC = "B";
										break;
										case 4:
										bloodC = "O";
										break;
									}
									System.out.println("Indique si esta vacunado:\n1. si\n2. no");
									boolean vaccineC = false;
									int vaccineO = input.nextInt();
									System.out.println("__________________________________________________________");
									switch (vaccineO){
										case 1:
										vaccineC = true;
										break;
										case 2:
										vaccineC = false;
										break;
									}
									System.out.println("Dia que nacio el canguro");
									int dayC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Mes que nacio el canguro");
									int monthC = input.nextInt();
									System.out.println("__________________________________________________________");
									System.out.println("Anio que nacio el canguro");
									int yearC = input.nextInt();
									System.out.println("__________________________________________________________");
									Kangaroo kangaroo33 = new Kangaroo(nameC, genderC, weigthC, heigthC, bloodC, vaccineC, dayC, monthC, yearC); 
									System.out.println("====Canguro creado exitosamente====");
							}
							System.out.println("==========================================================");
							break;
					}
				backToMenu();
				}

//Method to remove a kangaroo
	public void removeKangaroo(){

				System.out.println("==========================================================");
				System.out.println("                   ELIMINACION DE CANGURO                 ");
				System.out.println("==========================================================");
				System.out.println("Escoga el ambiente en el que quiere eliminar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
					int ambiente2 = input.nextInt();
					System.out.println("__________________________________________________________");
					switch (ambiente2){
					case 1:
						System.out.println("==========================================================");
						System.out.println("              Usted ha ingresado al ambiente 1            ");	
							if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null||apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null||apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
								System.out.println("En este ambiente solo hay 2 canguros. No puede haber menos");
								System.out.println("==========================================================");
								backToMenu();
							}else{
							System.out.println("Escoja el canguro que desea borrar:");

							System.out.println("1. "+apo1.getKangarooZone().getEnviroment1().getKangaroo1().getName());
							System.out.println("2. "+apo1.getKangarooZone().getEnviroment1().getKangaroo2().getName());
							System.out.println("3. "+apo1.getKangarooZone().getEnviroment1().getKangaroo3().getName());
							int opcionCanguro = input.nextInt();
							System.out.println("__________________________________________________________");
							switch(opcionCanguro){
								case 1:apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
								kangaroo11 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
								case 2:apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
								kangaroo21 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
								case 3:apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
								kangaroo31 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
							}	
							}
						break;
					case 2:
						System.out.println("==========================================================");
						System.out.println("              Usted ha ingresado al ambiente 2            ");	
						if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null||apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null||apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
								System.out.println("En este ambiente solo hay 2 canguros. No puede haber menos");
								System.out.println("==========================================================");
								backToMenu();
							}else{
							System.out.println("Escoja el canguro que desea borrar:");

							System.out.println("1. "+apo1.getKangarooZone().getEnviroment2().getKangaroo1().getName());
							System.out.println("2. "+apo1.getKangarooZone().getEnviroment2().getKangaroo2().getName());
							System.out.println("3. "+apo1.getKangarooZone().getEnviroment2().getKangaroo3().getName());
							int opcionCanguro = input.nextInt();
							System.out.println("__________________________________________________________");
							switch(opcionCanguro){
								case 1:apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
								kangaroo11 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
								case 2:apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
								kangaroo21 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
								case 3:apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
								kangaroo31 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
							}	
							}
						break;
					case 3:
						System.out.println("==========================================================");
						System.out.println("              Usted ha ingresado al ambiente 3            ");	
							if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null||apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null||apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
								System.out.println("En este ambiente solo hay 2 canguros. No puede haber menos");
								System.out.println("==========================================================");
								backToMenu();
						break;
						}else{
							System.out.println("Escoja el canguro que desea borrar:");

							System.out.println("1. "+apo1.getKangarooZone().getEnviroment3().getKangaroo1().getName());
							System.out.println("2. "+apo1.getKangarooZone().getEnviroment3().getKangaroo2().getName());
							System.out.println("3. "+apo1.getKangarooZone().getEnviroment3().getKangaroo3().getName());
							int opcionCanguro = input.nextInt();
							System.out.println("__________________________________________________________");
							switch(opcionCanguro){
								case 1:apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
								kangaroo11 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
								case 2:apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
								kangaroo21 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
								case 3:apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
								kangaroo31 = null;
								System.out.println("====CANGURO ELIMINADO====");
								break;
							}	
							}
						}
					backToMenu();
				}

//Method to change a kangaroo of enviroment
	public void changeKangarooOfEnviroment(){

				System.out.println("==========================================================");
				System.out.println("               CAMBIAR CANGURO DE AMBIENTE                ");
				System.out.println("==========================================================");
				System.out.println("Escoga el ambiente en el que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
				int cambio = input.nextInt();
				System.out.println("__________________________________________________________");
				switch (cambio){
				case 1:
					System.out.println("==========================================================");
					System.out.println("              Usted ha ingresado al ambiente 1            ");	
					if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null||apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null||apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
						System.out.println("==========================================================");
						System.out.println("        Hay 2 canguros, no se pueden hacer cambios.       ");
						backToMenu();
					}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
						System.out.println("Escoja el canguro que desea cambiar ");
						System.out.println("1. "+apo1.getKangarooZone().getEnviroment1().getKangaroo1().getName());
						System.out.println("2. "+apo1.getKangarooZone().getEnviroment1().getKangaroo2().getName());
						System.out.println("3. "+apo1.getKangarooZone().getEnviroment1().getKangaroo3().getName());
						int cambiarAmbiente1 = input.nextInt();
						switch(cambiarAmbiente1){
						case 1:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro1Ambiente1 = input.nextInt();
							switch(canguro1Ambiente1){
							case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
								if ((apo1.getKangarooZone().getEnviroment1().getKangaroo2().getGender()=='N'||apo1.getKangarooZone().getEnviroment1().getKangaroo3().getGender()=='N')&&apo1.getKangarooZone().getEnviroment1().getKangaroo1().getGender()=='N') {
									System.out.println("===============================================================");
									System.out.println("Lo sentimos pero no puede haber mas de un macho en el ambiente.");
									backToMenu();
								}
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();									
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							case 2:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 2.           ");
								if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							case 3:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 3.           ");
								if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							}
							break;
						case 2:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro2Ambiente1 = input.nextInt();
							switch(canguro2Ambiente1){
								case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
								case 2:
									System.out.println("==========================================================");
									System.out.println("              Usted ha ingresado al ambiente 2.           ");
									if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 1.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
										apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 2.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
										apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 3.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
										apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}
									break;
								case 3:
									System.out.println("==========================================================");
									System.out.println("              Usted ha ingresado al ambiente 3.           ");
									if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 1.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
										apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 2.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
										apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 3.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo2());
										apo1.getKangarooZone().getEnviroment1().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}
									break;
									}
							break;
						case 3:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro3Ambiente1 = input.nextInt();
							switch(canguro3Ambiente1){
							case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							case 2:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 2.           ");
								if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							case 3:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 3.           ");
								if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo3());
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							}
							break;
						}
					}
					break;	
				case 2:
					System.out.println("==========================================================");
					System.out.println("              Usted ha ingresado al ambiente 2            ");	
					if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null||apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null||apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
						System.out.println("==========================================================");
						System.out.println("        Hay 2 canguros, no se pueden hacer cambios.       ");
						backToMenu();
					}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
						System.out.println("Escoja el canguro que desea cambiar ");
						System.out.println("1. "+apo1.getKangarooZone().getEnviroment2().getKangaroo1().getName());
						System.out.println("2. "+apo1.getKangarooZone().getEnviroment2().getKangaroo2().getName());
						System.out.println("3. "+apo1.getKangarooZone().getEnviroment2().getKangaroo3().getName());
						int cambiarAmbiente2 = input.nextInt();
						switch(cambiarAmbiente2){
						case 1:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro1Ambiente2 = input.nextInt();
							switch(canguro1Ambiente2){
							case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();									
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment1().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							case 2:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 2.           ");
								if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							case 3:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 3.           ");
								if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo1());
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							}
							break;
						case 2:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro2Ambiente1 = input.nextInt();
							switch(canguro2Ambiente1){
								case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
								case 2:
									System.out.println("==========================================================");
									System.out.println("              Usted ha ingresado al ambiente 2.           ");
									if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 1.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 2.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 3.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}
									break;
								case 3:
									System.out.println("==========================================================");
									System.out.println("              Usted ha ingresado al ambiente 3.           ");
									if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 1.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 2.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 3.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo2());
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}
									break;
									}
							break;
						case 3:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro3Ambiente1 = input.nextInt();
							switch(canguro3Ambiente1){
							case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							case 2:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 2.           ");
								if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							case 3:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 3.           ");
								if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment2().getKangaroo3());
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							}
							break;
						}
					}
					break;	
				case 3:
					System.out.println("==========================================================");
					System.out.println("              Usted ha ingresado al ambiente 3            ");	
					if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null||apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null||apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
						System.out.println("==========================================================");
						System.out.println("        Hay 2 canguros, no se pueden hacer cambios.       ");
						backToMenu();
					}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
						System.out.println("Escoja el canguro que desea cambiar ");
						System.out.println("1. "+apo1.getKangarooZone().getEnviroment3().getKangaroo1().getName());
						System.out.println("2. "+apo1.getKangarooZone().getEnviroment3().getKangaroo2().getName());
						System.out.println("3. "+apo1.getKangarooZone().getEnviroment3().getKangaroo3().getName());
						int cambiarAmbiente2 = input.nextInt();
						switch(cambiarAmbiente2){
						case 1:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro1Ambiente2 = input.nextInt();
							switch(canguro1Ambiente2){
							case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();									
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							case 2:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 2.           ");
								if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							case 3:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 3.           ");
								if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo1());
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
							}
							break;
						case 2:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro2Ambiente1 = input.nextInt();
							switch(canguro2Ambiente1){
								case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}
								break;
								case 2:
									System.out.println("==========================================================");
									System.out.println("              Usted ha ingresado al ambiente 2.           ");
									if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 1.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 2.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 3.             ");
										apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}
									break;
								case 3:
									System.out.println("==========================================================");
									System.out.println("              Usted ha ingresado al ambiente 3.           ");
									if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 1.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 2.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
										System.out.println("==========================================================");
										System.out.println("               Hay un espacio para canguro 3.             ");
										apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo2());
										apo1.getKangarooZone().getEnviroment3().setKangaroo2(null);
										System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
										backToMenu();
									}
									break;
									}
							break;
						case 3:
							System.out.println("Escoga el ambiente en al que quiere cambiar el canguro:\n1. Ambiente 1\n2. Ambiente 2\n3. Ambiente 3");
							int canguro3Ambiente1 = input.nextInt();
							switch(canguro3Ambiente1){
							case 1:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 1.           ");
								if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 1 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment1().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment1().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment1().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							case 2:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 2.           ");
								if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 2 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment2().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment2().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment2().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							case 3:
								System.out.println("==========================================================");
								System.out.println("              Usted ha ingresado al ambiente 3.           ");
								if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("             El ambiente 3 ya tiene 3 canguros.           ");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 1.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo1(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()==null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()!=null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 2.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo2(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
								}else if(apo1.getKangarooZone().getEnviroment3().getKangaroo1()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo2()!=null&&apo1.getKangarooZone().getEnviroment3().getKangaroo3()==null){
									System.out.println("==========================================================");
									System.out.println("               Hay un espacio para canguro 3.             ");
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(apo1.getKangarooZone().getEnviroment3().getKangaroo3());
									apo1.getKangarooZone().getEnviroment3().setKangaroo3(null);
									System.out.println("==============CANGURO CAMBIADO EXITOSAMENTE.==============");
									backToMenu();
									}
								break;
							}
							break;
						}
					}	
				}
				}

}