class Character{
  private int hp;
  private int mp;
  private String name;
  public Character(String name,int hp,int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public void introduce(){
    System.out.println("私は 体力"+hp+"ポイント,魔力"+mp+"ポイント,名前は"+name+"である。");
  }
}
public class rpg_character{
  public static void main(String[] args){
    Character a = new Character("大王",100,200);
    a.introduce();
    Character b = new Character("魔王",300,400);
    b.introduce();
  }
}
