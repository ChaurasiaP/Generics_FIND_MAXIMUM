public class MaxString {
    public String checkMaxString(String firstString, String secondString, String thirdString){

        if(firstString.compareToIgnoreCase(secondString) > 0 && firstString.compareToIgnoreCase(thirdString) > 0){
            return firstString;
        }else if(secondString.compareToIgnoreCase(firstString) > 0 && secondString.compareToIgnoreCase(thirdString) > 0){
            return secondString;
        }else {
            return thirdString;
        }
    }
}
