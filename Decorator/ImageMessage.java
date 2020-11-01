package Messages;

public interface ImageMessage extends Message{
    public void printContent();
    public int getWidth();
    public int getHeight();
    public String getFormat();
    public String getContent();
    public Message clone();
}
