class Frog {
	
	private int Id;
	private String name;
	
	public Frog(int id, String name) {
		this.Id = id;
		this.name = name;
		
	}
	
	public String toString() {
		
		return String.format("%4d:  %s",  Id, name);
		/*
		
		StringBuilder sb = new StringBuilder();
		sb.append(Id).append(": ").append(name);
		
		return sb.toString();
	*/
		
		
		
	}
}



public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "freddy");
		Frog frog2 = new Frog(5, "Roger");
		
		System.out.println(frog1);
		System.out.println(frog2);
		

	}

}
