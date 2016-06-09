package five.test;

/**
 * Created by Pankaj Nimgade on 09-06-2016.
 */
public class Message {

    private long id;
    private long from_id;
    private long to_id;
    private String chat_message;
    private long chat_message_id;
    private long languages_id;
    private long created_at;
    private long updated_at;
    private int is_read;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFrom_id() {
        return from_id;
    }

    public void setFrom_id(long from_id) {
        this.from_id = from_id;
    }

    public long getTo_id() {
        return to_id;
    }

    public void setTo_id(long to_id) {
        this.to_id = to_id;
    }

    public String getChat_message() {
        return chat_message;
    }

    public void setChat_message(String chat_message) {
        this.chat_message = chat_message;
    }

    public long getChat_message_id() {
        return chat_message_id;
    }

    public void setChat_message_id(long chat_message_id) {
        this.chat_message_id = chat_message_id;
    }

    public long getLanguages_id() {
        return languages_id;
    }

    public void setLanguages_id(long languages_id) {
        this.languages_id = languages_id;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public int getIs_read() {
        return is_read;
    }

    public void setIs_read(int is_read) {
        this.is_read = is_read;
    }

    @Override
    public String toString() {
        return "id: " + id + " from_id: " + from_id + " to_id: " + to_id + " chat_message: " + chat_message + " chat_message_id: " + chat_message_id;
    }
}
