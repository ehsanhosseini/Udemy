package udemy;

public class Activity {
	private String name;
	private int start;
	private int finish;
	
	Activity(String name, int start, int finish){
		this.name  = name;
		this.start = start;
		this.finish = finish;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}
	
	public String toString() {
		return "Name " +name+ " Start=" +start+ " Finish=" +finish ; 
	}

}
