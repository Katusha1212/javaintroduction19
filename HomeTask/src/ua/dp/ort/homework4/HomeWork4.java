package ua.dp.ort.homework4;

public class HomeWork4 {

	public static void main(String[] args) {
		// 1)���� 2 �����  ��� ���� ����� ����� �����, ��������,������������, �������
		
	int a = 5;
	int b = 10;
	
    int sum = a + b;
    int difference = a - b;
    int composition = a * b;
    float div = (float) a / b;
    
    // ���������� ������� � �������
    
    System.out.println(sum);
    System.out.println(difference);
    System.out.println(composition);
    System.out.println(div);
    
    // 2) �������� ����� 5 � ������� 5
   int number = 5;
   int degree = 5;
    
//   ���������� ������� � �������
    System.out.println(Math.pow(number, degree));
    System.out.println(number * number * number * number * number);
    
//    3) ���� ������� y = 2x + 5;
//    ������� �������� y ���  x = 2
    int x = 2;
    int y = (2 * x) +5;
    System.out.println(y);
   
//    ������� �������� ��� x1 = 9.5;
    
    double x1 = 9.5;
    double y1 = (2 * x1) +5;
    System.out.println(y1);
    
//    4) ���� ������� �������������� x2 = 4.5 �����, y2 = 3.1 �����
    
    
// � ������� �������������� �������� ��������� � ������� � ������� ������� ������������
    
    float x2 = 4.5f;
    float y2 = 3.1f;
    float squareRectangle = x2 * y2;
    System.out.println(squareRectangle);
    
//���������� ������ ���������� ������ ������� ������������
    System.out.println(Math.floor(squareRectangle));
    
//    5) ���� 11 �����, ��� ������ ������� 3� ����� ��� ����� ���� ��������� ���������� ���������� ����� �����.
//    � ������� �������������� �������� ��������� ������� ����� ����� ��������� ������� �������
    
    int apples = 11;
    int children = 3;
    int applesForBaby = (apples / children);
    System.out.println(applesForBaby);
  
//    � ������� �������������� �������� ��������� ������� ����� ��������.
    
    System.out.println(apples % applesForBaby );
    
/*   6) ���� ������������ ���������, �� ������� ������ ��������. ��������� ����� 1 ���� � 43 ����������.
    ������� ���������� ��������� ���� ��������� � �������� �������.
    ������ �� ������ ����� 2,5 ����������.
    � ������� �������������� �������� ��������� � ������� � ������� ������� ������ ������� ������� ����� �������.*/
    
//    2,5 ���������� =0,025 ����� 
    
    double distanceLength = 1.43;
    double lengthJumpFrog = 0.025 ;
    double distanceToJump = distanceLength / 2;       
    int numberFullJumps = (int) (distanceToJump / lengthJumpFrog); 
    System.out.println(numberFullJumps);

    
//    7) ���� 2 ����� ����.������� ���������� ����� ���� ����� 

    int firstOperand = 1999999999;
    int secondOperand = 1999999999;
    long rezult = ((long) firstOperand +  secondOperand) ;
    System.out.println(rezult);
   
	}
}
