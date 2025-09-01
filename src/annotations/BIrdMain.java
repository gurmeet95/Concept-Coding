package annotations;

public class BIrdMain implements Bird {
    @Override // annotation - optional to write.
    // it makes sure that this method is exactly same as parent method.
    public boolean canFly() {
        return false;
    }
}
