package br.edu.unifei.ecot12;

public class CensoVisitor implements FishVisitor {
    private int countSalmon = 0;
    private int countEel = 0;

    @Override
    public void visit(AdultSalmon salmon) {
        this.countSalmon++;
    }

    @Override
    public void visit(AdultEel eel) {
        this.countEel++;
    }

    public int getCountSalmon() {
        return countSalmon;
    }

    public void setCountSalmon(int countSalmon) {
        this.countSalmon = countSalmon;
    }

    public int getCountEel() {
        return countEel;
    }

    public void setCountEel(int countEel) {
        this.countEel = countEel;
    }


}