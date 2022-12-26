package chain_of_responsability;

public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageAddExclamationMarkHandler(new MessageVerifyHandler(new MessagePrintHandler(null)));
        messageHandler.handle("hehehe");
    }
}

abstract class MessageHandler {
    MessageHandler nextMessageHandler;

    public MessageHandler(MessageHandler nextMessageHandler) {
        this.nextMessageHandler = nextMessageHandler;
    }
    abstract void handle(String message);
}

class MessagePrintHandler extends MessageHandler {
    public MessagePrintHandler(MessageHandler nextMessageHandler) {
        super(nextMessageHandler);
    }
    @Override
    void handle(String message) {
        System.out.println(message);
    }
}

class MessageVerifyHandler extends MessageHandler {
    public MessageVerifyHandler(MessageHandler nextMessageHandler) {
        super(nextMessageHandler);
    }
    @Override
    void handle(String message) {
        if(true) {
            nextMessageHandler.handle(message);
        }
    }
}

class MessageAddExclamationMarkHandler extends MessageHandler {
    public MessageAddExclamationMarkHandler(MessageHandler nextMessageHandler) {
        super(nextMessageHandler);
    }

    @Override
    void handle(String message) {
        nextMessageHandler.handle(message + " !");
    }
}

