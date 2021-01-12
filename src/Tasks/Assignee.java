package Tasks;

public class Assignee {
    private String userName;
    private int userID;
    private Position userPosition;

    public Assignee(String userName, int userID, Position userPosition) {
        setUserName(userName);
        setUserID(userID);
        setUserPosition(userPosition);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Position getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(Position userPosition) {
        this.userPosition = userPosition;
    }

    // can we do such a thing? :D
    public enum Position {
        PROJECT_MANAGER,
        PROJECT_OWNER,
        BACK_END_DEVELOPER,
        FRONT_END_DEVELOPER,
        MOBILE_DEVELOPER,
        QA,
        BA
    }

}
