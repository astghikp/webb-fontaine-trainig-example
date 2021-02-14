package JavaNetworking;

import com.google.gson.annotations.SerializedName;

public class JsonData {

    // uremn vonc run ei anum UserID-s = 0 er :D
    //heto hisheci vor senc ban kara lini u hatuk Serializedov em toghel vor myus angam anunner@ nayem normal :D

    @SerializedName("userId")
    int userID;
    int id;
    String title;
    boolean completed;

    @Override
    public String toString() {
        return String.format("{userID: %d, id: %d, title: %s, completed: %b}", this.userID, id, title, completed);
    }
}
