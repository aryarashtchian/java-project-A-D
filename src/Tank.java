
public class Tank extends Attacker {
	int tankslife = 1000;
	int tankspower = 100;
	int tanksreloadtime = 500;
	int tanksrange = 6;
	int tanksprice = 40;
	public Tank(){
		setLife(tankslife);
		setPower(tankspower);
		setReloadTime(tanksreloadtime);
		setRange(tanksrange);
		setPrice(tanksprice);
		setValue(tanksprice * 0.8);
	}

}
