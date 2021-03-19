public class BattleField{
    int[] battleFild;
    public BattleField(){
        battleFild = new int[100];
        for(int i = 0; i<battleFild.length;i++){battleFild[i] = 0;}
    }
    public void PrintBattleFild(){
        for(int i = 0; i<battleFild.length;i++){
            if(i%10 == 0){
                System.out.println();
            }
            if(battleFild[i] == 0){System.out.print("0 ");}else{System.out.print("* ");}
        }
    }
    public void AddDamageSector(int[] _arrDamage){
        for(int i = 0; i < _arrDamage.length;i++){
            System.out.println("что пришло "+_arrDamage[i]);
            battleFild[_arrDamage[i]] = 1;
        }
    }
    public void AddDamageSector(int _asd){}
}