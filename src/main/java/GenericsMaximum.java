public class GenericsMaximum <T extends Comparable> {
    public <T extends Comparable> T CheckMaxValues  (T first, T second, T third){

        if(first.compareTo(second) > 0 && first.compareTo(third) > 0){
            return first;
        } else if (second.compareTo(first) > 0 && second.compareTo(third) > 0) {
            return second;
        }else {
            return third;
        }
    }
}
