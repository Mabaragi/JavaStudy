package person;

public class Person {
  String name;

  void eat() {
    System.out.println("냠냠");
  }

  // 메서드 오버로딩
  void eat(String tool) {
      System.out.println(tool+ "을 이용해서");
      this.eat()

  }

  void jump() {
    System.out.println("폴짝");
  }

}
