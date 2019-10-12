package tp.p1.lists;

import tp.p1.ships.DestroyerShip;


public class DestroyerShipList {
	private DestroyerShip [] list;
	private int TAM_MAX = 72;
	
	public DestroyerShipList() {
		list=new DestroyerShip[TAM_MAX];
	}
	
	//Método para añadir DestroyerShips a la lista ---------------------------------------------------------------------------------------------
	public boolean Add(DestroyerShip destroyerShip) {
		if(list.length<TAM_MAX) {
			list[list.length]=destroyerShip;
		}
		return list.length<TAM_MAX;
	}
	
	//Método para borrar DestroyerShips a la lista ----------------------------------------------------------------------------------------------
	public void Delete(int pos) {
		for(int i=pos;i<list.length;i++) {
			list[i]=list[i+1];
		}
	}
	
	//Método para encontrar un destroyer ship en la lista ---------------------------------------------------------------------------------------------
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
