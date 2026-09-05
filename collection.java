//Basic Collection Framework in Java.
import java.util.*;
class Collection{
    public static void main(String[] args){
        /*ArrayList<String> StringList = new ArrayList<>();
        StringList.add("hello");
        StringList.add("welcome");
        StringList.add(1, "hi");
        StringList.remove(1);
        boolean present = StringList.contains("hello");
        System.out.println(present);
        int index = StringList.lastIndexOf("world");
        System.out.println(index);
        for(int i = 0; i < StringList.size(); i++){
            System.out.println(StringList.get(i));
        }
       LinkedList<String> LinkedList = new LinkedList<>();
       LinkedList.add("hello");
       LinkedList.addFirst("world");
        for(int i = 0; i < LinkedList.size(); i++){
            System.out.println(LinkedList.get(i));
        }
        Stack<String> stack = new Stack<>();
        stack.push("hello");
        stack.push("world");
        stack.push("hi");
        stack.push("java");
        stack.setSize(3);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        int found = stack.search("hello");
        System.out.println(found);
        System.out.println(stack.size());
     
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(314);
        treeSet.add(314);
        treeSet.add(235);
        treeSet.add(345);
        treeSet.add(135);

        //for(Integer i : treeSet){
         //   System.out.println(i);
        //}
        System.out.println(treeSet.floor(33)); 
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(12);
        deque.offer(17);
        deque.offer(12);
        deque.offerFirst(10);
        deque.poll();
        deque.peek(); 
        ArrayList<Integer> al = new ArrayList<>();
        al.add(13);
        al.add(53);
        al.add(43);
        al.add(33);
        al.add(24);
        al.add(63);
        Collections.sort(al);
        System.out.println(al);
        Collections.rotate(al,3);
        System.out.println(al); */

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "violet");
        System.out.println(map.get(2));



    }
}