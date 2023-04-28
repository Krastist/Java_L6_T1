import ru.netology.services.MonthsOfRest;

public class Main {

    public static void main(String[] args) {
        MonthsOfRest service = new MonthsOfRest();
        int month = service.calcMonths(100_000, 60_000, 150_000);
        System.out.println(month);
    }
}
