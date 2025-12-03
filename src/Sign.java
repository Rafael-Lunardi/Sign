public class Sign {
    String message;
    int width;

    public Sign(String m, int w) {
        message = m;
        width = w;
    }

    public int numberOfLines() {
        int num;
        num = (message.length() / width); if ((message.length() % width) != 0 ) num++;
        return num;
    }

    public String getLines(){
        String result = "";
        String str = "";
        int start = 0;
        if (message.length() == 0) return null;
        for ( int i = 0; i < numberOfLines(); i++) {
            if (start + width > message.length()) {
                str = message.substring(start);
            } else str = message.substring(start, start + width);

            start += str.length();
            result += str + ";";
        }
        return result.substring(0, result.length() - 1);
    }
}
