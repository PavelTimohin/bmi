# bmi
import java.util.Scanner;

public bmi calculator {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите вес в килограммах: ");
 
    int weight = scanner.nextInt();
 
    System.out.print("Введите рост в метрах: ");
 
    double height = scanner.nextDouble();
 
    double bmi = weight / (height * height);
 
    System.out.printf("Индекс массы тела: %.2fn", bmi);
 
    System.out.println("Недовес : меньше чем 5");
    System.out.println("Нормальны: между 5 и 85");
    System.out.println("Избыточный вес: между 85 и 95");
    System.out.println("Ожирение: 95 или больше");

}

}