package 강의5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// [1][][] -> 공개여부 저장 [0][][] -> 데이터
		// arr[1][0][0] = 1 -> 0,0 좌표는 공개
		int[][][] arr = new int[2][5][5];
		
		//1~25 순차입력
		for(int i=0;i<arr[0].length;i++)
			for(int j=0;j<arr[0][0].length;j++)
				arr[0][i][j] = i*arr[0][0].length+(j+1);

		//숫자 셔플
		for(int shuffleCnt=0;shuffleCnt<100;shuffleCnt++)
		{
			int randomNumber = (int)(Math.random()*25)+1;
					
			for(int i=0;i<arr[0].length;i++)
				for(int j =0;j<arr[0][0].length;j++)
					if(arr[0][i][j] == randomNumber)//랜덤수와 동일한 숫자를 찾으면
					{
						//0,0 의 숫자와 바꿔서 섞는다.
						int temp = arr[0][i][j];
						arr[0][i][j] = arr[0][0][0];
						arr[0][0][0] = temp;
						break;
					}
		}
		while(true)
		{
			System.out.println("좌표를 입력하여 숫자 15를 찾으시오.:");
			int input = scan.nextInt();
			//해당좌표의 공개여부를 1로 바꾸어 공개로 설정한다.
			arr[1][input%10][input/10] = 1;
			
			
			System.out.println("-------------------------------");
			for(int i=0;i<arr[0].length;i++)
			{
				for(int j =0;j<arr[0][0].length;j++)
				{
					//공개로 설정되어 있으면 숫자를 공개한다
					if(arr[1][i][j] == 1)
						System.out.print(arr[0][i][j] + "\t");
					else//아니면 별표 표시한다.
						System.out.print("*\t");
		
				}
				System.out.println();
			}
			
			System.out.println("-------------------------------");
			
			if(arr[0][input%10][input/10] ==15)
			{
				System.out.println("정답입니다.");
				break;
			}
			
		}

		}
		
		}

	




