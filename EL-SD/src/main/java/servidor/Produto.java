package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Produto extends UnicastRemoteObject implements InterfaceProduto {
    public String descricao;
    public double preco;
    public int quantidade;
    
    public Produto() throws RemoteException {
        System.out.println("a classe produto está disponível remotamente");
    }
    
    @Override
    public String getDescricao() throws RemoteException{
        return this.descricao;
    }
    
    @Override
    public void setDescricao(String descricao) throws RemoteException{
        this.descricao = descricao;
    }
    
    @Override
    public double getPreco() throws RemoteException{
        return this.preco;
    }
    
    @Override
    public void setPreco(double preco) throws RemoteException{
        this.preco = preco;
    }
    
    @Override
    public int getQuantidade() throws RemoteException{
        return this.quantidade;
    }
    
    @Override
    public void setQuantidade(int quantidade) throws RemoteException{
        this.quantidade = quantidade;
    }
}
