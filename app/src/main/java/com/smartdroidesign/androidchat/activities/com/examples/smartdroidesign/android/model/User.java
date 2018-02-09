package com.smartdroidesign.androidchat.activities.com.examples.smartdroidesign.android.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by mstara on 09/02/2018.
 */

@IgnoreExtraProperties
public class User {

    public String username;
    public String firstName;
    public String lastName;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName  = lastName;
    }

}