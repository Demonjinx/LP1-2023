package org.example;
import java.util.Date;

class AgendaItem {
    private Date date;
    private String description;

    public AgendaItem(Date date, String description) {
        this.date = date;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return date + " - " + description;
    }
}

class Event extends AgendaItem {
    public Event(Date date, String description) {
        super(date, description);
    }
}

class Task extends AgendaItem {
    public Task(Date date, String description) {
        super(date, description);
    }
}

class Reminder extends AgendaItem {
    private Date reminderTime;

    public Reminder(Date date, String description, Date reminderTime) {
        super(date, description);
        this.reminderTime = reminderTime;
    }

    public Date getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Date reminderTime) {
        this.reminderTime = reminderTime;
    }

    @Override
    public String toString() {
        return super.toString() + " (Reminder at " + reminderTime + ")";
    }
}