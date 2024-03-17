public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog +4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight + secondBoxerWeight);
        System.out.println(secondBoxerWeight - firstBoxerWeight);

        //Задача 7
        var result = secondBoxerWeight % firstBoxerWeight;
        System.out.println(result);

        //Задача 8
        var allWorkHours = 640;
        var oneWorkerHours = 8;
        var countWorker = allWorkHours / oneWorkerHours;
        System.out.println("Всего работников в компании - " + countWorker + " человек");
        countWorker = countWorker + 94;
        System.out.println("Если в компании работает " + countWorker + " человек, то всего " + (countWorker * oneWorkerHours) + " часов работы может быть поделено между сотрудниками");
    }
}