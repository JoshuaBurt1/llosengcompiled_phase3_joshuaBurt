package common;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;
import java.io.IOException;
import java.net.Socket;

public interface AbstractConnectionFactory {
    ConnectionToClient createConnection(
            ThreadGroup group,
            Socket socket,
            AbstractServer server)
            throws IOException;
}

