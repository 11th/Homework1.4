public class Main {
    public static void main(String[] args) {
        int i = 1;

        //Task 1
        System.out.println("Task 1");
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--){
            System.out.print(i + " ");
        }

        //Task 2
        System.out.println("\nTask 2");
        int friday = 5;
        for (i = friday; i <= 31; i+=7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }

        //Task 3
        System.out.println("Task 3");
        int year = 2022;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int tact = 79;
        for (i = 0; i <= (year + yearsAfter); i+=tact){
            int checkYear = year;
            if (year - yearsBefore >= 0)
                checkYear = year - yearsBefore;

            if (i >= checkYear)
                System.out.println(i);
        }
    }
}