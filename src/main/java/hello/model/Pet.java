package hello.model;

import java.time.LocalDate;

/**
 * Created by ddiaconita on 1/10/2017.
 */
public class Pet {

    private String name;
    private LocalDate birthday;

    public Pet() {
    }

    public Pet(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
