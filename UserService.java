package api.restfull.domain.model.service;

import api.restfull.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
