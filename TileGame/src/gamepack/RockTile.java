package gamepack;

public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.stone, id);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isSolid() {
		return true;
	}

}
