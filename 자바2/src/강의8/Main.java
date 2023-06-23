package 강의8;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key = "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";
		ChatGpt gpt = new ChatGpt(key);
		Scanner scanner = new Scanner(System.in);

		try {
			while (true) {
			gpt.connect();
			
				System.out.print("나: ");
				String message = scanner.nextLine();
				if (message.equals("대화종료")) {
					break;
				}
				gpt.send(message);

				String response = gpt.receive();
				ChatGpt.endword.add(gpt.parseJsonMsg(message));
				// 대화종료조건확인

				// 응답을 출력한다.
				System.out.println("AI: " + response);
				
				gpt.connect().disconnect();

			}
			
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
