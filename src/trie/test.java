package trie;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trie t = new trie();
		int res = t.insert_trie("aawqew"); 
		t.insert_trie("wqe");
		t.insert_trie("ewqewqrwq");
		if (res == 1) {
			System.out.println("insert successful!");
		}else if(res == -1){
			System.err.println("insert faild");
		}
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
		trie_node location = t.root;
		t.travel_trie(location);
	}

}
