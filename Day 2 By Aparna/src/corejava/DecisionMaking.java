package corejava;

public class DecisionMaking {
	
	public static void main(String[] args) {
		
		// If Else Example
		String name = "Dean Ambrose",name2="Dhoni";
		System.out.println("If Else Example:");
		if(name=="Dean Ambrose") {
			System.out.println("WELCOME TO WRESTLING");
		}else {
			System.out.println("Wrong User");
		}
		
		// If Else If
		int num=45;
		System.out.println("\nIf Else If Example:");
		if(num<20) {
			System.out.println("You have failed the exam");
		}else if(num>=20) {
			System.out.println("You have passed the exam");
		}
		
		
		// Switch Case
		String day = "Saturday";
		System.out.println("\nSwitch Example:");
		switch(day) {
		
		case "Saturday":
			System.out.println("Weekend so just RELAX");
			break;
		case "Sunday":
			System.out.println("Tomorrow is monday");
			break;
		default: System.out.println("Work Day");
		
		}
	}
}
