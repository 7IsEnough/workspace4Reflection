package Promise;

@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface {

  public int id;
  int age;
  private String name;

  public Person() {
  }

  @MyAnnotation(value = "abc")
  private Person(String name) {
    this.name = name;
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @MyAnnotation
  private String show(String nation) {
    System.out.println("我的国籍是：" + nation);
    return nation;
  }

  public String display(String interests,int age) throws NullPointerException,ClassCastException  {
    return interests;
  }

  @Override
  public void info() {
    System.out.println("我是一个人");
  }

  @Override
  public int compareTo(String o) {
    return 0;
  }

  private static void showDesc(){
    System.out.println("Uzi");
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}
