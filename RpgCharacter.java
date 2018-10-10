    import java.util.Random;
class RpgCharacter{
  public static void main(String[] args){
    // Character a = new Character("大王",100,200);
    // a.introduce();
    // Character b = new Character("魔王",300,400);
    // b.introduce();
    Character[] party_daiou = new Character[4];
    party_daiou[0] = new Character("大王",80,20);
    party_daiou[1] = new Character("大大王",50,40);
    party_daiou[2] = new Character("中大王",60,30);
    party_daiou[3] = new Character("小大王",80,20);
    Character[] party_maou = new Character[4];
    party_maou[0] = new Character("魔王王",80,20);
    party_maou[1] = new Character("大魔王",50,40);
    party_maou[2] = new Character("中魔王",60,30);
    party_maou[3] = new Character("小魔王",80,20);
    // party_maou[1].attack(party_daiou[1]);
    // party_daiou[1].introduce();
    Random r = new Random();
    while(true){
      for (int i=0; i<4;i++){
        int num_daiou = r.nextInt(4);
        int num_maou = r.nextInt(4);
        party_maou[i].attack(party_daiou[num_daiou]);
        if (party_daiou[0].hp<=0 && party_daiou[1].hp<=0 &&party_daiou[2].hp <=0 &&party_daiou[3].hp <=0){
          System.out.println("大王は全滅した。");
          System.exit(0);
        }
        party_daiou[num_daiou].introduce();
        party_daiou[i].attack(party_maou[num_maou]);
        party_maou[num_maou].introduce();
        if (party_maou[0].hp<=0 && party_maou[1].hp<=0 &&party_maou[2].hp <=0 &&party_maou[3].hp <=0){
          System.out.println("は全滅した。");
          System.exit(0);
        }
      }
    }
    // a.attack(b);
    // b.introduce();
  }
}
