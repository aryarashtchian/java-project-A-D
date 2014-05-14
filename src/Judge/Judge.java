package Judge;

import java.util.HashMap;
import common.GameObjectID;
import exception.MahyariseExceptionBase;

public class Judge extends JudgeAbstract {

	@Override
	public void setMapSize(int columns, int rows) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMapWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMapHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void loadMap(int[][] types) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMapCellType(int col, int row, int type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMapCellType(int col, int row) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GameObjectID createAttacker(int teamID, int attackerType, int path,
			int lane) throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameObjectID createTower(int teamID, int towerType, int col, int row)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void purchaseTeamPowerup(int teamID, int powerupType)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchaseTowerPowerup(int teamID, GameObjectID id,
			int powerupType) throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMoney(int teamID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] getTeamPowerups(int teamID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Integer> getInfo(GameObjectID id)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameObjectID[] getBuildingID(int teamID, int buildingType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameObjectID[] getInRange(GameObjectID id)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameObjectID getTarget(GameObjectID id)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void next50milis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startTimer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pauseTimer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMoney(int teamID, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInfo(GameObjectID id, String infoKey, Integer infoValue)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInfo(GameObjectID id, HashMap<String, Integer> newInfo)
			throws MahyariseExceptionBase {
		// TODO Auto-generated method stub
		
	}

}
