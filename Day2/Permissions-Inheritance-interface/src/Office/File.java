package Office;
public class File {
    private String description;
    private String type;
    private String secrecy;
    public File(String description, String type, String secrecy) {
        this.description = description;
        this.type = type;
        this.secrecy = secrecy;
    }
    public String getDescription() {
        return this.description;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSecrecy() {
        return this.secrecy;
    }
    private void updateSecrecy(String newSecrecy) {
        this.secrecy = newSecrecy;
    }

}
