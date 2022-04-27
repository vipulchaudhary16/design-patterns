package structural_design.composite_design.computerPart;

import java.util.ArrayList;

class Composite implements Component{
	private final String composition_name;
	private final ArrayList<Component> component_list = new ArrayList();
	public Composite(String name) {
		super();
		this.composition_name = name;
	}
	
	public void addComponent(Component component) {
		this.component_list.add(component);
	}
	
	public void showPrice() {
		System.out.println(this.composition_name);
		for(Component component:this.component_list) {
			component.showPrice();
		}
	}
	public int getPrice() {
		int price=0;
		for(Component component : this.component_list) {
			price+=component.getPrice();
		}
		return price;
	}
	public void showCompositePrice() {
		System.out.println("Composite Price of "+this.composition_name+" is "+this.getPrice());
	}


}