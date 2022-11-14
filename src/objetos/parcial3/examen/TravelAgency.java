package objetos.parcial3.examen;
import java.util.*;

public class TravelAgency {

    LinkedList<UserAccount> usuario = new LinkedList<UserAccount>();

    public String addUserAccount(UserAccount userAccount) {

        usuario.add(userAccount);
        return userAccount.name;
    }

}
