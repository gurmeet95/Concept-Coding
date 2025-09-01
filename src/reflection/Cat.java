package reflection;


public class Cat {

    public String breed1;
    private boolean canSwim;
    Cat(){

    }

    public void getInvoke(int number,String name,String breed){
        System.out.println("Id="+number+" Name="+name+" Bredd="+breed);
    }
}
