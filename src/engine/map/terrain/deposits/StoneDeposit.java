package engine.map.terrain.deposits;

import engine.entities.buildings.mines.ResourceType;

public class StoneDeposit extends Deposit {

	public StoneDeposit(String id) {
		super(id);
		this.resourceType = ResourceType.STONE;
		
	}

	@Override
	public ResourceType getType() {
		return this.resourceType;
	}


}
