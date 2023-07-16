package CollectionHierarchy;

public class AddRemoveCollection extends  Collection implements  AddRemovable{


    public int add(String str) {
        super.getItems().add(0,str);
        return 0 ;
    }
    @Override
    public String remove() {
        return super.getItems().remove(super.getItems().size()-1);
    }


}
