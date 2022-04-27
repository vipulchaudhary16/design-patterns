package Structural.composite_design.computerPart;

public class Demo {
		public static void main(String [] args) {
				Component software = new Leaf(12000,"Software");
				Component liveware = new Leaf(3000,"Liveware");
	
				Component keyboard = new Leaf(3500,"Keyboard");
				Component mouse = new Leaf(600,"Mouse");
	
				Component monitor = new Leaf(10000,"Monitor");
				Component printer = new Leaf(6000,"Printer");
	
				Component alu = new Leaf(3000,"ALU");
				Component cu = new Leaf(2500,"CU");
	
				Component ram = new Leaf(8000,"RAM");
				Component rom = new Leaf(2000,"ROM");
	
				Component hd = new Leaf(4000,"Hard-drive");
				Component fd = new Leaf(2500,"Floppy Disk");
	
				Composite computer = new Composite("Computer System");
				Composite hw = new Composite("Hardware");
				Composite in = new Composite("Input");
				Composite out = new Composite("Output");
				Composite cpu = new Composite("CPU");
				Composite mem = new Composite("Memory");
				Composite m = new Composite("Main");
				Composite s = new Composite("Secondary");
	
				computer.addComponent(hw);
				computer.addComponent(software);
				computer.addComponent(liveware);
	
				hw.addComponent(in);
				hw.addComponent(out);
				hw.addComponent(cpu);
	
				in.addComponent(keyboard);
				in.addComponent(mouse);
	
				out.addComponent(monitor);
				out.addComponent(printer);
	
				cpu.addComponent(alu);
				cpu.addComponent(cu);
				cpu.addComponent(mem);
	
				mem.addComponent(m);
				mem.addComponent(s);
	
				m.addComponent(ram);
				m.addComponent(rom);
	
				s.addComponent(fd);
				s.addComponent(hd);
	
				computer.showPrice();
				computer.showCompositePrice();
		}
	}