package racingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

	int tryNum;
	List<RacingCar> racinCarList = new ArrayList<>();
	public RacingGame() {
		// TODO Auto-generated constructor stub
	}
	
	public void setup(String[] namse) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<namse.length ; i++ ){
			racinCarList.add(new RacingCar(namse[i]));
		}
	}
	
	public int getCar(){
		return racinCarList == null ? 0 : racinCarList.size();
	}

	public String[] getCarNameList() {
		String names[] = new String[racinCarList.size()];
		for(int i = 0 ; i<racinCarList.size() ; i++ ){
			names[i] = racinCarList.get(i).name;
		}
		return names;
	}

	public String[] splitNames(String str) {
		return str.trim().split(",");
	}

	public List<RacingCar> getRacinCarList() {
		return racinCarList;
	}

	public void setRacinCarList(List<RacingCar> racinCarList) {
		this.racinCarList = racinCarList;
	}

	public void setTryNum(int tryNum) {
		this.tryNum = tryNum;
	}
	
	public void printStatus(int inputTryNum){
		for(int i = 0 ; i < tryNum; i++){
			for(int j = 0 ; j < racinCarList.size() ; j++){
				RacingCar item = racinCarList.get(j);
				item.getCarValue(item.createRandom());
				System.out.println(new StringBuilder(getCarNameList()[j]).append(": ").append(item.getCoordStr()).toString());
				if(j == racinCarList.size()-1){
					System.out.println("");
				}
			}
		}
	}
	
	public String finalWin(){
		int winCoord  = 0;
		for(RacingCar car :racinCarList){
			if(winCoord < car.getCoord()){
				winCoord = car.getCoord();
			}
		}
		StringBuffer names = new StringBuffer();
		for(RacingCar car : racinCarList){
			if(winCoord == car.coord){
				names.append(car.name).append(",");
			}
		}
		String name = names.substring(0, names.length()-1);
		return name + "가 최종우승했습니다.";
	}

}
