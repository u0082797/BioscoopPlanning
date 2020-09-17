package model;

import java.util.Objects;

public class Film {
    private String titel;
    private int duurtijd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return duurtijd == film.duurtijd &&
                titel.equals(film.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, duurtijd);
    }
}
