class Ossan{
  public int age;
  public String name;
  public Ossan(){
    this.name = "おっさん";
    this.age = 50;
  }
  public Ossan(String name,int age){
    this.name = name;
    this.age = age;
  }
  public void dash(){
    System.out.println("おっさんが走った");
  }
  public void speak(){
    System.out.println("私は"+age+"歳の"+name+"というおっさんだ");
  }
}
public class test{
  public static void main(String[] args){
    Ossan a = new Ossan("太郎",54);
    a.dash();
    a.speak();
    a.age = 20;
    a.name = "ジョニー";
    a.dash();
    a.speak();
    Ossan b = new Ossan();
    b.dash();
    b.speak();
  }
}
