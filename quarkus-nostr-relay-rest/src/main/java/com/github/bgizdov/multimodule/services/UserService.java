package com.github.tigz.multimodule.services;

import com.github.tigz.multimodule.entities.User;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
  public User getUser() {
    var user = new User();
    user.setId(1);
    user.setUsername("foobar");
    return user;
  }
}
