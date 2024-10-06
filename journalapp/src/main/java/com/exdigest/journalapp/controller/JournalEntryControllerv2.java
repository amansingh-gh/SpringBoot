package com.exdigest.journalapp.controller;

import com.exdigest.journalapp.entry.JournalEntry;
import com.exdigest.journalapp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService journalEntryService;

    //  Retrieve
    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    @GetMapping("id/{myID}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myID) {
        return journalEntryService.findById(myID).orElse(null);
    }

    //    Creating
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }


    //     Deleting
    @DeleteMapping("id/{myID}")
    public boolean deleteEntryById(@PathVariable ObjectId myID) {
        journalEntryService.deleteById(myID);
        return true;
    }


    //Updating
    @PutMapping("id/{ID}")
    public JournalEntry updatingEntryById(@PathVariable ObjectId ID, @RequestBody JournalEntry newEntry) {
        JournalEntry old =  journalEntryService.findById(ID).orElse(null);
        if(old != null){
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.equals("") ? newEntry.getContent(): old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
}