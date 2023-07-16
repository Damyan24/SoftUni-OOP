package CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String [] itemsToAdd = scan.nextLine().split("\\s+");

        printAdd(itemsToAdd,addCollection);
        printAdd(itemsToAdd,addRemoveCollection);
        printAdd(itemsToAdd,myList);

        int itemsToRemove = Integer.parseInt(scan.nextLine());

        printRemove(itemsToRemove,addRemoveCollection);
        printRemove(itemsToRemove,myList);
    }

    private static void printRemove(int itemsToRemove, AddRemovable addRemoveCollection) {
        for(int i = 0 ; i < itemsToRemove; i++){
            System.out.print(addRemoveCollection.remove()+" ");
        }
        System.out.println();
    }

    private static void printAdd(String[] itemsToAdd, Addable addCollection) {
        for(String str : itemsToAdd){
            System.out.print(addCollection.add(str) + " ");
        }
        System.out.println();
    }
}
