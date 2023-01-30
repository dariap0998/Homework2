public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var bothBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов состовляет " + bothBoxersWeight + " кг.");
        var differenceBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весами бойцов состовляет " + differenceBoxersWeight + " кг.");
        var defferenceBoxers = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница весов между бойцами - " + defferenceBoxers + "кг.");


        var workHours = 640;
        var workerHours = 8;
        var amountWorkers = workHours / workerHours;
        System.out.println("Всего работников компании - " + amountWorkers + " человек");

        amountWorkers = amountWorkers + 94;
        workHours = amountWorkers * 8;
        System.out.println("Если в компании работает " + amountWorkers + " человека, то всего " + workHours + " часов работы может быть поделено между сотрудниками.");
    }
}