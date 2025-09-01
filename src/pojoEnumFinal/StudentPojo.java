package pojoEnumFinal;

public class StudentPojo {
    // POJO- Plain Old Java Object
    //Not extends,implements
    // Class and default constructor should be public.
    //No annotations.
    private int id;
    private String name;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // helpful in doing mapping
    //for example-data coming from client and we paas it to our pojo class
    //then from pojo class pass it to our Business class etc.
    // with this if there is need of any change for data from client,we only need
    //to make change in our pojo class.
    //2. Repo-pojo(entity object)-then save to db
}
