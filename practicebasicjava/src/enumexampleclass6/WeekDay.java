package enumexampleclass6;

public class WeekDay {


   Week day;

   public WeekDay(){}
       public WeekDay(Week day){
       this.day = day;

    }

    public void whatIShouldDoToday(){
       switch (day){
           case Monday:
               System.out.println("Review sunday class materials");
               break;
           case Tuesday:
               System.out.println("Start doing the homework");
           case Wednesday:
               System.out.println("continue with codelab");
           case Thursday:
               System.out.println("Cintinue with codelab");
           case Friday:
               System.out.println("Prepare for weekend class materials");
           case Saturday:
               System.out.println("Join saturday class");
           case Sunday:
               System.out.println("Join sunday class");
               default:
                   System.out.println("No more days left of week.Find another planet to get 8 days a week");
       }
    }
}
