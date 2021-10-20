import java.util.Comparator;

public class Car implements Comparable {

		private String make;
		private String model;
		private int year;
		
		public Car(String make, String model, int year)
		{
			
			this.make = make;
			this.model = model;
			this.year = year;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		
		
		public int compareTo(Car comparecar) {
			int compareyear = ((Car)comparecar).getYear();
			/* Ascending order */
			return this.year - compareyear;
			
		}
		
		@Override
		public String toString() {
			return "make=" + make + ", model=" + model + ", year=" + year;
		}
		
		public int compare(Car car1, Car car2)
		{
			return Integer.compare(car1.getYear(), car2.getYear());
		}

		
}
