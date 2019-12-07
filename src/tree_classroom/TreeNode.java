package tree_classroom;

public class TreeNode {
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	int data;
	public TreeNode leftChild;
	public TreeNode rightChild;
	
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		this.data= data;
		this.leftChild=null;
		this.rightChild=null;
		
	}

}
