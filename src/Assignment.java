import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment {

	private static final int HashMap = 0;

	public static void main(String[] args) {
	
//(1) Create an instance of an ArrayList of String called employeeNames
	List<String> employeeNames = new ArrayList<String>();
	//(4) Add at least five entries to the employeeNames...
	employeeNames.add("Keyser");
	employeeNames.add("Mycroft");
	employeeNames.add("Ulysses");
	employeeNames.add("John");
	employeeNames.add("Godot");
	
//(2) Create an instance of a HashSet of Integer called ids
	Set<Integer> ids = new HashSet<Integer>();
	 //(4) ...and ids (make sure both collections have the same number of entries).
	ids.add(995);	
	ids.add(859);
	ids.add(882);
	ids.add(957);
	ids.add(953);
	
//(3) Create an instance of a HashMap of Integer, String called employeeMap
	Map<Integer, String> employeeMap = new HashMap<Integer, String>();
	
//(5) Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment i so that each iteration grabs the next element in the ArrayList.
	
	int i = 0;
	
	for (Integer id : ids) {		
		employeeMap.put(id, employeeNames.get(i));
		i++;
		}
	
//(6) Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map.
	
	Set<Integer> employee = employeeMap.keySet();
	 	for (Integer key : employee) {
	 			System.out.println(key + " : " + employeeMap.get(key));
	 		}
	 	
//(7) Create a StringBuilder called idsBuilder.
	 StringBuilder idsBuilder = new StringBuilder();
	 
 		
//(8) Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
	 for (Integer id : ids) {
		 idsBuilder.append(id + "-");
	 }
	 
//(9) Print the result of idsBuilder.toString() to the console.
	 	System.out.println(idsBuilder.toString());
	 	
//(10) Create another StringBuilder called namesBuilder.
	 StringBuilder namesBuilder = new StringBuilder();
	 
//(11) Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
	 for (String employeeName : employeeNames) {
		 namesBuilder.append(employeeName + " ");
	 }
	 	
//(12) Print the result of namesBuilder.toString() to the console.
	 	System.out.println(namesBuilder.toString());
	
	}

}