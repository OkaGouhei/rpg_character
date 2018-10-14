class Character{
  public int get_hp(){
    return hp;
  }
  private int hp;
  private int mp;
  private String name;
  public Character(String name,int hp,int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }
  public void introduce(){
    if(hp<=0){
    System.out.println("返事がない、ただのしかばねのようだ。");
    }else{
    System.out.println("私は"+name+"。 体力"+hp+"ポイント,魔力"+mp+"ポイントである。");
    }
  }
  private void damage(int power){
    hp -= power;
    System.out.println(name+"は"+power+"ポイントのダメージを受けた");
    if(hp<=0)System.out.println(name+"は生き絶えた");
  }
  public void attack(Character target){
    System.out.println(name+"の攻撃!");
    target.damage(mp/10);
  }
}
