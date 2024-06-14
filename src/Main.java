public class Main {
    public static void main(String[] args) {
        byte carCar = 124;
        short gaGa = 342;
        int meow = -329765;
        long mu = 8888888888888l;
        float coCo = 4.5f;
        double beBe = 7.98765432123;
        System.out.println("Значение переменной carCar с типом byte равно " + carCar);
        System.out.println("Значение переменной gaGa с типом short равно " + gaGa);
        System.out.println("Значение переменной meow с типом int равно " + meow);
        System.out.println("Значение переменной mu с типом long равно " + mu);
        System.out.println("Значение переменной coCo с типом float равно " + coCo);
        System.out.println("Значение переменной beBe с типом double равно " + beBe);

        float box = 27.12f;
        double can = 2.786d;
        int ink = 569;
        short paper = -159;
        long who = 27897;
        byte what = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short bum = 480;
        int result = bum / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        byte t2m = 16;
        int t1 = t2m * 10;
        int t2 = t2m * 30 * 24;
        int t3 = t2 * 3;
        int t4 = t3 * 10;
        System.out.println("За двадцать минут машина произвела " + t1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + t2 + " штук бутылок");
        System.out.println("За три дня машина произвела " + t3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + t4 + " штук бутылок");

        byte c0 = 120;
        byte cB = 4;
        byte cW = 2;
        int cl = c0 / (cB + cW);
        int c0B = cl * cB;
        int c0W = cl * cW;
        System.out.println("В школе, где " + cl + " классов, нужно " + c0B + " коричневой краски и " + c0W + " белой краски");

        byte banan = 80;
        byte moloko = 105;
        byte iceCream = 100;
        byte egg = 70;
        byte bananR = 5;
        byte molokoR = 2;
        byte iceCreamR = 2;
        byte eggR = 4;
        double rec = bananR * banan + molokoR * moloko + iceCreamR * iceCream + eggR * egg;
        double kg = rec / 1000;
        System.out.println("В граммах " + rec);
        System.out.println("В килограммах " + kg);

        short min = 250;
        short max = 500;
        short fin = 7000;
        int dayMin = fin / min;
        int dayMax = fin / max;
        int dayX = fin / ((min + max) / 2);
        int dayY = (dayMin + dayMax) / 2;
        System.out.println("При похудении с режимом 500г/день спортсмен похудеет на 7 кг за " + dayMax + " дней.");
        System.out.println("При похудении с режимом 250г/день спортсмен похудеет на 7 кг за " + dayMin + " дней.");
        System.out.println("При похудении с режимом 250-500г/день спортсмен похудеет на 7 кг за " + dayX + " дней.");
        System.out.println("При похудении с переменным режимом 500г/день или 250г/день спортсмен похудеет на 7 кг за " + dayY + " дней.");

        int masha = 67760;
        int den = 83690;
        int cris = 76230;
        double masha2 = masha + masha * 0.1;
        double den2 = den + den * 0.1;
        double cris2 = cris + cris * 0.1;
        double mashaR = masha2 * 12 - masha * 12;
        double denR = den2 * 12 - den * 12;
        double crisR = cris2 * 12 - cris * 12;
        System.out.println("Маша теперь получает " + masha2 + " рублей в месяц. Годовой доход вырос на " + mashaR + " рублей.");
        System.out.println("Денис теперь получает " + den2 + " рублей в месяц. Годовой доход вырос на " + denR + " рублей.");
        System.out.println("Кристина теперь получает " + cris2 + " рублей в месяц. Годовой доход вырос на " + crisR + " рублей.");
    }
}