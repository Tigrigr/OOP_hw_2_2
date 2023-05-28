
public class Main {
    public static void main(String[] args) {

//       Зачисляем Гриффиндорцев

        Griffindor garryPotter = new Griffindor(
                "Гарри Поттер", 12, "Гриффиндорец",
                42, 51, 34, 37, 45);
        Griffindor germionaGraynger = new Griffindor(
                "Гермиона Грейнджер", 13, "Гриффиндорец",
                85, 11, 24, 37, 94);
        Griffindor ronnUizly = new Griffindor(
                "Рон Уизли", 14, "Гриффиндорец",
                63, 24, 38, 74, 15);

//       Зачисляем Слизеринцев

        Slytherin drakoMalfoy = new Slytherin(
                "Драко Малфой", 14, "Слизеринец",
                15, 61, 54, 46, 94, 84, 43);
        Slytherin grehemMontegy = new Slytherin(
                "Грэхэм Монтегю", 13, "Слизеринец",
                45, 12, 48, 21, 64, 67, 24);
        Slytherin gregoriGoyl = new Slytherin(
                "Грегори Гойл", 16, "Слизеринец",
                58, 18, 46, 84, 43, 25, 11);

//        Зачисляем Пуффендуйцев

        Hufflepuff zahariaSmit = new Hufflepuff(
                "Захария Смит", 11, "Пуффендуец",
                42, 55, 51, 68, 43);
        Hufflepuff sedrikDiggory = new Hufflepuff(
                "Седрик Диггори", 12, "Пуффендуец",
                30, 48, 31, 89, 24);
        Hufflepuff dzhastinPhinch = new Hufflepuff(
                "Джастин Финч-Флетчли", 10, "Пуффендуец",
                8, 38, 48, 91, 5);

//        Зачисляем Когтевранцев

        Ravenclaw chzhouChang = new Ravenclaw(
                "Чжоу Чанг", 15, "Когтевранец",
                31, 59, 34, 64, 18, 46);
        Ravenclaw padmaPatil = new Ravenclaw(
                "Падма Патил", 14, "Когтевранец",
                13, 49, 97, 37, 67, 82);
        Ravenclaw markusBelbi = new Ravenclaw(
                "Маркус Белби", 12, "Когтевранец",
                28, 34, 26, 49, 54, 71);

//        Выводим описание студентов в консоль
        System.out.println(garryPotter.toString());
        System.out.println(drakoMalfoy.toString());
        System.out.println(chzhouChang.toString());
        System.out.println(zahariaSmit.toString());

//        Вызываем методы сравнения
        ServiceMethods methods = new ServiceMethods();
        methods.compareGriffindors(garryPotter, germionaGraynger);
        methods.compareSlytherin(drakoMalfoy, grehemMontegy);
        methods.compareHufflepuff(zahariaSmit, sedrikDiggory);
        methods.compareRavenclaw(chzhouChang, padmaPatil);
        methods.compareAnyStudents(garryPotter, drakoMalfoy);

    }
}