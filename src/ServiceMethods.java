import java.util.Scanner;

public class ServiceMethods {

    //Сравниваем двух Гриффиндорцев
    public void compareGriffindors(Griffindor firstStudent, Griffindor secondStudent) {
        int first = firstStudent.getHonesty() + firstStudent.getHonor() + firstStudent.getNobility();
        int second = secondStudent.getHonesty() + secondStudent.getHonor() + secondStudent.getNobility();
        if (first > second) {
            System.out.println(firstStudent.getFullName() + " лучший Гриффиндорец, чем " + secondStudent.getFullName());
        } else if (first < second) {
            System.out.println(secondStudent.getFullName() + " лучший Гриффиндорец, чем " + firstStudent.getFullName());
        } else {
            System.out.println("Студенты равны!");
        }
    }

    //Сравниваем двух Пуффендуйцев
    public void compareHufflepuff(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int first = firstStudent.getHonesty() + firstStudent.getIndustriousness() + firstStudent.getLoyalty();
        int second = secondStudent.getHonesty() + secondStudent.getIndustriousness() + secondStudent.getLoyalty();
        if (first > second) {
            System.out.println(firstStudent.getFullName() + " лучший Пуффендуец, чем " + secondStudent.getFullName());
        } else if (first < second) {
            System.out.println(secondStudent.getFullName() + " лучший Пуффендуец, чем " + firstStudent.getFullName());
        } else {
            System.out.println("Студенты равны!");
        }
    }

    //Сравниваем двух Когтевранцев
    public void compareRavenclaw(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int first = firstStudent.getIntelligent() + firstStudent.getWise() + firstStudent.getWitty() + firstStudent.getCreative();
        int second = secondStudent.getIntelligent() + secondStudent.getWise() + secondStudent.getWitty() + secondStudent.getCreative();
        if (first > second) {
            System.out.println(firstStudent.getFullName() + " лучший Когтевранец, чем " + secondStudent.getFullName());
        } else if (first < second) {
            System.out.println(secondStudent.getFullName() + " лучший Когтевранец, чем " + firstStudent.getFullName());
        } else {
            System.out.println("Студенты равны!");
        }
    }

    //Сравниваем двух Слизеринцев
    public void compareSlytherin(Slytherin firstStudent, Slytherin secondStudent) {
        int first = firstStudent.getTrick() + firstStudent.getDetermination() + firstStudent.getAmbition() +
                firstStudent.getResourcefulness() + firstStudent.getLustForPower();
        int second = secondStudent.getTrick() + secondStudent.getDetermination() + secondStudent.getAmbition() +
                secondStudent.getResourcefulness() + secondStudent.getLustForPower();
        ;
        if (first > second) {
            System.out.println(firstStudent.getFullName() + " лучший Слизеринец, чем " + secondStudent.getFullName());
        } else if (first < second) {
            System.out.println(secondStudent.getFullName() + " лучший Слизеринец, чем " + firstStudent.getFullName());
        } else {
            System.out.println("Студенты равны!");
        }
    }

    //Сравниваем двух любых студентов
    public void compareAnyStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        int first = firstStudent.getSpellPower() + firstStudent.getTransgressionRange();
        int second = secondStudent.getSpellPower() + secondStudent.getTransgressionRange();
        if (first > second) {
            System.out.println(firstStudent.getFullName() + " обладает бОльшей силой магии, чем " + secondStudent.getFullName());
        } else if (first < second) {
            System.out.println(secondStudent.getFullName() + " обладает бОльшей силой магии, чем " + firstStudent.getFullName());
        } else {
            System.out.println("Студенты равны!");
        }
    }
}

