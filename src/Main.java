public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int intNum = 2147483647;
        byte byteNum = 127;
        short shortNum = -32768;
        long longNum = 9223372036854775807L;
        float floatNum = 2.3333333f;
        double doubleNum = 3.4444444444444444;
        System.out.println("Значение переменной intNum с типом int равно " + intNum);
        System.out.println("Значение переменной byteNum с типом byte равно " + byteNum);
        System.out.println("Значение переменной shortNum с типом short равно " + shortNum);
        System.out.println("Значение переменной longNum с типом long равно " + longNum);
        System.out.println("Значение переменной floatNum с типом float равно " + floatNum);
        System.out.println("Значение переменной doubleNum с типом double равно " + doubleNum);

        // Задача 2
        System.out.println("\nЗадача 2");
        float cost = 27.12f;
        long largeNum = 987678965549L;
        float exp = 2.786f;
        short chily = 569;
        short temBoil = -159;
        short cityPopulation = 27897;
        byte codeC = 67;

        // Задача 3
        System.out.println("\nЗадача 3");
        short numStudent1 = 23;
        short numStudent2 = 27;
        short numStudent3 = 30;
        short sheetsNum = 480;
        int sheetsToStudent = sheetsNum / (numStudent1 + numStudent2 + numStudent3);
        System.out.println("На каждого ученика рассчитано " + sheetsToStudent + " листов бумаги.");

        // Задача 4
        System.out.println("\nЗадача 4");
        int bottlePerMinute = 8;
        int min20 = 20;
        int bottlePer20m = bottlePerMinute * min20;
        int bottlePerDay = bottlePerMinute * 60 * 24;
        int bottlePer3Days = bottlePerDay * 3;
        int bottlePer30Days = bottlePerDay * 30;
        System.out.println("за " + min20 + " минут машина произвела " + bottlePer20m + " штук бутылок.");
        System.out.println("за сутки машина произвела " + bottlePerDay + " штук бутылок.");
        System.out.println("за 3 дня машина произвела " + bottlePer3Days + " штук бутылок.");
        System.out.println("за месяц машина произвела " + bottlePer30Days + " штук бутылок.");


        // Задача 5
        System.out.println("\nЗадача 5");
        int numberOfCans = 120;
        int cansOfBrawnToCabinet = 4;
        int cansOfWhiteToCabinet = 2;
        int numberOfCabinets = numberOfCans / (cansOfBrawnToCabinet + cansOfWhiteToCabinet);
        int numberOfBrawnCans = numberOfCabinets * 4;
        int numberOfWhiteCans = numberOfCabinets * 2;
        System.out.println("В школе, где " + numberOfCabinets + " классов, нужно " + numberOfWhiteCans +
                " банок белой краски и " + numberOfBrawnCans + " банок коричневой краски.");


        // Задача 6
        System.out.println("\nЗадача 6");
        int bananWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int numberOfBanans = 5;
        int numberOfMilk = 2;
        int numberOfIceCream = 2;
        int numberOfEggs = 4;
        int breakfastWeight = bananWeight * numberOfBanans +
                                milkWeight * numberOfMilk +
                                iceCreamWeight * numberOfIceCream +
                                eggWeight * numberOfEggs;
        System.out.println("Вес спортивного завтрака:\n" +
                " из " + numberOfBanans + " бананов по " + bananWeight + " граммов каждый,\n" +
                " из " + numberOfMilk*100 + " мл молока по " + milkWeight + " граммов на 100 мл,\n" +
                " из " + numberOfIceCream + " брикетов мороженного по " + iceCreamWeight + " граммов каждый,\n" +
                " из " + numberOfEggs + " яиц по " + eggWeight + " граммов каждое.\n" +
                "Равен " + breakfastWeight + " граммов или " + (float)breakfastWeight/1000 + " кг.");

        // Задача 7
        System.out.println("\nЗадача 7");
        float weightToLoss = 7f;
        float lowSpeedWeightLoss = 0.25f;
        float hiSpeedWeightLoss = 0.5f;
        float lowSpeedDays = weightToLoss/lowSpeedWeightLoss;
        float hiSpeedDays = weightToLoss/hiSpeedWeightLoss;
        float averageDays = (lowSpeedDays + hiSpeedDays)/2;
        System.out.println("Если спортсмен будет терять по " + (int)(lowSpeedWeightLoss*1000) + " граммов в день " +
                "то на похудение на " + (int)weightToLoss + " кг уйдёт " + (int)lowSpeedDays + " дней.");
        System.out.println("Если спортсмен будет терять по " + (int)(hiSpeedWeightLoss*1000) + " граммов в день " +
                "то на похудение на " + (int)weightToLoss + " кг уйдёт " + (int)hiSpeedDays + " дней.");
        System.out.println("В среднем для достижения результата похудения можно достичь за " + (int)averageDays + " дней.");

        // Задача 8
        System.out.println("\nЗадача 8");
        float salaryMaria = 67760f;
        float salaryDenis = 83690f;
        float salaryCristina = 76230f;
        int percentageIncrease = 10;
        float newSalaryMaria = salaryMaria + (salaryMaria/100)*percentageIncrease;
        float newSalaryDenis = salaryDenis + (salaryDenis/100)*percentageIncrease;
        float newSalaryCristina = salaryCristina + (salaryCristina/100)*percentageIncrease;
        float yearSalaryMaria = newSalaryMaria * 12 - salaryMaria * 12;
        float yearSalaryDenis = newSalaryDenis * 12 - salaryDenis * 12;
        float yearSalaryCristina = newSalaryCristina * 12 - salaryCristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMaria + " рублей. Годовой доход вырос на "
         + yearSalaryMaria + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на "
                + yearSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryCristina + " рублей. Годовой доход вырос на "
                + yearSalaryCristina + " рублей.");

    }
}