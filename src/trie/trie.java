package trie;
//前缀树
public class trie {
	public trie_node root;
	public boolean search_trie(String targetStr) {
		if (root == null) {
			return false;
		}
		int char_code;
		trie_node location = root;
		for(int i = 0; i < targetStr.length();i++){
			if (targetStr.charAt(i) >= 'A' && targetStr.charAt(i) <= 'Z') {
				char_code = targetStr.charAt(i) - 'A';
			}else if (targetStr.charAt(i) >= 'a' && targetStr.charAt(i) <= 'z') {
				char_code = targetStr.charAt(i) - 'a';
			}else {
				return false;
			}
			if (location.branch[char_code] == null) {
				return false;
			}
			location = location.branch[char_code];
		}
		return true;
	}
	public int insert_trie(String targetStr){
		StringBuilder sb = new StringBuilder();
		if (root == null) {
			root = new trie_node();
		}
		int char_code;
		trie_node location = root;
		for(int i = 0; i < targetStr.length();i++){
			if (targetStr.charAt(i) >= 'A' && targetStr.charAt(i) <= 'Z') {
				char_code = targetStr.charAt(i) - 'A';
			}else if (targetStr.charAt(i) >= 'a' && targetStr.charAt(i) <= 'z') {
				char_code = targetStr.charAt(i) - 'a';
			}else {
				return -1;//非法单词
			}
			sb.append(targetStr.charAt(i));
			//还未存在该分支
			if (location.branch[char_code] == null) {
				location.branch[char_code] = new trie_node();
				location = location.branch[char_code];
				location.data = sb.toString(); 
			}else {
				location = location.branch[char_code];
			}
			if (i == targetStr.length() - 1) {
				location.isLeaf = true;
			}
		}
		return 1;
	}
	public void travel_trie(trie_node root) {
		if (root == null) {
			return;
		}
		if (root.isLeaf) {
			System.out.println(root.data);
			return;
		}
		for (int i = 0; i < root.branch.length; i++) {
			if (root.branch[i] != null) {
				travel_trie(root.branch[i]);
			}
		}
	}
}
