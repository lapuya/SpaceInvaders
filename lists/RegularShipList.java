package tp.p1.lists;

import tp.p1.ships.RegularShip;

public class RegularShipList {
	private RegularShip [] list;
	private int TAM_MAX = 72;
	
	public RegularShipList() {
		list=new RegularShip[TAM_MAX];
	}
	
	//Método para añadir RegularShips a la lista ---------------------------------------------------------------------------------------------
	public boolean Add(RegularShip regularShip) {
		if(list.length<TAM_MAX) {
			list[list.length]=regularShip;
		}
		return list.length<TAM_MAX;
	}
	
	//Método para borrar RegularShips a la lista ----------------------------------------------------------------------------------------------
	public void Delete(int pos) {
		for(int i=pos;i<list.length;i++) {
			list[i]=list[i+1];
		}
	}
	
	//Método para encontrar un regular ship en la lista ---------------------------------------------------------------------------------------------
	public int searchPosition(int x,int y) {
		int i=0;
		boolean encontrado=false;
		while(i<list.length&&!encontrado) {
			if((list[i].getX()==x)&&(list[i].getY()==y)) {
				encontrado=true;
			}
			else {
			i++;	
			}
		}
		return i;
	}
}
