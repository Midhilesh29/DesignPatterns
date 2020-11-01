public class Image  implements ImageMessage {
    private int height;
    private int width;
    private String format;
    private String content;

    public Image(String content,int h,int w,String format){
        this.content = content;
        this.height = h;
        this.width = w;
        this.format = format;
    }

    public Image(Image target){
        this.format = target.format;
        this.content = target.content;
        this.height = target.height;
        this.width = target.width;
    }
    public String getFormat(){
        return this.format;
    }
    @Override
    public void printContent() {
        System.out.println(this.content);
    }
    public String getContent(){
        return this.content;
    }

    @Override
    public Message clone() {
        return new Image(this);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
}
