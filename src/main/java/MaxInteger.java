public class MaxInteger {
    int firstValue;
    int secondValue;
    int thirdValue;

    public int checkMaxInteger(Integer firstValue, Integer secondValue, Integer thirdValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;

        int maxValue;

        if(firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0){
            maxValue = firstValue;
        }else if(secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0){
            maxValue = secondValue;
        }else {
            maxValue = thirdValue;
        }
        return maxValue;
    }
}
