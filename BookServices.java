package com.notePad.notepad.Services;

import com.notePad.notepad.Dto.Books;
import com.notePad.notepad.Model.Entry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServices {
    private final Books books;
    @Autowired
    public BookServices(@Qualifier("Bookings") Books books) {
        this.books = books;
    }
    public void addEntry(Entry entry){
        books.AddEntry(entry);
    }
    public List<Entry> getEntry(){
       return books.getEntries();
    }
    public Entry getAnEntryByIndex(int index){
        return  books.getAnEntryByIndex(index);
    }
}
