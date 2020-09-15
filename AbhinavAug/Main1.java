import java.util.List;
import java.util.ArrayList;
public class Main1 {
public static void main(String args[]) {
	List<Wheel> wheels=new ArrayList<>();
	wheels.add(new Wheel(33.3F,40.0F,50.0F,10000.0F));
	Car c1=new Car(wheels,new Engine1(TYPE.DIESEL),100000.0F);
	System.out.println(c1.price);
	System.err.println(c1.enginetype.getenginetype());
}
}
