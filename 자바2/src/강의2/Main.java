package 강의2;

class People {
    private String name;
    private int age;
    private String juminNumber;
    private String gender;

    People(String name, int age, String juminNumber, String gender) {
        this.name = name;
        this.age = age;
        this.juminNumber = juminNumber;
        this.gender = gender;
    }

   String getName() {
        return name;
    }

   void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

   void setAge(int age) {
        this.age = age;
    }

   String getJuminNumber() {
        return juminNumber;
    }

   void setJuminNumber(String juminNumber) {
        this.juminNumber = juminNumber;
    }

    String getGender() {
        return gender;
    }

   void setGender(String gender) {
        this.gender = gender;
    }
   
   public String toString() {
       return "이름 : " + name + " 나이: " + age + " 주민번호: " + juminNumber + " 성별: " + gender;
   }
}

public class Main {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	People[] peopleArray = {
            new People("홍길동1", 25, "000825-3456789", "남자"),
            new People("홍길동2", 30, "950825-1456789", "남자"),
            new People("홍길동3", 25, "000825-4456789", "여자"),
            new People("홍길동4", 25, "000825-2456789", "여자"),
            new People("홍길동5", 25, "000825-2456789", "여자")
    };

    for (People person : peopleArray) {
        System.out.println(person.toString());
    }
}
}


/*
class Phone {
protected String phoneNumber;

Phone(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

void makeCall(String number) {
    System.out.println("Calling " + number + "...");
}
}

class Galaxy extends Phone {
public Galaxy(String phoneNumber) {
    super(phoneNumber);
}
}

class IPhone extends Phone {
public IPhone(String phoneNumber) {
    super(phoneNumber);
}
}

/*Phone 클래스는 객체화 될 필요가 있습니다. 
 * Phone 클래스는 Galaxy와 IPhone 클래스에서 공통으로 사용되는 phoneNumber 
 * 멤버 변수를 가지기 때문에, 객체화하여 상속을 받은 클래스에서 해당 변수를 사용할 수 있습니다.
 

public class 실습1_1 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}



class People {
    private String name;
    private int age;
    private String juminNumber;
    private String gender;

    People(String name, int age, String juminNumber, String gender) {
        this.name = name;
        this.age = age;
        this.juminNumber = juminNumber;
        this.gender = gender;
    }

   String getName() {
        return name;
    }

   void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

   void setAge(int age) {
        this.age = age;
    }

   String getJuminNumber() {
        return juminNumber;
    }

   void setJuminNumber(String juminNumber) {
        this.juminNumber = juminNumber;
    }

    String getGender() {
        return gender;
    }

   void setGender(String gender) {
        this.gender = gender;
    }
}

public class 실습1_2 {

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
}
name, age, juminNumber, gender 멤버 변수에는 private 접근 제어자를 
사용하여 클래스 내부에서만 접근할 수 있도록 제한합니다.
각 변수에 대한 getter와 setter 메소드를 추가하여 외부에서도 각 변수에 접근할 수 있도록 합니다.
이때, getter 메소드는 해당 변수의 값을 반환하며, setter 메소드는 해당 변수의 값을 변경합니다.

class People {
    private String name;
    private int age;
    private String juminNumber;
    private String gender;

    People(String name, int age, String juminNumber, String gender) {
        this.name = name;
        this.age = age;
        this.juminNumber = juminNumber;
        this.gender = gender;
    }

   String getName() {
        return name;
    }

   void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

   void setAge(int age) {
        this.age = age;
    }

   String getJuminNumber() {
        return juminNumber;
    }

   void setJuminNumber(String juminNumber) {
        this.juminNumber = juminNumber;
    }

    String getGender() {
        return gender;
    }

   void setGender(String gender) {
        this.gender = gender;
    }
   
   public String toString() {
       return "이름 : " + name + " 나이: " + age + " 주민번호: " + juminNumber + " 성별: " + gender;
   }
}

public class Main {

public static void 실습1_3(String[] args) {
	// TODO Auto-generated method stub

	
	People[] peopleArray = {
            new People("홍길동1", 25, "000825-3456789", "남자"),
            new People("홍길동2", 30, "950825-1456789", "남자"),
            new People("홍길동3", 25, "000825-4456789", "여자"),
            new People("홍길동4", 25, "000825-2456789", "여자"),
            new People("홍길동5", 25, "000825-2456789", "여자")
    };

    for (People person : peopleArray) {
        System.out.println(person.toString());
    }
}
}


*/