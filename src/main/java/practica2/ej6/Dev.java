package practica2.ej6;

public class Dev {
    private String name;
    private IChat chat;

    public Dev(String name, IChat chat) {
        this.name = name;
        this.chat = chat;
    }

    public void receive(String msg, Dev sender){
        System.out.println(name+" received: "+msg+" from: "+sender.getName());
    }

    public void send(String msg, Dev receptor){
        chat.send(msg, this, receptor);
    }

    public void send(String msg){
        chat.send(msg, this, null);
    }

    public IChat getChat() {
        return chat;
    }

    public void setChat(IChat chat) {
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
