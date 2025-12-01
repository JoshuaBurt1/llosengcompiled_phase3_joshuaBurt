package common;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;
import java.io.IOException;
import java.net.Socket;

//this creates an interface for a server to connect to a client in AbstractServer, AdaptableServer, and ObservableServer
public interface AbstractConnectionFactory {
    ConnectionToClient createConnection(
            ThreadGroup group,
            Socket socket,
            AbstractServer server)
            throws IOException;
}

