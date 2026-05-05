package org.example;

import java.util.*;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    public ArrayList<T> sort() {
        Collections.sort(this);
        return this;
    }

    @Override
    public boolean remove(Object e) {
        boolean removed = super.remove(e);
        if (removed) {
            this.sort(); // Silme başarılıysa listeyi tekrar sırala
        }
        return removed;
    }
    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }
}