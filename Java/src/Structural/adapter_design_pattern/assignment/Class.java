package Structural.adapter_design_pattern.assignment;

public class Class {
    public static void main(String[] args) {
        Pen p = new PenAdapter();
        AssignmentWork hw = new AssignmentWork();
        hw.setP(p);
        hw.writeAssignment("Let's work on this recent assignment");
    }
}
