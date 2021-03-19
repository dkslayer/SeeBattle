import java.util.ArrayList;
public class Shooter{
    Ship[] shipArrey;
    BattleField battleFild;
    ArrayList<Integer> misShotPosition = new ArrayList<>();
    ArrayList<Integer> damageShopPosition = new ArrayList<>();
    
    public Shooter(Ship[] _shipArrey){
        shipArrey = _shipArrey;
        battleFild = new BattleField();
    }
    public boolean MakeShoot(int _shootPosition){
        for(int i = 0; i < shipArrey.length;i++){
            if(shipArrey[i].GetDamage(_shootPosition)){
                damageShopPosition.add(_shootPosition);
                if(shipArrey[i].ShipIsDeath()){
                    battleFild.AddDamageSector(shipArrey[i].GetPositionNearDanageShip());
                    System.out.println("возвращаю масив клеток возле коробля");
                }
                battleFild.PrintBattleFild();
                return true;
            }
        }
        misShotPosition.add(_shootPosition);
        battleFild.AddDamageSector(_shootPosition);
        System.out.println(_shootPosition+" - промах");
        battleFild.PrintBattleFild();
        return false;
    }
}