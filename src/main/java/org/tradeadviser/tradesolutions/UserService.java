package org.tradeadviser.tradesolutions;

import java.net.URL;
import java.util.ResourceBundle;

public class UserService implements IUserService {
    /**
     * @param username
     * @param password
     */
    @Override
    public void login(String username, String password) {

    }

    /**
     *
     */
    @Override
    public void logout() {

    }

    /**
     * @return
     */
    @Override
    public boolean isLoggedIn() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public String getUsername() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public String getPassword() {
        return null;
    }

    /**
     * @param username
     */
    @Override
    public void setUsername(String username) {

    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     *                  the root object was not localized.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // no-op


    }
}
