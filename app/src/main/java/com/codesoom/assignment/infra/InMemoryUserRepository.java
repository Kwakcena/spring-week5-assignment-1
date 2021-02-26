package com.codesoom.assignment.infra;

import com.codesoom.assignment.domain.User;
import com.codesoom.assignment.domain.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, User> map = new HashMap<>();
    private Long lastId = 0L;

    @Override
    public void save(User user) {
        map.put(user.getId(), user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public Long nextId() {
        return lastId++;
    }

    @Override
    public void delete(User user) {
        map.remove(user.getId());
    }
}
