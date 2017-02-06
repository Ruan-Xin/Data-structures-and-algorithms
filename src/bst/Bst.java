package bst;

public class Bst {
	bst_node root;
	int count;//½ÚµãÊý
	public Bst(bst_node root) {
		// TODO Auto-generated constructor stub
		this.root = root;
		count = 1;
	}
	
	public void insert_bst(int val) {
//		if (root == null) {
//			//System.out.println(val);
//			root = new bst_node(val);
//			return;
//		}
//		if (root.data < val) {
//			insert_bst(root.right, val);
//		}else if (root.data > val) {
//			insert_bst(root.left, val);
//		}else {
//			return;
//		}
		bst_node location = root;
		while(location != null){
			if (location.data < val) {
				location = location.right;
			}else if (location.data > val) {
				location = location.left;
			}else {
				return;
			}
		}
		location = new bst_node(val);
		count++;
	}
	
	public boolean search_bst(bst_node root, int val) {
		while(root != null){
			if (root.data > val) {
				root = root.left;
			}else if (root.data < val) {
				root = root.right;
			}else {
				return true;
			}
		}
		return false;
	}
	public void	travel_bst(bst_node root){
		System.out.println(count);
		if (root == null) {
			return;
		}
		travel_bst(root.left);
		System.out.println(root.data);
		travel_bst(root.right);
	}
	public void remove_bst(bst_node root) {
		
	}
}
