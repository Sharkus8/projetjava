package com.tawa.service;

import com.tawa.model.Table;
import com.tawa.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableService {

    private final TableRepository tableRepository;

    @Autowired
    public TableService(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    public Optional<Table> getTableById(Long id) {
        return tableRepository.findById(id);
    }

    public Table createTable(Table table) {
        return tableRepository.save(table);
    }

    public Table updateTable(Long id, Table tableDetails) {
        Optional<Table> optionalTable = tableRepository.findById(id);
        if (optionalTable.isPresent()) {
            Table table = optionalTable.get();
            table.setNumber(tableDetails.getNumber());
            table.setCapacity(tableDetails.getCapacity());
            return tableRepository.save(table);
        } else {
            return null;
        }
    }

    public void deleteTable(Long id) {
        tableRepository.deleteById(id);
    }
}
