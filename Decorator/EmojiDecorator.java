package ImgMessage;

import Messages.ImageMessage;
import Messages.Message;

public class EmojiDecorator implements ImageMessage {
    private ImageMessage imgObj;
    private String Emoji;
    private String content;

    public EmojiDecorator(ImageMessage obj, String emoji){
        this.imgObj = obj;
        this.Emoji = emoji;
        this.content = obj.getContent()+" added with emoji "+emoji;
    }

    public EmojiDecorator(EmojiDecorator target){
        this.imgObj = target.imgObj;
        this.Emoji = target.Emoji;
        this.content = target.content;
    }
    @Override
    public void printContent() {
        System.out.println(this.content);
    }

    @Override
    public int getWidth() {
        return this.imgObj.getWidth();
    }

    @Override
    public int getHeight() {
        return this.imgObj.getHeight();
    }

    @Override
    public String getFormat() {
        return this.imgObj.getFormat();
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public Message clone() {
        return new EmojiDecorator(this);
    }
}
