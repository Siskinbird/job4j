package ex;


public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User found = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                found = users[index];
                break;
            }
        }
        if (found == null) {
            throw new UserNotFoundException("User not found");
        }
        return found;
    }

    public static boolean validate(User user) throws UserInvalidException {
        int count = user.getUsername().length();
        if (user.isValid() && count > 3) {
            System.out.println("user is valid");
            return true;
        }
        if (!user.isValid() || count < 3) {
            throw new UserInvalidException("Invalid user name");
        }
        return false;
    }

    // подскажите пожалуйста как мне поймать 2е исключение, пишет что они одинаковые с первым
    // а при использовании второго try, до него не доходит...
    //

    public static void main(String[] args) {
        User[] users = {new User("Valera", true)}; // Масиив с 1 юзером
        User valera = new User("Billy", true); // Объект который ищем но не находим UserNotFoundException
        User inValera = new User("va", false);// Инвалидный объект для UserInvalidException
        try { // пробуем
            validate(valera);
            findUser(users, valera.getUsername()); // Тут выплывает UserNotFoundException
            validate(inValera);
            findUser(users, inValera.getUsername()); // Тут выплывает UserInvalidException

        } catch (UserInvalidException ex) {
            ex.printStackTrace();
        } catch (UserNotFoundException e) {   //  Оно подсвечено, но при этом работает (
            e.printStackTrace();
        }
    }
}
