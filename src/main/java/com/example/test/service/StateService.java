package com.example.test.service;

import com.example.test.entity.State;
import com.example.test.repository.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StateService {
    private final StateRepository stateRepository;

    public void add(String name) {
        State state = new State();
        state.setName(name);
        stateRepository.save(state);
    }
}
