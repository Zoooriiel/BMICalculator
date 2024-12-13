package BMI;

public class BMICalculator {

    double weight;
    double height;
    double BMI;

public BMICalculator(double weight, double height){
    this.weight = weight;
    this.height = height;
}

    public void calculateBMI(){
        BMI = weight / (height * height);
    }

    public String showBMI(){

        String msg = "Your BMI is: ";
        String result;

        if(BMI < 18.5)
            result = "Underweight\n";
        else if(BMI >= 18.5 && BMI <= 24.9)
        result = "Healthy weight\n";
        else if(BMI >= 25.0 && BMI <= 29.9)
            result = "Overweight\n";
        else
            result = "Obesity\n";

        return msg + result;

    }


}
