package interfaces;

import bean.GameBean;
import java.rmi.RemoteException;

public interface InterfaceGame extends InterfaceGlobal<GameBean> {

    public String getNome() throws RemoteException;

    public void setNome(String nome) throws RemoteException;

    public int getAno() throws RemoteException;

    public void setAno(int ano) throws RemoteException;

    public double getNota() throws RemoteException;

    public void setNota(double nota) throws RemoteException;

}
