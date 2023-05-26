public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int honesty;

    public Griffindor(String fullName, int age, int spellPower, int transgressionRange, int nobility, int honor, int honesty) {
        super(fullName, age, spellPower, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.honesty = honesty;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
