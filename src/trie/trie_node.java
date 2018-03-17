package trie;

public class trie_node {	
	public String data;
	public boolean isLeaf;
	public trie_node[] branch;
	public trie_node() {
		// TODO Auto-generated constructor stub
		branch = new trie_node[26];
		for(int i = 0; i < 26;i++){
			branch[i] = null;
		}
		isLeaf = false;
	}
	
}
