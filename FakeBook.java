package com.notePad.notepad.Dto;

import com.notePad.notepad.Model.Entry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("Bookings")
public class FakeBook  implements Books{
    ArrayList<Entry> entries= new ArrayList<>();
    @Override
    public void AddEntry(Entry entry) {
        entries.add( new Entry(entry.getEntryBody()));
    }

    @Override
    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public Entry getAnEntryByIndex(int index) {
        return entries.get(index);
    }


}
