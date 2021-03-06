package gamepack;

import java.awt.Graphics;

public class GameState extends State {
	
	private Player player;
	private World world;
	
	public GameState(Game game) {
		super(game);
		player = new Player(game, 100, 100);
		world = new World("res/worlds/world1.txt");
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		world.render(g);
		player.render(g);
	}

}
