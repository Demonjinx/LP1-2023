package org.example;
import java.util.*;

class MessageBundle {
    private ResourceBundle messages;

    public MessageBundle(Locale locale) {
        messages = ResourceBundle.getBundle("MessagesBundle", locale);
    }

    public String getMessage(String key) {
        return messages.getString(key);
    }
}
