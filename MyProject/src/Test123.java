
public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!");
		String s = "My password 'welcome1' correct";
		
		String[] a=s.split("'");
		
		for (String string : a) {
			System.out.println(string);
		}

	}

}
