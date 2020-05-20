package ex;


public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User[] found = new User[users.length];
        int counter = 0;
        for (int index = 0; index < users.length; index++) {
            User current = users[index];
            if (current.getUsername().equals(login)) {
                found[counter] = current;
                counter++;
                System.out.println("User found");
            }
            if (login == null) {
                throw new UserNotFoundException("User not found");
            }
        }
         return found[counter]; // тоже сомневаюсь в этом выражении, но ничего иного return не хочет возвращать

    }





    public static boolean validate(User user) throws UserInvalidException {
        String username = user.getUsername();
        int count = username.length(); // Получаю число символов из строки юзернэйм
        if (user.isValid() && count > 3) { // условие успешной выалидации
            return true;
        } else { // Если валидация не проходит, то падает нижестоящее исключение
            throw new UserInvalidException("Invalid user name"); // супер месседж
        }
    }

   // подскажите пожалуйста как мне поймать 2е исключение, пишет что они одинаковые с первым
    // что логично, так как одно наследник другого, но в задании надо поймать 2 исключения(
    public static void main(String[] args) {
        User[] users = {new User("Petr", true)}; // Тут я почему то создаю уже отвалидированного юзера
        // Нужно ли тут еще создавать объект ?
        try {
            validate(findUser(users, "Ruslan"));{ // Тут провоцирую исключения
            }
        } catch (UserInvalidException ui) { // проверяем валидацию с нижестоящего исключения
            ui.printStackTrace();

        } catch (UserNotFoundException nof) { // тут я уже не представляю как изменить ситуацию
           nof.printStackTrace();
        }
    }
}

