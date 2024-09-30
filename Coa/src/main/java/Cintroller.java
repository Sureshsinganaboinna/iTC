
public class Cintroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 2;
		int z;
		int z1;
		
		z1 = x++ + ++y*3;
		z = x--%2;
		
		System.out.println("z1="+ z1);
		System.out.println("z="+ z);
		System.out.println(z1-z);

	}

}
