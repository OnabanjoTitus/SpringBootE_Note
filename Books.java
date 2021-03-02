package com.notePad.notepad.Dto;

import com.notePad.notepad.Model.Entry;

import java.util.List;

public interface Books {
    void AddEntry(Entry entry);
    List<Entry>getEntries();
    Entry getAnEntryByIndex(int index);
}
