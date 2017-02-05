package segtree;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		segtree st = new segtree(new seg_node(1, 10));
		st.seg_build(st.root, st.root.start, st.root.end);
		st.seg_travel(st.root);
	}

}
