
public class Tower extends Army {
	private int towertype;
	private int powerAgainstTank;//ghodrat dar barabare tankha
	private int powerAgainstSoldiers;//ghodrat dar barabare piadeha
	private double attackReflection;//baztabe zarbe
	private int accuracy;//deghat
	public Tower(int towertype){
		setRange(7);
		setTowertype(towertype);
		switch (towertype) {
		case 0:
			setPowerAgainstTank(50);
			setPowerAgainstSoldiers(400);
			setReloadTime(2000);
			setLife(5000);
			setAttackReflection(0);
			setPrice(300);
			break;
		case 1:
			setPowerAgainstTank(200);
			setPowerAgainstSoldiers(40);
			setReloadTime(800);
			setLife(4000);
			setAttackReflection(0.3);
			setPrice(500);
			break;
		case 2:
			setPowerAgainstTank(100);
			setPowerAgainstSoldiers(20);
			setReloadTime(500);
			setLife(4000);
			setAttackReflection(0.4);
			setPrice(500);
			break;
		case 3:
			setPowerAgainstTank(20);
			setPowerAgainstSoldiers(100);
			setReloadTime(500);
			setLife(5000);
			setAttackReflection(0);
			setPrice(300);
			break;
		case 4:
			setPowerAgainstTank(200);
			setPowerAgainstSoldiers(50);
			setReloadTime(200);
			setLife(2000);
			setAttackReflection(0.1);
			setPrice(600);
			break;
		case 5:
			setPowerAgainstTank(100);
			setPowerAgainstSoldiers(50);
			setReloadTime(350);
			setLife(2000);
			setAttackReflection(0.7);
			setPrice(600);
			break;
			
		default:
			break;
		}
	}
	public int getPowerAgainstTank() {
		return powerAgainstTank;
	}
	public void setPowerAgainstTank(int powerAgainstTank) {
		this.powerAgainstTank = powerAgainstTank;
	}
	public int getPowerAgainstSoldiers() {
		return powerAgainstSoldiers;
	}
	public void setPowerAgainstSoldiers(int powerAgainstSoldiers) {
		this.powerAgainstSoldiers = powerAgainstSoldiers;
	}
	public double getAttackReflection() {
		return attackReflection;
	}
	public void setAttackReflection(double d) {
		this.attackReflection = d;
	}
	public int getTowertype() {
		return towertype;
	}
	public void setTowertype(int towertype) {
		this.towertype = towertype;
	}
	public void speedDevelopment(){
	//TODO	
	}
	public void powerDevelopment(){
		//TODO
	}
	public void rangeDevelopment(){
		//TODO
	}
	public void autoRepairing(){
		//TODO
	}
}
