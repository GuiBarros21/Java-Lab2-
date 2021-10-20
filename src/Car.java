
public class Car implements Comparable {

		public String make;
		public String model;
		public int year;
		
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
		
		
		public int compareTo(Car comaprecar) {
			int compareyear =((Car)comaprecar).getYear();
			return this.year - compareyear;
			
		}

		@Override
		public String toString() {
			return "make=" + make + ", model=" + model + ", year=" + year;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

		
		
		
		
	
		
		
	}
		
