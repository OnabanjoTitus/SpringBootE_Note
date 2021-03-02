package com.notePad.notepad.Api;

import com.notePad.notepad.Model.Entry;
import com.notePad.notepad.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/Books")
@RestController
public class BookController {
    private final BookServices bookServices;

    @Autowired
    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }
    @PostMapping
    public void addEntry(@RequestBody Entry entry){
        bookServices.addEntry(entry);
    }
    @GetMapping
    public List<Entry> getEntries(){
        return bookServices.getEntry();
    }
    @GetMapping(path= "{id}")
    public Entry getEntryByIndex(@PathVariable("id") int index){
        return bookServices.getAnEntryByIndex(index);
    }
}
