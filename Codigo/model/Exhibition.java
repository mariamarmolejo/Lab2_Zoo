package model;

public class Exhibition {

//Atributes
	private String name;
	private double area;

//Relations
	public ZoneDragon dragonZone;
	public ZoneKangaroo kangarooZone;

//Constructor
	public Exhibition(String name, double area, ZoneDragon dragonZone, ZoneKangaroo kangarooZone) {
		this.name = name;
		this.area = area;
		this.dragonZone = dragonZone;
		this.kangarooZone = kangarooZone;
	}
//Getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}
	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public ZoneDragon getDragonZone(){
		return dragonZone;
	}

	public ZoneKangaroo getKangarooZone(){
		return kangarooZone;
	}

	public void setDragonZone(ZoneDragon dragonZone){
		this.dragonZone = dragonZone;
	}

	public void setKangarooZone(ZoneKangaroo kangarooZone){
		this.kangarooZone = kangarooZone;
	}
}