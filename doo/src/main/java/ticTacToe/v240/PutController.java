package ticTacToe.v240;

public class PutController extends ColocateController {

	public PutController(Game game) {
		super(game, "Pone");
	}

	@Override
	protected void colocate() {
		this.put("En");
	}

}
