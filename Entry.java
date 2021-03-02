package com.notePad.notepad.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entry {
    private final String EntryBody;
    public Entry(@JsonProperty("EntryBody") String entryBody) {
        EntryBody = entryBody;
    }

    public String getEntryBody() {
        return EntryBody;
    }

}
