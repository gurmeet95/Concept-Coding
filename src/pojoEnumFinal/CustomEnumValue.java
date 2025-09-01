package pojoEnumFinal;

public enum CustomEnumValue {
    MONDAY(101,"First day of Week"), //these value are passes to constructor.
    TUESDAY(102,"Second day of Week"),
    WEDNESDAY(103,"Third day of Week"),
    THURSDAY(104,"Fourth day of Week"),
    FRIDAY(105,"Fifth day of Week"),
    SATURDAY(106,"First day of Weekend"),
    SUNDAY(107,"Second day of Weekend");

    private int val;
    private String comments;
    // these values are for each constant.
    CustomEnumValue(int val, String comments){
        // internally in bytecode this cons. is private.
        //value which we pass in const is come in this const. as value and comment.
        this.val=val;
        this.comments=comments;
    }

    public int getValue() {
        return val;
    }

    public String getComments() {
        return comments;
    }
    public static  CustomEnumValue getEnumFromValue(int value){
       for(CustomEnumValue sample: CustomEnumValue.values()) {
           if(sample.val == value){
               return sample;
           }
       }
       return null;
    }

}
