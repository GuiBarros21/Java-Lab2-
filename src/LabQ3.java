import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabQ3 {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		ArrayList<Car> arraylist = new ArrayList<Car>();
	
		arraylist.add(new Car("Ford","Fusion",2019) );
		arraylist.add(new Car("Ford","Mustanng",2019) );
		arraylist.add(new Car("Honda","Civic",2000));
		arraylist.add(new Car("Honda","CRV",2014));
		
		Collections.sort(arraylist);
		
		System.out.println(arraylist);
		
		
	}

}
