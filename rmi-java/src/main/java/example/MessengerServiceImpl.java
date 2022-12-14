package example;

import java.rmi.RemoteException;

public class MessengerServiceImpl implements MessengerService{
    @Override
    public String sendMessage(String clientMessage) throws RemoteException {
        return "Client Message".equals(clientMessage) ? "Server Message" : null;
    }

    public String unexposedMethod() {
        return "Unexposed";
    }
}
