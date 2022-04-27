package structural_design.composite_design.computerPart;

class Leaf implements Component{
	int cost;
	private final String component_name;
	
	public Leaf(int cost,String name) {
		this.cost = cost;
		this.component_name = name;
	}
	public void showPrice() {
		System.out.println(this.component_name+" : "+cost);
	}
	public int getPrice() {
		return this.cost;
	}
}