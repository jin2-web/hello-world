import java.util.Scanner;

public class CalculatorEx {
	static boolean flag; //�ݺ��� ó���� ���� 
	int sign;//�������� �����ڱ�ȣ ��ȣ 1) ���� ... 
	int[] number;//������ ���� ����� �迭  
	int numberCount;//�Է��� ���� ����
	
	public static void main(String[] args) {
		//���������� ��� ���α׷� �����ϴ� �κ�
      CalculatorEx cal = new CalculatorEx();
      //�ݺ��� ���� �� 1,2,3�̸� �� 4�̸� ����
      System.out.println(cal.toString() + " �������� ");
      
      flag = true;
      while(flag) {
      int menuNumber = cal.MenuScrenn();
     // System.out.println(menuNumber+"�޸� ��ȣ �ӽ� ����ϴ� ��");
      //menuNumber�� 1�̸� numberInput()ȣ�� 2�̸� operationInput()
      //3�̸� calcuResult() 4�̸� exit()
      if(menuNumber == 1) {
    	  cal.numberInput();
      }else if(menuNumber == 2) {
    	  cal.operationInput();
      }else if(menuNumber == 3) {
    	  cal.calcuResult();
      }else if(menuNumber == 4 ) {
    	  cal.exit();
      }else {
    	  System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�.");
       } //end if 
      }//end while  
	}//end main
	
    //ù��° ȭ�� ������ �޼ҵ�
	public int MenuScrenn() {
		System.out.println("====== ���� ������Ʈ ======");
		System.out.println("������ : �����̸� ");
		System.out.println("������ : 2022.04.01");
		System.out.println("���α׷��� : Cal.Ver.1.0");
		System.out.println("==========================");
		System.out.println("1. ����� ������ ����");
		System.out.println("2. ������ ����");
		System.out.println("   1) ���� 2)���� 3) ���� 4) ������ ");
		System.out.println("3. ���� ��");
		System.out.println("4. ���α׷� �����ϱ� ");
		System.out.println("----------------------------");
		System.out.print("��ȣ�� ������?----->");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		return choice ;
	}
	//1���� ������ ������ ȭ�� ����� ���ڸ� �Է��ϼ���
	public void numberInput() {
		System.out.println("����� ������ ������ �Է��ϼ���?--->");
		Scanner scanner = new Scanner(System.in);//Ű����� �Է¹޴� Ŭ����
		numberCount = scanner.nextInt(); //�� 3�� �Է��� 
		int i=0;
		number = new int[5];//�迭 
		
		while(i < numberCount ) { // 0 < 3 ��  1<3 �� 2 < 3 �� 3 < 3 ����
			//���̸� �̰��� �����Ѵ�. 
			System.out.println("���ڴ�? ");
			number[i] = scanner.nextInt(); //10 20 30
			i=i+1; //1 2 i++
		}
		/* while(���ǹ�) {
		    ���̸� �����ϴ� �κ�
	    }  �����̸� �ݺ����� �ʰ� �ݺ����� �ڷ� �� */
		
	}
	//2���� ������ ������ ȭ�� ���������� ���� ȭ��
	public void operationInput() {
		System.out.println("---- ������ ������ ������ ------");
	    System.out.println("1) ����  2) ����  3) ���� 4) ������ ");
	    System.out.println("������ ������ ------>");
	    Scanner scanner = new Scanner(System.in);
	    sign = scanner.nextInt();
	    //���� sign �������� �ڷ�� ���� �Լ��ӿ����� �־�� �ұ�? �ƴ�
	    // �ƴϸ� �ٸ� �Լ������� ����ؾ��ұ�? ��
	    // �ذ�����? 1) ���������� ����Ѵ�.- ��� 2) �Լ����� ���� �ְ� �޴´�. 
	    
	}
	//3���� ������ ������ ȭ�� ���� ����� ������ ȭ��
	public void calcuResult() {
		// 10 + 20 + 30 +   1  number[0] + number[1] + number[2] 
		// 10 - 20  2      number[0] - number[1]
		// 10 20  3     number[0] * number[1] 
		// 10 20 4      number[0] / number[1]  10/4 = 2.5
		
		System.out.println("-----���� ���------");
		//�ݺ��� �ȿ� + - * / �Ǵ�
		//�ݺ����� ������ numberCount �����ȿ� ��� �ִ� ���ڿ� ����.
		int result=0;//����� ���� ���� ���� 
		double divResult = 0.0;//�������� ����� ���� ���� 
		
		for(int i=0; i < numberCount; i++) {  // 0<3 i++ i = i+1  1
			 // 1<3 ��  2<3 ��  3<3 ����
			//���̸� ������ 
			
			if(sign == 1) {
				System.out.print(number[i] + " "); // 10 + 20 + 30
				if(i+1 != numberCount) { // 0+1  != 3 1+1 != 3 2+1 != 3
				   System.out.print(" + ");
				}
				result = result + number[i];// 0+10+20+30
				
			}else if(sign == 2){
				
				if(i==0) {
					result = number[i];//10
				}else {
					result = result - number[i];
				}
				
				System.out.print(number[i] + " "); // 10 - 20 
				if(i+1 != numberCount) { 
					   System.out.print(" - ");
				}
				
			}else if(sign == 3) { // ex) 10 * 20 * 30 = 6000 or 10 * 20 = 200
			
				if(i==0) {
					result = number[i];
				}else {
					result = result * number[i];
				}
				System.out.print(number[i] + " ");
				if(i+1 != numberCount) { 
					   System.out.print(" * ");
				}
			}else if(sign == 4) { // ex) 10 / 20 / 30 
				
				if(i==0) {
					divResult = number[i];
				}else {
					divResult = divResult / number[i];
				}
				 System.out.print(number[i] + " ");
				 if(i+1 != numberCount) { 
					   System.out.print(" / ");
				}
			}
		}// end for
		
		//for�ݺ��� ���� 
		/*  for(�ʱⰪ ; ���ǽ� ; ������ ) {
		 *     ���ǽ��� ���̸� ������ ���� 
		 *  }
		 * ó������ �ʱⰪ ���� -> ���ǽ� ������ ���̸� ���๮�� ���� --> ������
                            -> 
		 */ 
		if(sign == 4) {
		  System.out.printf("%s %.2f", " = ", divResult);
		  System.out.println();
		}else {
			System.out.println( " = " + result );
		}
		 
	}
	//4���� ������ ������ ȭ�� 
	public void exit() {
		System.out.println("���� ���α׷��� �����մϴ�");
		System.out.println("�����մϴ�");
		flag = false;
	}
}
