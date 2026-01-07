public class Conditional_Practice {
    public static void main(String[] args) {
        int marks = 90;

        if(marks>=90){
            System.out.println("Excellent");
        }
        else if(marks >= 70 && marks <= 89){
            System.out.println("Very Good");
        }
        else if(marks >= 50 && marks <= 69 ){
            System.out.println("good");
        }
        else{
            System.out.println("Pls try again next year, You are Failed");
        }
    }
    
}
