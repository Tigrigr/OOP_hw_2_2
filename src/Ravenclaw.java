public class Ravenclaw extends Hogwarts {
    private int intelligent; //Ум
    private int wise; //Мудрость
    private int witty; //Остроумность
    private int creative; //Творчество

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

    @Override
    public String toString() {
        return "Имя: " + getFullName() +
                "; Возраст = " + getAge() +
                "; Факультет = " + getFaculty() +
                "; Сила магии = " + getSpellPower() +
                "; Расстояние трансгрессии = " + getTransgressionRange() +
                "; Ум = " + intelligent +
                "; Мудрость = " + wise +
                "; Остроумность = " + witty +
                "; Творчество = " + creative
                ;
    }
}
