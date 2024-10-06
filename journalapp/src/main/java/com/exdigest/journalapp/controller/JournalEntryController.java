//package com.exdigest.journalapp.controller;
//
//import com.exdigest.journalapp.entry.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.List;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
////  Retrieve
//    @GetMapping
//    public List<JournalEntry> getAll(){
//    return new ArrayList<>(journalEntries.values());
//    }
//
//    @GetMapping("id/{myID}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myID){
//        return journalEntries.get(myID);
//    }
//
////    Creating
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry MyEntry){
//    journalEntries.put(MyEntry.getId(), MyEntry);
//    return true;
//    }
//
//
//  //     Deleting
//    @DeleteMapping("id/{myID}")
//    public JournalEntry deleteEntryById(@PathVariable Long myID){
//        return journalEntries.remove(myID);
//    }
//
//    //Updating
//    @PutMapping("id/{ID}")
//    public JournalEntry updatingEntryById(@PathVariable Long ID, @RequestBody JournalEntry MyEntry){
//        return journalEntries.put(ID, MyEntry);
//    }
//}