package ticTacToe.v260;

public class MoveView implements OperationView {

	private MoveController moveController;
	
	public MoveView(OperationController controller) {
		moveController = (MoveController) controller;
	}

	@Override
	public void interact() {
		moveController.control();
		
	}

}
