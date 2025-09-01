package pojoEnumFinal;

public enum OverRideEnum {
    MONDAY{
        @Override
        public void dummyData(){
            System.out.println("Dummy from Monday");
        }},

    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyData(){
        System.out.println("Default dummy Data");
    }

   // public abstract void dummyMethod();
    // all the constant needs to give body to this method.

    // we can also implement interface and give body to method after constant.
    // and we can also override it for all constant individually.

}
