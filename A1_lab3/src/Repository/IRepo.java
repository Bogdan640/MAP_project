package Repository;

import Exceptions.MyException;
import Model.PrgState;

import java.io.IOException;
import java.util.List;

public interface IRepo {
    PrgState getCrtPrg() throws MyException;
    void addPrgState(PrgState newprg);
    void change_current_state(int index);
    void logPrgStateExec() throws MyException, IOException;
    List<PrgState> getRepo();
    List<PrgState> getRepoCopy();

}
