public class Ship{
	    ShipPoint[] shipPointArrey;
	    boolean shipIsDeath;
	    private class ShipPoint{
	        int position;
	        boolean pointIsDamage;
	        public boolean GetDamage(){
	            return pointIsDamage;
	        }
	        public void SetDamage(boolean _pointIsDamage){
	            pointIsDamage = _pointIsDamage;
	        }
	        public ShipPoint(int _position){
	            position = _position;
	        }
	        public int GetPosition(){
	            return position;
	        }
	    }
	    
	    public Ship(int _position1){
	        shipPointArrey = new ShipPoint[1];
	        shipPointArrey[0] = new ShipPoint(_position1);
	    }
	    public Ship(int _position1, int _position2){
	        shipPointArrey = new ShipPoint[2];
	        shipPointArrey[0] = new ShipPoint(_position1);
	        shipPointArrey[1] = new ShipPoint(_position2);
	    }
	    public Ship(int _position1, int _position2, int _position3){
	        shipPointArrey = new ShipPoint[3];
	        shipPointArrey[0] = new ShipPoint(_position1);
	        shipPointArrey[1] = new ShipPoint(_position2);
	        shipPointArrey[2] = new ShipPoint(_position3);
	    }
	    public Ship(int _position1, int _position2, int _position3, int _position4){
	        shipPointArrey = new ShipPoint[4];
	        shipPointArrey[0] = new ShipPoint(_position1);
	        shipPointArrey[1] = new ShipPoint(_position2);
	        shipPointArrey[2] = new ShipPoint(_position3);
	        shipPointArrey[3] = new ShipPoint(_position4);
	    }
	    public boolean GetDamage(int _shotPosotion){
	        if(shipIsDeath == true){/*System.out.println("");*/ return false;}
	        for (int i = 0; i < shipPointArrey.length; i++){
	            if (shipPointArrey[i].GetPosition() == _shotPosotion){
	                shipPointArrey[i].SetDamage(true);
	                System.out.println();
	                System.out.print(_shotPosotion +" - Попал");
	                shipIsDeath = ShipIsDeath();
	                if(shipIsDeath){System.out.println(" и убил");}
	                return true;
	            }
	        }
	        return false;
	    }
	    public boolean ShipIsDeath(){
	        for (int i = 0; i < shipPointArrey.length; i++){
	            if (shipPointArrey[i].GetDamage() == false){
                    return false;
	            }
	        }
	        return true;
	    }
	    public int[] GetPositionNearDanageShip(){
	        int[] ShopPosition = new int[shipPointArrey.length];
	        int[] returnShopPosition = new int[shipPointArrey.length*9];
	        int position = 0;
	        int indexAdd = 0;
	        for(int i = 0; i < ShopPosition.length;i++)
	        {
	            for(int j = 0; j < 3;j++)
	            {
	                for(int k = 0; k < 3;k++){
	                    position = (shipPointArrey[i].GetPosition())+(j-1)+(k*10-10);
                        System.out.println("Index: "+(indexAdd)+"Position: "+position);
	                    returnShopPosition[indexAdd] = (shipPointArrey[i].GetPosition());
	                    indexAdd++;
	                }
	            }
	        }
	        return returnShopPosition;
	    }
}	