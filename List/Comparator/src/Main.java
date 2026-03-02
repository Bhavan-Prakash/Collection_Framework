import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class StringLengthComparator implements Comparator<String>{
//
//    //for string wala sorting -- length wise
//    @Override
//    public int compare(String s1 , String s2){
//        return 0;
//    }

    //for sorting integers in the descending

    class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1 , Integer o2){

            // this method has three cases:
            // 1 . if this method return negative value then o1 comes first and o2 comes last
            // 2 . if this method return positive value then o2 comes first and o1 comes last
            // 3 . if this method return 0 then both the values will be given same prefrence


            return o1-o2; //will always make list in ascending order
//            return o2-o1; // will always make list in descending order

        }
}

public class Main {
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("banana", "apple", "date");
//
//        words.sort(null);
//        System.out.println(words); //output is apple,banana,date (letter wise)

        //what if we want to sort this length wise i.e date,apple,banana so to do this we have make a custom logic so to do this /apply this custom logic we use comparator


//        now lets sort the integer list in descending order

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(new MyComparator());
        System.out.println(list);

        //very easy way is to use lambda expression i.e:

        list.sort((a,b) -> b-a); //sorting in descending order


    }
    }
