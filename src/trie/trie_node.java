package trie;

public class trie_node {	
	public String data;//从root节点到该节点组成的单词
	public boolean isLeaf;
	public trie_node[] branch;
	public trie_node() {
		// TODO Auto-generated constructor stub
		branch = new trie_node[26];
		for(int i = 0; i < 26;i++){
			branch[i] = null;
		}
		isLeaf = false;//初始化为false
	}
	
}
