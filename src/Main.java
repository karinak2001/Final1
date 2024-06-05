import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //כלל אצבע חדש: בתוכניות שנכתוב נימנע ככל האפשר מכתיבת מספרים.
        //במקום כל מספר שכתוב בתוכנית, נגדיר קבוע בעל שם משמעותי שייצג אותו.
        //את הכלל הזה ניתן ליישם, לדוגמה, על גודל של מערך.
        //במקום להשתמש במספר כדי להגדיר גודל מערך – נשתמש בקבוע.

        final int MAX_COURSE_FOR_STUDENT = 10;

        int[] grades = new int[MAX_COURSE_FOR_STUDENT];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade: ");
            grades[i] = scanner.nextInt();
        }

    }
}