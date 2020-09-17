package day1_oops;
enum TYPE {D,P}
public class Engine1 {
		
		private TYPE enginetype;

		Engine1(TYPE type) {
			super();
			this.enginetype = type;
		}
		 
		 public TYPE getengineType()
		 {
			 return enginetype;
		 }

	}

