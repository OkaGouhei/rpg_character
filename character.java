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
