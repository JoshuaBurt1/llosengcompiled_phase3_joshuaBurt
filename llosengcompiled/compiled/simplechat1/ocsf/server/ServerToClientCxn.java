package ocsf.server;

import common.AbstractConnectionFactory;
import java.net.Socket;
import java.io.IOException;

//like ClientConsole, the server needs to implement the interface
public class ServerToClientCxn implements AbstractConnectionFactory {

    @Override
    public ConnectionToClient createConnection(ThreadGroup group, Socket socket, AbstractServer server)
            throws IOException
    {
        return new ConnectionToClient(group, socket, (AdaptableServer) server);
    }
}

