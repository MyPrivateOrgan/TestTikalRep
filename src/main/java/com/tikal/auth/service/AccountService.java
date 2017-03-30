package com.tikal.auth.service;

import com.tikal.auth.model.Account;
import com.tikal.auth.model.Role;
import com.tikal.web.entities.WebAccount;
import com.tikal.web.entities.WebRole;

/**
 * Created by Sopher on 23/03/2017.
 */

public interface AccountService{

    void save(WebAccount webAccount);

    Account findByUsername(String userName);

    void save(WebRole role);

    Role findByRole(String role);

    WebAccount login(String username, String password);

}
