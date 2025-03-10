package com.edigest.journalApp.service;

import com.edigest.journalApp.Repository.JournalEntryRepository;
import com.edigest.journalApp.entity.JournalEntry;
import jdk.jfr.Category;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }
    public List<JournalEntry>getAll(){
        return journalEntryRepository.findAll();
    }
    public Optional<JournalEntry>findById(ObjectId id) {
        return journalEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id) {
        journalEntryRepository.deleteById(id);
    }
}
