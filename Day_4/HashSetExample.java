import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(1);
		Object hash2 = new HashSet<>();
		hash2 = hash.clone();
		
		System.out.println(hash2);
	}
}
