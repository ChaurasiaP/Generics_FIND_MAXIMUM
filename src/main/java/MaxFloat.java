public class MaxFloat {

    public Float checkMaxFloat(Float firstValue, Float secondValue, Float thirdValue){
        Float maxValue;

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
