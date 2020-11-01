public class Main {

    public static void main(String[] args) {
	// write your code here
    	ImageMessage img = new Image("Human image",28,28,"JPEG");
    	ImageMessage textImg = new TextDecorator(img, "Happy Birthday");
    	ImageMessage emojiImg = new EmojiDecorator(textImg, "Bouquet and wine");
    }
}