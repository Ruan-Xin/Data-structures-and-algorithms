package trie;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trie t = new trie();
		t.insert_trie("aawqew"); 
		t.insert_trie("wqe");
		t.insert_trie("ewqewqrwq");
		if (t.search_trie("aawqew")) {
			System.out.println("search successful!");
		}else {
			System.out.println("search faild");
		}
		if (t.search_trie("wqe")) {
			System.out.println("search successful!");
		}else {
			System.err.println("search faild");
		}
		if (t.search_trie("ewqewqrwq")) {
			System.out.println("search successful!");
		}else {
			System.err.println("search faild");
		}
		t.travel_trie(t.root);
	}

}
