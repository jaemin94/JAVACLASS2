package 강의6;

public class HanoiTower {

	void resolve(int n, char from ,char tmp, char to)
	{
		if(n==1) 
			System.out.println("원판 1을 "+from + "에서 " + to +"으로 옮긴다.");
		else
		{
			resolve(n-1,from,to,tmp);
			System.out.println("원판 "+n+"를 "+from+"에서 "+to+"으로 옮긴다.");
			resolve(n-1,tmp,from,to);
		}
			
			
		
	}
	
	
}


//1. 함수 설명: resolve 함수는 하노이 탑 문제를 해결하기 위한 함수입니다. 하노이 탑 문제는 크기가 
//			다른 원반들이 세 개의 기둥 사이에서 옮겨지는 문제로, 재귀적인 방식으로 해결할 수 있습니다.
//2. 종료 조건: 재귀 함수의 종료 조건은 n 값이 1인 경우입니다. 이는 원판이 하나인 경우로, 이 경우에는 
//			원판을 직접 기둥에서 다른 기둥으로 옮기면 됩니다. 따라서 해당 경우에는 출력문을 사용하여 
//			원판 1을 from에서 to로 옮긴다는 메시지를 출력합니다.
//3. 재귀 호출: n 값이 1보다 큰 경우에는 재귀 호출을 수행합니다. n-1 크기의 하위 원판들을 from에서 to를 
//			거쳐 tmp로 옮기기 위해 resolve(n-1, from, to, tmp)을 호출합니다. 이를 통해 하위 원판들이 임시 
//			기둥 tmp로 이동합니다.
//4. 원판 이동: n 크기의 원판을 from에서 to로 옮깁니다. 이를 나타내기 위해 출력문을 
//			사용하여 "원판 n를 from에서 to로 옮긴다." 메시지를 출력합니다.
//5. 하위 원판 복귀: 하위 원판들이 임시 기둥 tmp로 옮겨진 상태이므로, 이제 이들을 tmp에서 from을 
//				거쳐 to로 옮겨야 합니다. 따라서 resolve(n-1, tmp, from, to)을 호출하여 하위 원판들을 복귀시킵니다.