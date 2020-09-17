package model;

public class Zaal {
    private String locatie;
    private int capaciteit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zaal zaal = (Zaal) o;
        return capaciteit == zaal.capaciteit &&
                com.google.common.base.Objects.equal(locatie, zaal.locatie);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(locatie, capaciteit);
    }
}
