public class Main {
    public static void main(String[] args) {
        int box = 1277;
        System.out.println("Значение переменной box с типом int равно "+ box);

        float one = 27.12F;
        long second = 987678965549L;
        double third = 2.786;
        short forth = 569;
        short fifth = -159;
        int sixth = 27897;
        byte seventh = 67;
        System.out.println((one + second + third + forth + fifth + sixth + seventh) * 0 + " прикольный смайлик?");

        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentEkatirina = 30;
        short sheets_of_paper = 480;
        short  allStudents = (short) (studentsLudmila + studentEkatirina + studentsAnna);
        short answer = (short) (sheets_of_paper / allStudents);
        System.out.println("на каждого ученика рассчитано " + answer + " листов бумаги");

        byte machinePerMin = 8;
        int machinePer20Min = machinePerMin * 20;
        int machinePer24Hour = machinePer20Min * 72;
        int machinePer3Days = machinePer24Hour * 3;
        int machinePer1Month = machinePer3Days * 10;
        System.out.println("за 20 минут машина произвела " + machinePer20Min + " бутылок");
        System.out.println("за 24 часа машина произвела " + machinePer24Hour + " бутылок");
        System.out.println("за 3 дня машина произвела " + machinePer3Days + " бутылок");
        System.out.println("за 1 месяц машина произвела " + machinePer1Month + " бутылок");

        byte paintCans = 120;
        byte white = 2;
        byte brown = 4;
        int oneClassroom = white + brown;
        int allClassroom = paintCans / oneClassroom;
        int whiteCans = allClassroom * white;
        int brownCans = allClassroom * brown;
        System.out.println("В школе, где " + allClassroom + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        byte bananas = 5;
        byte milk;
        milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int bananasWeight = bananas * bananaWeight;
        int allMilkWeight = milk * milkWeight;
        int allIceCreamWeight = iceCreamWeight * iceCream;
        int eggsWeight = eggWeight * eggs;
        int cocktail = bananasWeight + allMilkWeight + allIceCreamWeight +eggsWeight;
        System.out.println("В граммах: " + cocktail);
        float cocktailKG = cocktail / 1000f;
        System.out.println("в килограммах: " + cocktailKG);

        byte initialWeight = 7;
        float minLoseWeight = 0.25f;
        float maxLoseWeight = 0.5f;
        float maxDayLoseWeight = initialWeight / maxLoseWeight;
        float minDayLoseWeight = initialWeight / minLoseWeight;
        float averageNumberOfDays = (minDayLoseWeight + maxDayLoseWeight) / 2;
        System.out.println("минимальное кол-во дней для похудения: " + maxDayLoseWeight);
        System.out.println("максимальное кол-во дней для похудения: " + minDayLoseWeight);
        System.out.println("среднее кол-во дней дня похудения: " + averageNumberOfDays);

        int salaryMasha = 67760;
        float salaryMashaGrow = salaryMasha * 1.1f;
        int oneYearSalaryMasha = salaryMasha * 12;
        float oneYearSalaryMashaGrow = salaryMashaGrow * 12;
        float salaryDifferentMasha = oneYearSalaryMashaGrow - oneYearSalaryMasha;
        System.out.println("Маша теперь получает " + salaryMashaGrow + " рублей. Годовой доход вырос на " + salaryDifferentMasha + " рублей");
        int salaryDenis = 83690;
        float salaryDenisGrow = salaryDenis * 1.1f;
        int oneYearSalaryDenis = salaryDenis * 12;
        float oneYearSalaryDenisGrow = salaryDenisGrow * 12;
        float salaryDifferentDenis = oneYearSalaryDenisGrow - oneYearSalaryDenis;
        System.out.println("Денис теперь получает " + salaryDenisGrow + " рублей. Годовой доход вырос на " + salaryDifferentDenis + " рублей");
        int salaryKristina = 76230;
        float salaryKrisGrow = salaryKristina * 1.1f;
        int oneYearSalaryKris = salaryKristina * 12;
        float oneYearSalaryKrisGrow = salaryKrisGrow * 12;
        float salaryDifferentKris = oneYearSalaryKrisGrow - oneYearSalaryKris;
        System.out.println("Кристина теперь получает " + salaryKrisGrow + " рублей. Годовой доход вырос на " + salaryDifferentKris + " рублей");
    }
}