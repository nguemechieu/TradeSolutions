package org.tradeadviser.tradesolutions;

import javafx.fxml.Initializable;

public interface IUserService extends Initializable {
    public void login(String username, String password);

    public void logout();

    public boolean isLoggedIn();

    public String getUsername();

    public String getPassword();

    public void setUsername(String username);
}
