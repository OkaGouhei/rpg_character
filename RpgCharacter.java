import java.util.Random;
class RpgCharacter{
  public static void main(String[] args){
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
    Random r = new Random();
    while(true){
      for (int i=0; i<4;i++){
        int num_daiou = r.nextInt(4);
        int num_maou = r.nextInt(4);
        party_maou[i].attack(party_daiou[num_daiou]);
        int count_daiou = 0;
        for(int j =0 ;j < 4;j++ ){
            if(party_daiou[j].hp <= 0){
                count_daiou ++;
            }
        }
        if (count_daiou == 4){
          System.out.println("大王は全滅した。");
          System.exit(0);
        }
        party_daiou[num_daiou].introduce();
        party_daiou[i].attack(party_maou[num_maou]);
        int count_maou = 0;
        for(int k =0 ;k < 4;k++ ){
            if(party_maou[k].hp <= 0){
                count_maou ++;
            }
        }
        if (count_maou == 4){
          System.out.println("魔王は全滅した。");
          System.exit(0);
        }
        party_maou[num_maou].introduce();
      }
    }
  }
}
