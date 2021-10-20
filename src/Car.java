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
		
		public static Comparator<Car> CarYearComparator = new Comparator<Car>();
		
		public int compare(Car c1, Car c2)
		{
			int CarYear1 = c1.getYear();
			int CarYear2 = c2.getYear();
			
			return CarYear1.
		}
			
	}
		
