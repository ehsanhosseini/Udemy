package udemy;

public class Fractional {

	int weight;
	int value;
	int item;
	double ratio;
	
	Fractional(int item, int weight, int value){
		this.weight = weight;
		this.value = value;
		this.item = item;
		ratio = value*(1.0/weight);
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return "Item->"+item+ "     Weigth:"+weight+ "      Value:"+value+ "     Ratio:"+ratio ;
	}
	
	
	
}
