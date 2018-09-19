package Chapter14;

public class OurStringBuilder {

    private String content;

    public OurStringBuilder() {
        this.content = new String();
    }

    public OurStringBuilder(String content) {
        this.content = content;
    }

    public void append(String another) {
        this.content += another;
    }

    public void append(int another) {
        this.content += another;
    }

    public void reverse() {
        String reversed = "";
        for(int i = content.length() - 1; i >= 0; i--) {
            reversed += content.charAt(i);
        }
        this.content = reversed;
    }

    // insert()
    // delete()


    @Override
    public String toString() {
        return this.content;
    }
}
