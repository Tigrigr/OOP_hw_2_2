public class Griffindor extends Hogwarts {
    private int nobility; //Благородство
    private int honor;  //Честь
    private int honesty; //Храбрость

    public Griffindor(String fullName, int age, String faculty, int spellPower, int transgressionRange, int nobility, int honor, int honesty) {
        super(fullName, age, faculty, spellPower, transgressionRange);
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

    @Override
    public String toString() {
        return "Имя: " + getFullName() +
                "; Возраст = " + getAge() +
                "; Факультет = " + getFaculty() +
                "; Сила магии = " + getSpellPower() +
                "; Расстояние трансгрессии = " + getTransgressionRange() +
                "; Благородство = " + nobility +
                "; Честь = " + honor +
                "; Храбрость = " + honesty
                ;
    }
}
