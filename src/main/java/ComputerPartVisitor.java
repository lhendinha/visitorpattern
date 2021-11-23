public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(CPU cpu);

    public void visit(Memory memory);

    public void visit(Motherboard motherboard);

    public void visit(PSU psu);

    public void visit(SSD ssd);

    public void visit(VGA vga);
}