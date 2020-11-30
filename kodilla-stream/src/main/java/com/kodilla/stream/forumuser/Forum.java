package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(01, "pawel",'M', LocalDate.of(2000, 5, 15),50));
        theForumUserList.add(new ForumUser(02, "ania",'F', LocalDate.of(1999, 6, 24),100));
        theForumUserList.add(new ForumUser(03, "maciek",'M', LocalDate.of(2001, 7, 25),22));
        theForumUserList.add(new ForumUser(04, "kasia",'F', LocalDate.of(2002, 8, 12),42));
        theForumUserList.add(new ForumUser(05, "krystian",'M', LocalDate.of(1998, 9, 28),33));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUserList);
    }
}
