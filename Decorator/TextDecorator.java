package ImgMessage;

import Messages.ImageMessage;
import Messages.Message;

public class TextDecorator implements ImageMessage{
    private String Text;
    private ImageMessage imageObj;
    private String content;

    public TextDecorator(ImageMessage img, String text){
        this.Text = text;
        this.imageObj = img;
        this.content = img.getContent()+" added with text "+text;
    }
    public TextDecorator(TextDecorator target){
        this.Text = target.Text;
        this.imageObj = target.imageObj;
        this.content = target.content;
    }
    @Override
    public void printContent() {
        System.out.println(this.content);
    }

    @Override
    public int getWidth() {
        return this.imageObj.getWidth();
    }

    @Override
    public int getHeight() {
        return this.imageObj.getHeight();
    }

    @Override
    public String getFormat() {
        return imageObj.getFormat();
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public Message clone() {
        return new TextDecorator(this);
    }
}
