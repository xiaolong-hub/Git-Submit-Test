import java.util.ArrayList;

public class Plant extends MyElement {

    ArrayList<Object> list = new ArrayList<Object>();

    public void add(MyElement myElement) {
        list.add(myElement);
    }

    @Override
    public void eat() {
        for (Object object:list
             ) {
            ((MyElement)object).eat();
        }
    }
}
