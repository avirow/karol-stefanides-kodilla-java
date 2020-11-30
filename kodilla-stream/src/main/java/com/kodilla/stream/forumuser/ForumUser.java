package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int postAmount;

    public ForumUser(int usaerID, String userName, char userSex, LocalDate birthDate, int postAmount) {
        this.userID = usaerID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.postAmount = postAmount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", birthDate=" + birthDate +
                ", postAmount='" + postAmount + '\'' +
                '}';
    }
}
