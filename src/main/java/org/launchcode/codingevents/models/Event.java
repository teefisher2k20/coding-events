package org.launchcode.codingevents.models;

import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {
    private int Id;
    private static int nextId = 1;

    private String name;
    private String description;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.Id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Id == event.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
