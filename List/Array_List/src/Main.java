import java.util.*;

public class Main{
    public static void main(String[] args) {
////        int[] arr = new int [10]; Simple array in java where the element sized is fixed
//
////        ArrayList<Integer> arrayList = new ArrayList<>(); format for writting arraylist
//
//        <Integer> means that the arraylist is of type integer
//
////        List<Integer> arrayList = new ArrayList<>(); arraylist can be written as this because list is the parent interface/class of arraylist
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10); // 0 index
//        list.add(30); // 1 index
//        list.add(80); // 2 index
//
//        System.out.println(list.get(2)); // will print the value at 2nd index i.e 80
//        System.out.println(list.size()); // will print size of list i.e 3
//
//        // for printing every element, in this way we are using pointer
//
//        for(int i = 0 ; i < list.size() ; i++){
//            System.out.println(list.get(i));
//        }
//
////        another very easy of printing elements in lists thios one is valid in arrays as well
//
//        for(int x : list){
//            System.out.println(x);
//        }
//
////        method to check whether a element is present in the list or not
//
//        System.out.println(list.contains(10)); // will return true
//        System.out.println(list.contains(20)); // will return false
//
////        method for removing an element present at that index
//
//        list.remove(2); // will remove the element present at index 2
//
////        method to add an element at an given index
//
//        list.add(1,100); // in this method 100 will be added to index 1 and the element that is already present in the index 1 will be shifted to next index
//
//        list.set(1,50); // in thos method the 50 will be set to index 1 but the element that is already present in the index 1 will be gone instead of moving one index away
//
////        printing list without any loop
//
//        System.out.println(list);



        // NEW TOPIC




//        ArrayList<Integer> list = new ArrayList<>(1000); // in() we have default initial capacity which is by default 10
//
//        list.trimToSize(); // used to reduce the capacity as the capacity doesnt reduce automatically unlike increases automatically
//
////        Arrays.asList("Monday", "Tuesday"); press opt+enter to convert it to list
//
//        List<String> list1 = Arrays.asList("Monday", "Tuesday"); // this is not a full list like our previous ones so this cant perform add or remove methods , it cant resize, its a static list , it can still do function like set
//
////        our main array list is from java.util.ArrayList where as the above one is from
////        java.util.Arrays$ArrayList
//
////        if you want to make the above array modiefiable i.e it should act like your main list you can do the following
//
//        List<String> list4 = new ArrayList<>(list1);
//
////        in newer versions of java we create a new array list by below method
//
////        List.of(1,2,3); //then press opt+enter to make it a arraylist
//
//        List<Integer> integers = List.of(1, 2, 3); //but in this array we cant even perform set options, so in this list we cant perform any operation
//
////        if you want add all the elements of the any two unmodiefieable list to the main list i.e the modiefiable one then you can do like below
//
//        list4.addAll(list1); // list4 is the name of our main modiefiable list and list1 is the name of unmodiefiable name






        // NEW TOPIC










//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.remove(Integer.valueOf(1)); //this will remove the value 1 not index 1 from the list, but only first 1 value and not the second occuring 1 value
//
////        if we had an string list we could have deleted the value only by writing below code:
//
//        list.remove("object") // this is what we call object removing method, it basically removes the value and not the value at the index but the actual value
//







        // NEW TOPIC

////        converting list to array
//
//        List<Integer> list = new ArrayList<>();
//
//        list.toArray(); //now press opt+enter to get the below
//
//        Object[] array = list.toArray();
//
////        now if we want to tell the type we write something like below:
//
//        list.toArray(new Integer[0]); //Integer[0] means create a new array instead of working on the old one
//
//        Integer[] array1 = list.toArray(new Integer[0]); //result after pressing opt+enter to the above









//        NEW TOPIC
//        Sorting an list

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(1);

        Collections.sort(list);  //this will sort the list in ascending order
        System.out.println(list);

        list.sort(null); // this is will also sort the list same as collections.sort but the only difference is that its using comparator which we will learn latter on

    }
}