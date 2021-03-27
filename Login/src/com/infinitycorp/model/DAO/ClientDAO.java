
package com.infinitycorp.model.DAO;

import com.infinitycorp.connection.Conexao;
import com.infinitycorp.model.identity.Client;
import java.sql.PreparedStatement;

public class ClientDAO {
    
    private final Conexao connection;

    public ClientDAO(Conexao connection) {
        this.connection = connection;
    }
    
    public void insert(Client client){
        String sql = "inset into client(name, user, password, birthDate) values ()";
        //PreparedStatement pStatement = connecti
    }
    
    
}
