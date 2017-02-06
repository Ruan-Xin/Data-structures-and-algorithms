package bst;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bst_node node = new bst_node(10);
		Bst bst = new Bst(node);
		bst.insert_bst(20);
		bst.insert_bst(15);
		bst.insert_bst(5);
		bst.insert_bst(2);
		System.out.println(bst.count);
		bst.travel_bst(bst.root);
		
		if (bst.search_bst(bst.root, 20)) {
			System.out.println("search successful");
		}else {
			System.err.println("search faild");
		}
		if (bst.search_bst(bst.root, 2)) {
			System.out.println("search successful");
		}else {
			System.err.println("search faild");
		}
		
	}

}
