public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(CPU cpu) {
        System.out.println("Displaying CPU.");
    }

    @Override
    public void visit(Memory memory) {
        System.out.println("Displaying Memory.");
    }

    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Displaying Motherboard.");
    }

    @Override
    public void visit(PSU psu) {
        System.out.println("Displaying PSU.");
    }

    @Override
    public void visit(SSD ssd) {
        System.out.println("Displaying SSD.");
    }

    @Override
    public void visit(VGA vga) {
        System.out.println("Displaying VGA.");
    }
}