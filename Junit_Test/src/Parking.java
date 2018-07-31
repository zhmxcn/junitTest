import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parking {
	public int MaxCnt;
	public int Cnt = 0;
	
	public Set<Car> Cars = new HashSet();
	
	public void setMax(int cnt) {
		MaxCnt = cnt;
	}
	
	public boolean park( Car car ) {
		
		if (MaxCnt > Cnt) {
			Cars.add(car);
			Cnt++;
			return true;
		}
		return false;
	}
	
	public boolean getCar(int num) {
		for (Car car : Cars) {
			if (car.num == num){
				Cnt--;
				Cars.remove(car);
				return true;
			}
		}
		return false;
	}
}
