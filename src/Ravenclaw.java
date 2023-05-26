public class Ravenclaw extends Hogwarts{
    private int intelligent;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String fullName, int age, String faculty, int spellPower, int transgressionRange, int intelligent, int wise, int witty, int creative) {
        super(fullName, age, faculty, spellPower, transgressionRange);
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
