package 강의7;

import org.json.JSONArray;
import org.json.JSONObject;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "{id:chatcmpl-6vX5cfe1VRa29F7AzS8kBmYjbh4Im,object:chat.completion,created:1679169912,model:gpt-3.5-turbo-0301,usage:{prompt_tokens:11,completion_tokens:32,total_tokens:43},choices:[{message:{role:assistant,content:하세요! 저는 AI 어시스턴트입니다. 어떤 도움이 필요하신가요?},finish_reason:stop,index:0}]}";
		
		JSONObject json = new JSONObject(data);

		JSONArray choices = json.getJSONArray("choices");
		JSONObject firstChoice = choices.getJSONObject(0);
		JSONObject message = firstChoice.getJSONObject("message");

        String content = message.getString("content");
        System.out.println(content);
	}

}

/*
public class Main {

public static void 실습1_1(String[] args) {
	// TODO Auto-generated method stub

	try {

	File file = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\test.txt");

	InputStream stream = new FileInputStream(file);

	int data =0;
	while((data=stream.read()) != -1)
	{
		System.out.print((char)data);
	}

	stream.close();
	}catch(Exception ex)
	{
		System.out.println(ex.toString());
	}
}

}

public static void 실습1_2(String[] args) {
		// TODO Auto-generated method stub

		try {

		File originalFile = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\test.txt");
		File copyFile = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\test_copy.txt");

		InputStream stream = new FileInputStream(originalFile);
		OutputStream outStream = new FileOutputStream(copyFile);

		int data =0;

		while((data=stream.read()) != -1
		{
			outstream.write(data);
		}
		stream.close();
		outStream.close();

		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}

}

public static void 실습1_3(String[] args) {
		// TODO Auto-generated method stub
		  try {

			File originalFile = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\레서판다.jpg");
			File copyFile = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\레서판다_copy.jpg");

			InputStream stream = new FileInputStream(originalFile);
			OutputStream outStream = new FileOutputStream(copyFile);

			int data =0;

			while((data=stream.read()) != -1)//복사하는 기능
			{
				outStream.write(data);
			}
			stream.close();
			outStream.close();

			}catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
	}

}

public static void 실습1_4.1(String[] args) {
		// TODO Auto-generated method stub
		try {

			File file = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\test.txt");

			InputStream stream = new FileInputStream(file);
			BufferedInputStream bStream = new BufferedInputStream(stream);

			int data =0;
			while((data=bStream.read()) != -1)
			{
				System.out.print((char)data);
			}

			bStream.close();
			}catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
	}
	public static void 실습1_4.2(String[] args) {
		// TODO Auto-generated method stub
		try {

			File file = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의7\\test_copy.jpg");

			OutputStream stream = new FileOutputStream(file,true);
			BufferedOutputStream bStream = new BufferedOutputStream(stream);

			bStream.write("testing outputstream2".getBytes());
			bStream.close();
			}catch(Exception ex)
			{
				System.out.println(ex.toString());
			}
	}

}

public static void 실습2_1(String[] args) {
		// TODO Auto-generated method stub
		String data = "{이름:홍길동, 나이:55, 성별:남, 주소:서울특별시 양천구 목동, 특기:[검술,코딩], 가족관계:{\"#\":2, 아버지:홍판서, 어머니:춘섭},회사:경기 수원시 팔달구 우만동}";
		JSONObject json = new JSONObject(data);

		JSONArray hobby = json.getJSONArray("특기");

		String temp = hobby.get(1).toString();
		System.out.println(temp);
	}

}


*/