package entities;

import java.util.Objects;

public class Classmates {
    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classmates that)) return false;
        return Objects.equals(getNumber(), that.getNumber());
    }

    public Classmates(Integer number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Integer number;
}
