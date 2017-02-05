package segtree;
/*该线段树如下图表示
 *            [1-10]
 *           /      \
 *          /        \
 *      [1-5]         [5-10]
 *       /   \         /   \
 *      /     \       /     \
 *  [1-3]   [3-5]     [5-7]  [7-10]
 *   /  \    / \        /\        /\
 *[1-2][2-3]/   \      /  \      /  \
 *        [3-4] [4-5][5-6][6-7][7-8][8-10]       
 *        							 / \
 *        							/	\
 *        						  [8-9]	[9-10] */
 
public class segtree {
	seg_node root = null;
	public segtree(seg_node root) {
		// TODO Auto-generated constructor stub
		this.root = root;
	}
	public void seg_build(seg_node root,int start,int end) {
		System.out.println(111);
		//seg_node location = root;
		int index = (start + end) / 2;
		if (index == start) {
			return;
		}
		root.left = new seg_node(start, index);
		root.right = new seg_node(index, end);
		seg_build(root.left, root.left.start, root.left.end);
		seg_build(root.right, root.right.start, root.right.end);
	}
	public void seg_travel(seg_node root) {
		if (root == null) {
			return;
		}
		seg_travel(root.left);
		seg_travel(root.right);
		System.out.println("[" + root.start + "," + root.end + "]");
	}
}
