package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list1 {

	public static void main(String[] args) {
		
		
		List<Integer> om = new  ArrayList<Integer>();
		
		
		om.add(1);
		om.add(2);
		om.add(3);
		om.add(4);
		om.add(5);
		om.add(6);
		om.add(7);
		om.add(8);
		om.add(9);
		om.add(10);
		om.add(1);
	
		//om.remove(2);      // 1) reference take by  index  2) (chack the in index position and remove)
		
		//om.clear();
		
		
		//System.out.println(om.get(2));   //1) we can pass index number    2) it is used to accessing element
		
		
		
		//System.out.println(om.set(0, 0));     // 1) it is use to change the element  2) we can pass first index and second  is changing  element 
		
		
		
		
		//एखादा element list मध्ये आहे का ते तपासते
		
		
		List<Integer> dm = new ArrayList<Integer>();
		
		
		dm.add(2);
		dm.add(3);
		dm.add(4);
		dm.add(1);
		
		
		
	//  System.out.println(om.contains(2));         //1) chacking one one element   2) then give true or false
		
   //   System.out.println(om.containsAll(dm));   // 1) chacking the all element of (dm) present in om stack  2) then give true or false
		
		
	//	System.out.println(om.indexOf(4));         //जर दिलेला element list मध्ये असेल तर त्याचा पहिला index  परत करते  .नसेल तर -1 परत करते.
		
	//	System.out.println(om.lastIndexOf(1));     //जर element एकाहून अधिक वेळा असेल तर त्याचा शेवटचा index परत करते.
		
		
		
	//	System.out.println(om.size());            //ही मेथड list मध्ये किती elements आहेत हे मोजते आणि तो आकडा (integer value) परत करते.
		
	//  System.out.println(om.isEmpty());        //List रिकामी आहे का ते तपासते
		
	
	//	System.out.println(om.addAll(dm));       // एका लिस्टमधले सर्व elements दुसऱ्या लिस्टमध्ये add करणे
		
		
		
		//प्रत्येक element बदलून नवा value लावणे
		
	//	om.replaceAll(n -> n * 10);
		
	//	System.out.println("After replaceAll(*10): " + om);
		
	//	dm.replaceAll(d -> d * 10);
		
	//	System.out.println("After replaceAll(*10): " + dm);
		
		
		
		
		
		// removeIf() → ठराविक condition नुसार काढणे
		
	
        //om.removeIf(n -> n % 2 == 0);
		
		//System.out.println(om);
		
		
		
		
		
		//sort() → ascending / descending क्रम
		
		
		
		//ascending क्रम 
		 
		//om.sort(null);
		
		//System.out.println(om);
		
		
		//descending क्रम
		
		//om.sort(Collections.reverseOrder());
		
		//System.out.println(om);
		
		
		
		
		//subList() → काही भाग मिळवणे
		
		
		//System.out.println(om.subList(0, 5));
		
		
		
		//Iterator वापरून तुम्ही list मधील element एकामागोमाग एक फक्त पुढे (Forward) वाचू शकता.  
		// 2) फक्त पुढे (Forward direction) फिरते 
		
		
		
//		Iterator<Integer> it = om.iterator();
//		
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		
		//listIterator() → दोन्ही दिशेने फिरते (Forward + Backward)
		

		ListIterator<Integer> it = om.listIterator();
		
		//(Forward Backward)
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//(Backward Backward )
		
		
		
		 while (it.hasPrevious()) {
	            System.out.print(it.previous());
	        }
		
		
		
		
	}

}
