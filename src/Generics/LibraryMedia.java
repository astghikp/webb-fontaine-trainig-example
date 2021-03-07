package Generics;

import java.util.ArrayList;

public class LibraryMedia<T extends Media & Comparable<T>> {

    private ArrayList<T> mediaCollection = new ArrayList<T>();


    public void showMedia() {
        for (Object resource : mediaCollection.toArray()) {
            System.out.print("\t" + resource.toString() + "\n");
        }
    }

    public void retrieveMedia(T item) {
        mediaCollection.add(item);
    }


}
