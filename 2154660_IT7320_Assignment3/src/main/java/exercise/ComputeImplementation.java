package exercise;

public class ComputeImplementation implements ICompute {
	
	ICompute obj;

	public int multiply(int x, int y) {
		return obj.multiply(x,y);
	}

	public int squareVar(int x) {
		return obj.squareVar(x);
	}

	public void setObj(ICompute obj) {
		this.obj = obj;
	}

}
