package comp1110.ass2.gittest;

public class C {
    @Override
    public String toString(){

            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

}
