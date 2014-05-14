
public class Army extends GameObject {
	
private int price;
private double value;
private int reloadTime;//zamane por shodan
private int range;//bord
public int getReloadTime() {
	return reloadTime;
}
public void setReloadTime(int reloadTime) {
	this.reloadTime = reloadTime;
}
public int getRange() {
	return range;
}
public void setRange(int range) {
	this.range = range;
}
public double getValue() {
	return value;
}
public void setValue(double d) {
	this.value = d;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
