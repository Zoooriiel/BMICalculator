package utility;

public class PrinterHelper {

    public static void showMainMenu() {
        System.out.println("*--- ::a. Enter your height/weight:: ---*");
        System.out.println("*--- ::b. Exit program ::            ---*");
        System.out.println("*****************************************");
    }

    public static void showHeightMenu() {
        System.out.println("*--- ::Enter your height          :: ---*");
        System.out.println("*****************************************");
    }

    public static void showWeightMenu() {
        System.out.println("*--- ::Enter your Weight          :: ---*");
        System.out.println("*****************************************");
    }

    // Show BMI result
    public static void showBMIResult(String feedback) {
        System.out.println("*--- ::BMI Result                 :: ---*");
        System.out.println(feedback);
    }

    public static void showInvalidEntry(){
        System.out.println("*--- ::INVALID INPUT              :: ---*");
        System.out.println("*--- ::Please enter a or b        :: ---*");
    }

    public static void testAgain() {
        System.out.println("*--- ::Test again?                :: ---*");
        System.out.println("*--- ::a. Enter your height/weight:: ---*");
        System.out.println("*--- ::b. Exit program ::            ---*");
        System.out.println("*****************************************");
    }
}


