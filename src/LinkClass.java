public class LinkClass {
    String Regular;
    public String Linking(String str)
    {
        this.Regular=str;
        String linkStr = this.Regular + this.Regular;
        return linkStr;
    }
}
