package practice.classroom;

public class LogicalOperators {
    public static void main(String[] args) {

        // Conditional statement
        // operator: if

        boolean isStudent = true;

        if(!isStudent) {
            System.out.println("He is not a student!");
        } else {
            System.out.println("He is a She!");
        }

        if (4<5) {
            System.out.println("Yes, 4<5");
        }

        int x = 10;
        int y = 20;

        if(x < y) {
            System.out.println("yes, this is true");
        } else {
            System.out.println("no, this is false");
        }

        // logical operators OR, AND in Java:
        // || - OR
        // && - AND
        int speedMercedes = 40;
        int speedBmw = 50;
        int speedLada = 100;
        int speedSkoda = 120;

        if (speedBmw < speedMercedes && speedBmw < speedLada) {
            System.out.println("BMW lose!");
        } else {
            if (speedSkoda < speedLada) {
                System.out.println("Win another car!");
            }
                else System.out.println("Win Skoda!");
        }

        // operator: switch

        int ukSize = 7;
        int euSuze;
         switch (ukSize) {
             case 6:
                 euSuze =39;
                 System.out.println("EU Size: " + euSuze);
                 //break;
             case 7:
                 euSuze = (int) 40.5;
                 System.out.println("EU Size: " + euSuze);
                 //break;
             default:
                 System.out.println("Unknown size: " + ukSize);
         }



    }
}
