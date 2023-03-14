package entities;

import java.util.HashSet;
import java.util.Set;

public class Instructors {
    private Set<Classmates> set = new HashSet<>();

    public Set<Classmates> getSet() {
        return set;
    }

    public void setSet(Set<Classmates> set) {
        this.set = set;
    }
    public Instructors(){}

    public Instructors(Set<Classmates> set) {
        this.set = set;
    }
}
