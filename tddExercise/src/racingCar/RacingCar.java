package racingCar;

public class RacingCar {
	
	int coord;
	String name;
	
	public RacingCar() {
	}
	
	public RacingCar(String name) {
		this.name = name;
	}
	

	public void goCar(int i) {
		this.coord = i;
	}
	
	public int getCoord(){
		return coord;
	}
	
	public void setCoord(int coord){
		this.coord = coord;
	}

	public int getCarValue(int random) {
		if(random >= 4){
			return this.coord+=1;
		}
		return this.coord;
	}

	public int createRandom() {
		return (int)(Math.random()*10)+1;
	}
	
	public String showCarvalue(){
		StringBuffer step = new StringBuffer();
		for(int i = 0 ; i< coord ; i++){
			step.append("-");
		}
		return step.toString();
	}

	public String getCoordStr() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0 ; i < getCoord() ; i++){
			builder.append("-");
		}
		return builder.toString();
	}

}