/*

	실습1_1 : int[] rand = new int[5];
		
			 rand[0] = 30;
			 rand[1] = 50;
			 rand[2] = 60;
			 rand[3] = 90;
			 rand[4] = 10;
		
			 float avg = (rand[0] + rand[1] + rand[2] + rand[3] + rand[4])/rand.length;
		
			 System.out.println(avg);
		 	 }

	실습1_2 : int[] rand = {10,61,48,188,1230,546,214,230,215,15};
		
			 int min =0;
			 int max = 0;
		
			 max = rand[0];
			 min = rand[0];
				 
			 for(int i = 1 ;i<rand.length; i++)
			 {
				if(max<rand[i]) max =rand[i];
			
				if(min>rand[i]) min =rand[i];

			 }
		
			 System.out.println("최대값은 " +max);
			 System.out.println("최소값은 " +min);
		
			}


	실습1_3 : int[] arr = new int[10];
		
			 for(int i = 0; i<arr.length; i++)
			 arr[i] = (int)(Math.random()*10);
		
			 System.out.println("정렬전: " + Arrays.toString(arr));
		
			 for (int i = 0; i < arr.length - 1; i++) {
            	for (int j = 0; j < arr.length - i - 1; j++) {
                	if (arr[j] > arr[j + 1]) {
                    	int temp = arr[j];
                    	arr[j] = arr[j + 1];
                    	arr[j + 1] = temp;
                	}
            	}
            
        	 }
			 System.out.println("정렬후 : "+ Arrays.toString(arr));
		  	 }

		버블정렬 : 첫 번째 for 루프는 정렬의 패스를 나타냅니다. 배열의 길이 arr.length에서 1을 뺀 값까지 반복합니다. 
				 이는 정렬을 위해 비교할 요소의 범위를 줄여나가기 위함입니다. 
				 각 패스마다 최대 하나의 요소가 제 위치에 정렬되기 때문에 전체 패스 수는 arr.length - 1입니다.
				 두 번째 for 루프는 현재 패스에서 인접한 두 요소를 비교하여 필요한 경우 위치를 교환합니다. 
				 j 변수는 현재 요소의 인덱스를 나타내며, 0부터 arr.length - i - 1까지 반복합니다. 
				 arr.length - i - 1은 현재 패스에서 비교해야 하는 요소의 개수를 나타냅니다. 
				 패스가 진행됨에 따라 큰 값은 배열의 끝으로 이동하므로, 매 패스마다 비교할 요소의 개수는 1씩 줄어듭니다.
				 if 문은 현재 요소 arr[j]와 그 다음 요소 arr[j + 1]를 비교하여 만약 
				 arr[j]가 arr[j + 1]보다 크다면 두 요소의 위치를 교환합니다. 
				 이를 통해 더 큰 값은 오른쪽으로 이동하여 점점 정렬되어가는 구조입니다.
				 위의 과정을 모든 패스에 걸쳐 반복하면 배열이 오름차순으로 정렬됩니다.
				 내림차순으로 변경시 비교연산자를 > 에서 < 으로 변경.

	실습2_1 : int[][] score = new int [][] { // 배열선언
			 {30,50,30}
			,{70,20,90}
			,{100,80,70}
			,{90,40,30}
			,{10,40,100}
			 }
			 ;
			 System.out.println("국어 \t영어 \t수학 \t평균");
			 for(int[] student : score) // for each 문으로 배열에 값 지정, 2번째배열에 각 입력한 값을 넘겨주는 작업
			 {						   
			 int sum = 0;
		
			 for(int i : student) // for each 문으로 배열에 값 지정 , 2번째 입력된 값들을 각 학생들에게 넘겨주는 작업
			 {
			 sum += i; // 각 학생들 배열에 잇는 점수를 더해주는 작업
			 System.out.print(i+" \t"); // 각 배열의 점수
		
			 }
		
			 System.out.print(sum/student.length); // 평균
		
		
			 System.out.println();
			 }

	실습2_2 : char [][] encryptGrid = {{'0',')'}
								,{'1','!'}
								,{'2','@'}
								,{'3','#'}
								,{'4','$'}
								,{'5','%'}
								,{'6','^'}
								,{'7','&'}
								,{'8','*'}
								,{'9','('}
								};
			 Scanner scan = new Scanner(System.in);
			 System.out.println("암호화할 숫자를 입력하세요 : ");
			 String input = scan.nextLine();
			 // 사용자로 부터 받은 숫자
			 char[] plainText = input.toCharArray();
			 //암호화된 수치를 저장하기 위한 배열
			 char[] encryptText = new char[plainText.length];
		
			 System.out.print("평문 : " );
			 System.out.println(plainText);
		
			 for(int i =0;i<plainText.length;i++)
			 {
				for(char[] temp :encryptGrid)
			 {
				//같은 문자라면 암호화된걸로 교체 한다.
					if(temp[0] == plainText[i])
					encryptText[i] = temp[1];
			 }
			 }
		
			 System.out.print("암호화 : ");
			 System.out.println(encryptText);
		
		
//			 encryptGrid 배열: 이 배열은 암호화에 사용될 그리드를 정의합니다. 
//			 encryptGrid는 2차원 char 배열로, 각 행은 원본 숫자와 해당 숫자의 암호화된 버전을 나타냅니다. 
//			 예를 들어, '0'은 ')'로 암호화됩니다.
//			 사용자로부터 숫자 입력 받기: Scanner를 사용하여 사용자로부터 숫자를 입력받습니다. 
//			 입력된 값을 input 변수에 저장합니다.
//			 문자열을 문자 배열로 변환: input.toCharArray()를 사용하여 입력된 숫자를 문자 배열로 변환하여 
//			 plainText 배열에 저장합니다. 이 배열은 암호화할 원본 숫자를 저장하는 용도로 사용됩니다.
//			 암호화된 결과를 저장할 배열 생성: plainText.length와 동일한 길이의 encryptText 배열을 생성합니다. 
//			 이 배열은 암호화된 숫자를 저장하는 용도로 사용됩니다.
//			 평문 출력: plainText 배열을 출력하여 사용자로부터 입력받은 원본 숫자를 확인합니다.
//			 암호화 과정: for 루프를 사용하여 plainText 배열의 각 요소에 대해 암호화 작업을 수행합니다. 
//		 	encryptGrid 배열을 순회하면서 해당 숫자와 일치하는 경우, 암호화된 숫자를 encryptText 배열에 저장합니다.
//			 암호화 결과 출력: encryptText 배열을 출력하여 암호화된 숫자를 확인합니다
  
  
  
  	실습2_3 : int[][] arr = new int[5][5];
		
			System.out.println("-----셔플전-----");
			for(int i =0; i<arr.length;i++)
			 {
				for(int j =0; j<arr[0].length;j++)
			 {
				arr[i][j] = i*arr[0].length+(j+1);
				System.out.print(arr[i][j] + "\t");
			 }
				System.out.println();
			
			 }
			 System.out.println("----------");
		
			 //숫자  셔플
			 for(int shuffleCnt=0;shuffleCnt<100;shuffleCnt++)
			 {
				int randomNumber = (int)(Math.random()*25)+1;
			
				for(int i=0;i<arr.length;i++)
				{
					for(int j =0;j<arr[0].length;j++)
					{
						//랜덤수와 동일한 숫자를 찾으면
						if(arr[i][j] == randomNumber)
						{
							//0,0 의 숫자와 바꿔서 섞는다.
							int temp = arr[i][j];
							arr[i][j] = arr[0][0];
							arr[0][0] = temp;
							break;
						}
					}
					
					
				 }
			 }
		
		
			 System.out.println("---셔플후---");
			 for(int i=0;i<arr.length;i++)
			 {
				for(int j =0;j<arr[0].length;j++)
			 {
			
				System.out.print(arr[i][j] + "\t");
			 }
				System.out.println();
			 }
		
			 System.out.println("---------");
  
  
  	실습3_1 : char [][] arr = new char [][] {
										{' ',' ',' ',' ',' '},
										{' ',' ',' ',' ',' '},
										{' ',' ',' ',' ',' '},
										{' ',' ',' ',' ',' '},
										{' ',' ',' ',' ',' '}
										};
			 Scanner scan = new Scanner(System.in);
		
			 System.out.println("좌표를 입력하세요 : ");
			 int pos = scan.nextInt();
		
			 //입력한 좌표에 x 저장
			 arr[(pos/10)-1][(pos%10)-1] = 'X';
																				
			 System.out.println(" 12345");
				
			 for(int y=0;y<arr.length;y++)
			 {
				 System.out.print(y+1);
				 for(int x=0;x<arr.length;x++)
				 {
					 System.out.print(arr[y][x]);
						
				 }
				 System.out.println();
			 }
			 }
		
			 }
			 1. arr 배열: arr은 2차원 char 배열로 정의되어 있습니다. 배열의 각 요소는 'X'로 초기화되어 있습니다.
			 2. arr[(pos/10)-1][(pos%10)-1] = 'X';: 위의 코드는 pos 변수를 
			 사용하여 배열의 특정 위치에 'X'를 할당하는 역할을 합니다. pos 변수는 1부터 50까지의 값을 가지며, 
			 이 값에 따라 배열의 특정 위치에 'X'를 할당합니다. 위치 계산을 위해 pos를 10으로 나눈 몫에 1을 빼고, 
			 pos를 10으로 나눈 나머지에 1을 뺀 값을 사용합니다.
			 3. System.out.println(" 12345");: 숫자 1부터 5까지의 헤더를 출력합니다.
			 4. 배열 출력: 중첩된 for 루프를 사용하여 배열 arr을 출력합니다. 외부 루프는 행을, 내부 루프는 열을 반복합니다. 
			 각 행과 열에 해당하는 요소를 출력합니다.
  
  
	실습3_2 : char [][] star =  {
							{'*','*',' ',' ',' '},
							{'*','*',' ',' ',' '},
							{'*','*','*','*','*'},
							{'*','*',' ',' ',' '},
							{'*','*',' ',' ',' '},
							};
			 char [][] result = new char[star[0].length][star.length];
			 for(int i =0; i < star.length; i++)
			 {
				for(int j =0;j<star[i].length;j++)
					System.out.print(star[i][j]);
			
				System.out.println();
			 }
			 System.out.println();
		
			 for(int i=0; i<star.length;i++)
			 {
				for(int j=0;j<star[i].length;j++)
			 {
				int x=j;
				int y = star.length-1-i;
				
				result[x][y]=star[i][j];
			 }
			
			 }
		
		
			 for(int i =0; i <result.length;i++)
			 {
				for(int j=0;j<result[i].length;j++)
				{
					System.out.print(result[i][j]);
				}
				System.out.println();
			 }
		
			 1. star 배열: star은 2차원 char 배열로 정의되어 있습니다. 각 요소는 공백과 별표로 구성되어 있으며, 
				  별표를 특정 패턴으로 배치한 형태입니다.
			 2. 배열 출력: 첫 번째 for 루프를 사용하여 star 배열을 출력합니다. 각 행에 해당하는 요소를 반복하여 출력하고, 
					행의 끝에 도달하면 개행합니다. 이를 통해 초기의 star 배열의 형태를 확인할 수 있습니다.
			 3. result 배열 생성: result 배열은 star 배열의 열과 행을 뒤바꾼 형태로 생성됩니다. 
						   새로운 배열 result의 크기는 star[0].length (열의 개수)와 
						   star.length (행의 개수)로 설정됩니다.
			 4. 배열 회전: 두 번째 for 루프를 사용하여 star 배열의 요소를 회전시켜 result 배열에 저장합니다. 
					현재 요소의 인덱스를 기반으로 x와 y 변수를 계산하여 result[x][y]에 현재 요소의 값을 
					할당합니다. x는 현재 열 인덱스(j)를 그대로 사용하고, y는 star.length-1-i로 계산됩니다. 
					이렇게 함으로써 star 배열의 요소를 90도 시계 방향으로 회전시키는 효과를 얻습니다.
			 5. 결과 출력: 세 번째 for 루프를 사용하여 result 배열을 출력합니다. 각 행에 해당하는 요소를 반복하여 출력하고,
				    행의 끝에 도달하면 개행합니다. 이를 통해 result 배열에 회전된 형태의 결과를 확인할 수 있습니다.
			 }

	실습3_3 : Scanner scan = new Scanner(System.in);
			// [1][][] -> 공개여부 저장 [0][][] -> 데이터
			// arr[1][0][0] = 1 -> 0,0 좌표는 공개
			int[][][] arr = new int[2][5][5];
		
			//1~25 순차입력
			for(int i=0;i<arr[0].length;i++)
				for(int j=0;j<arr[0][0].length;j++)
					arr[0][i][j] = i*arr[0][0].length+(j+1);

			//숫자 셔플
			for(int shuffleCnt=0;shuffleCnt<100;shuffleCnt++)
			{
				int randomNumber = (int)(Math.random()*25)+1;
					
				for(int i=0;i<arr[0].length;i++)
					for(int j =0;j<arr[0][0].length;j++)
						if(arr[0][i][j] == randomNumber)//랜덤수와 동일한 숫자를 찾으면
						{
							//0,0 의 숫자와 바꿔서 섞는다.
							int temp = arr[0][i][j];
							arr[0][i][j] = arr[0][0][0];
							arr[0][0][0] = temp;
							break;
						}
			}
			while(true)
			{
				System.out.println("좌표를 입력하여 숫자 15를 찾으시오.:");
				int input = scan.nextInt();
				//해당좌표의 공개여부를 1로 바꾸어 공개로 설정한다.
				arr[1][input%10][input/10] = 1;
			
			
				System.out.println("-------------------------------");
				for(int i=0;i<arr[0].length;i++)
				{
					for(int j =0;j<arr[0][0].length;j++)
					{
						//공개로 설정되어 있으면 숫자를 공개한다
						if(arr[1][i][j] == 1)
							System.out.print(arr[0][i][j] + "\t");
						else//아니면 별표 표시한다.
							System.out.print("*\t");
		
					}
					System.out.println();
				}
			
				System.out.println("-------------------------------");
			
				if(arr[0][input%10][input/10] ==15)
				{
					System.out.println("정답입니다.");
					break;
				}	
			
			}
			1. arr 배열: arr은 3차원 int 배열로 정의되어 있습니다. 배열은 2개의 슬롯으로 구성되어 있습니다. 
					첫 번째 슬롯 arr[0]은 실제 숫자 데이터를 저장하는 용도로 사용되고, 
					두 번째 슬롯 arr[1]은 각 좌표의 공개 여부를 저장하는 용도로 사용됩니다. 
					배열의 크기는 2 × 5 × 5로 설정되어 있습니다.
			2. 숫자 입력 및 셔플: arr[0] 슬롯에 1부터 25까지의 숫자를 순차적으로 입력합니다. 
						  그 후, shuffleCnt 변수를 사용하여 숫자를 섞습니다. randomNumber 변수에 
						  랜덤한 숫자를 생성한 후, 해당 숫자와 일치하는 위치의 숫자를 arr[0] 슬롯의 0,0 좌표와 
						  교환하여 섞습니다.
			3. 사용자 입력 및 게임 진행: 사용자로부터 좌표를 입력받아 숫자를 공개하고, 게임을 진행합니다. 
							   입력된 좌표의 공개 여부를 arr[1] 슬롯에서 1로 설정하여 공개 상태로 변경합니다.
			4. 배열 출력: 중첩된 for 루프를 사용하여 arr 배열을 출력합니다. 각 요소에 대해 조건문을 사용하여 공개 여부를 
					확인하고, 공개 상태인 경우 해당 위치의 숫자를 출력하고, 비공개 상태인 경우 별표를 출력합니다.
			5. 정답 확인: 입력된 좌표의 숫자가 15인지 확인합니다. 정답이 맞으면 게임을 종료하고 "정답입니다."를 출력합니다


*/