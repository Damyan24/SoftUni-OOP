package CollectionHierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Collection {

    private int maxSize;
    private List<String>items;

    public List<String> getItems() {
        return items;
    }

    public Collection(){
        this.maxSize = 100;
        this.items = new ArrayList<>(maxSize);
    }

    public abstract int add(String str);
}
