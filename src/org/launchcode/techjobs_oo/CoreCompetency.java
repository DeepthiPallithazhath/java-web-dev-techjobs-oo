package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
    /*private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }*/

    public CoreCompetency(String value) {
        /*this();
        this.value = value;*/
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

   /* @Override
    public String toString() {
        if(value=="")
            this.value="Data not avaliable";
        return value;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(id);
    }*/

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but

  /*  public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }*/
//  ONLY a getter for the 'id' field.
}
