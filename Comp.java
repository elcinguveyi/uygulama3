import java.util.ArrayList;

public class Comp {
	public static void main(String[] args) {
		House home = new House();
		System.out.println(home);
		System.out.println(home.getm2("Kitchen"));
		
		home = null;
		System.out.println(home);
		System.out.println(home.getm2("Kitchen"));
	}
}

class House{
	private Room r1, r2, r3;
	private ArrayList<Room> rooms;
	public House(){
		r1 = new Room("Living Room","20 m2");
		r2 = new Room("Bed Room","15 m2");
		r3 = new Room("Kitchen","10 m2");
		
		rooms = new ArrayList<Room>();
		rooms.add(r1);
		rooms.add(r2);
		rooms.add(r3);
	}
	@Override
	public String toString() {
		String str="";
		for(Room r : rooms)
			str = str + r.getName()+"\n";
		
		return str;
	}
	
	public String getm2(String str){
		for(Room r : rooms)
			if(r.getName().compareTo(str)==0)
				return r.getAlan();
		return null;
	}
	
}

class Room{
	private String name, alan;
	public String getName() {
		return name;
	}
	public String getAlan() {
		return alan;
	}
	public Room(String name, String m2){
		this.name = name;
		alan = m2;
	}
	
}