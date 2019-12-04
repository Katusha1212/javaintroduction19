package ua.dp.ort.homework4;

public class HomeWork4 {

	public static void main(String[] args) {
		// 1)Дано 2 числа  Для этих чисел найти сумму, разность,произведение, частное
		
	int a = 5;
	int b = 10;
	
    int sum = a + b;
    int difference = a - b;
    int composition = a * b;
    float div = (float) a / b;
    
    // результаты вывести в консоль
    
    System.out.println(sum);
    System.out.println(difference);
    System.out.println(composition);
    System.out.println(div);
    
    // 2) Возвести число 5 в степень 5
   int number = 5;
   int degree = 5;
    
//   результаты вывести в консоль
    System.out.println(Math.pow(number, degree));
    System.out.println(number * number * number * number * number);
    
//    3) Дана функция y = 2x + 5;
//    вывести значение y при  x = 2
    int x = 2;
    int y = (2 * x) +5;
    System.out.println(y);
   
//    Вывести значения при x1 = 9.5;
    
    double x1 = 9.5;
    double y1 = (2 * x1) +5;
    System.out.println(y1);
    
//    4) Даны стороны прямоугольника x2 = 4.5 метра, y2 = 3.1 метра
    
    
// с помощью арифметических операций вычислить и вывести в консоль площадь прямоуголька
    
    float x2 = 4.5f;
    float y2 = 3.1f;
    float squareRectangle = x2 * y2;
    System.out.println(squareRectangle);
    
//количество полных квадратных метров площади прямоуголька
    System.out.println(Math.floor(squareRectangle));
    
//    5) Есть 11 яблок, эти яблоки раздали 3м детям так чтобы всем досталось одинаковое количество целых яблок.
//    с помощью арифметических операций вычислить сколько целых яблок досталось каждому ребенку
    
    int apples = 11;
    int children = 3;
    int applesForBaby = (apples / children);
    System.out.println(applesForBaby);
  
//    с помощью арифметических операций вычислить сколько яблок осталось.
    
    System.out.println(apples % applesForBaby );
    
/*   6) Есть ограниченная дистанция, за которую нельзя выходить. Дистанция равна 1 метр и 43 сантиметра.
    Лягушка находиться посредине этой дистанции и начинает прыгать.
    Каждый ее прыжок равен 2,5 сантиметра.
    С помощью арифметических операций вычислить и вывести в консоль сколько полных прыжков лягушка может сделать.*/
    
//    2,5 сантиметра =0,025 метра 
    
    double distanceLength = 1.43;
    double lengthJumpFrog = 0.025 ;
    double distanceToJump = distanceLength / 2;       
    int numberFullJumps = (int) (distanceToJump / lengthJumpFrog); 
    System.out.println(numberFullJumps);

    
//    7) дано 2 числа типа.Вывести корректную сумму этих чисел 

    int firstOperand = 1999999999;
    int secondOperand = 1999999999;
    long rezult = ((long) firstOperand +  secondOperand) ;
    System.out.println(rezult);
   
	}
}
