package br.edu.unifei.ecot12;

public interface FishVisitor {
    void visit(AdultSalmon salmon);
    void visit(AdultEel eel);
}