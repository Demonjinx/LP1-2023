package org.example;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

class Agenda {
    private List<AgendaItem> items = new ArrayList<>();
    private MessageBundle messageBundle;

    public Agenda(MessageBundle messageBundle) {
        this.messageBundle = messageBundle;
    }

    public void addItem(AgendaItem item) {
        if (item instanceof Event) {
            if (hasConflicts((Event) item)) {
                System.out.println(messageBundle.getMessage("message.conflictError"));
                return;
            }
        }
        items.add(item);
        System.out.println(messageBundle.getMessage("message.eventAdded"));
    }

    public List<AgendaItem> viewItemsByDate(Date date) {
        List<AgendaItem> itemsOnDate = new ArrayList<>();
        for (AgendaItem item : items) {
            if (isSameDay(item.getDate(), date)) {
                itemsOnDate.add(item);
            }
        }
        return itemsOnDate;
    }

    public void editItem(AgendaItem item, String newDescription) {
        item.setDescription(newDescription);
        System.out.println(messageBundle.getMessage("message.itemEdited"));
    }

    public void editReminder(Reminder reminder, Date newReminderTime) {
        reminder.setReminderTime(newReminderTime);
        System.out.println(messageBundle.getMessage("message.reminderEdited"));
    }

    public void deleteItem(AgendaItem item) {
        items.remove(item);
        System.out.println(messageBundle.getMessage("message.itemDeleted"));
    }

    private boolean hasConflicts(Event event) {
        for (AgendaItem item : items) {
            if (item instanceof Event && isSameDay(item.getDate(), event.getDate())) {
                return true;
            }
        }
        return false;
    }

    private boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }


    }

