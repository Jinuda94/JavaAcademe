package cloudstudying;

import java.util.Scanner;

public class Ex_14 {

	public static double calculateBMI(double weight, double tall) {
        double bmi = weight/Math.pow(tall, 2);
        return bmi;
    }
    public static void printBMIClassification(double bmi) {
    	String str = String.format("%.2f", bmi);
        System.out.println("BMI: "+str);
        if(bmi<18.5) {
        	System.out.println("저체중 입니다.");
        } else if(bmi<25) {
        	System.out.println("정상 입니다.");
        } else if(bmi<30) {
        	System.out.println("과체중 입니다.");
        } else {
        	System.out.println("비만 입니다.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("몸무게(kg) 입력");
        double weight = input.nextDouble();
        System.out.println("키(m) 입력");
        double tall = input.nextDouble();
        input.close();
        // BMI 지수 계산
        double bmi = calculateBMI(weight, tall);
        // BMI 지수를 입력하여 비만도 결과 출력
        printBMIClassification(bmi);
    }

}
