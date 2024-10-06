package com.exdigest.journalapp.service;

import com.exdigest.journalapp.entry.JournalEntry;
import com.exdigest.journalapp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;


    // saving the data to the mongoDB using  - POST
    public void saveEntry(JournalEntry journalEntry){
    journalEntryRepository.save(journalEntry);
    }


    //Retrieving the data form the DB using  - GET
    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    //Retrieving the data using 'id' form the DB using  - GET
    public Optional<JournalEntry> findById(ObjectId id){
    return journalEntryRepository.findById(id);
    }

    // Deleting the data using 'id'   using   -  DELETE
    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
}