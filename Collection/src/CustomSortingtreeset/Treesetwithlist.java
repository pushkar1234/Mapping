package CustomSortingtreeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Treesetwithlist {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("raj");
		list.add("pushkar");
		list.add("mahendra");
		list.add("tushar");
		TreeSet<String> set=new TreeSet<>(list);
		System.out.println(set);
		// TODO Auto-generated method stub

	}

}
