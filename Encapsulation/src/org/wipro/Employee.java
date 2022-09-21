package org.wipro;
//ENCAPSULATION CLASS NOTES IBRAHIM---2
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Employee {
public static void main(String[] args) {
	Company c =new Company();
	c.setId(200);
	c.setN("SELENIUM");
	Company c1 =new Company();
	c1.setId(300);
	c1.setN("RUBY");
	List<Company>l = new ArrayList<Company>();
	l.add(c);
	l.add(c1);
	System.out.println(l.get(1).getId());
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i).getId());
		System.out.println(l.get(i).getN());
	}
	
	System.out.println("----------------------------set--------------");

Set<Company> s = new HashSet<>();
s.add(c);
s.add(c1);
for (Company co : s) {
	System.out.println(co.getId());
	System.out.println(co.getN());	
}
System.out.println("=========================map===========");
Map<Integer,Company> m = new Hashtable<>();
m.put(1, c);
m.put(2, c1);
Set<Entry<Integer, Company>> entrySet = m.entrySet();
for (Entry<Integer, Company> entry : entrySet) {
	System.out.println(entry.getKey());
	System.out.println(entry.getValue().getId());
	System.out.println(entry.getValue().getN());
	
	
}
	
}

}