package enumexampleclass6;

public class TestWeek {
    public static void main(String[] args) {


       WeekDay day = new WeekDay(Week.Noday);
        day.whatIShouldDoToday();

        WeekDay day1 = new WeekDay(Week.Saturday);
        day1.whatIShouldDoToday();
    }
}
