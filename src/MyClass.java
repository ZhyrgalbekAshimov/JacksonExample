import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class MyClass {

    private String type;
    private boolean deleted;
    private String _id;
    private String user;
    private String text;
    private String __v;
    private String source;
    private String updatedAt;
    private String createdAt;
    private boolean used;
    private boolean verified;
    private int sentCount;
    private String feedback;

    @JsonProperty("status")
    private void setStatus(Map<String, String> status) {
        this.verified = (Boolean.parseBoolean(status.get("verified")));
        this.sentCount = (Integer.parseInt(status.get("sentCount")));
        this.feedback = status.get("feedback");
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String get__v() {
        return __v;
    }

    public void set__v(String __v) {
        this.__v = __v;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
       return "\nstatus: " +
                "{\nverified = " + verified +
                "\nsentCount = " + sentCount +
                "\nfeedback = " + feedback + " }\n" +
                "\ntype = " + type +
                "\ntype = " + type +
                "\ndeleted = " + deleted +
                "\n_id = " + _id +
                "\nuser = " + user  +
                "\ntext = " + text +
                "\n__v = " + __v  +
                "\nsource = " + source  +
                "\nupdatedAt = " + updatedAt  +
                "\ncreatedAt = " + createdAt +
                "\nused = " + used +
                "\n";
    }
}
