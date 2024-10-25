package Login;

public class Registration {
    private String login;
    private String password;
    private String confirmPassword;

    public Registration(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void registUser(String login, String password, String confirmPassword)
        throws Exception {
        try{
            if (!login.matches("[a-zA-Z0-9_]{1,14}")){
                throw new PasswordException("Логин должен содержать латинские буквы, цифры и знак подчеркиванияю Длинна должна быть меньше 15 символов");
            }
            if (!password.matches("[a-zA-Z0-9_]{7,20}")){
                throw new PasswordException("Пароль должен содержать латинские буквы, цифры и знак подчеркиванияю Длинна должна быть от 7 до 20 символов");
            }
            if (!password.equals(confirmPassword)){
                throw new PasswordException("пароли не совпадают.");
            }
            System.out.println("Вы зарегестрированы успешно!");
        } catch (Exception e) {
            throw new Exception("ошибка регестрации: " + e.getMessage());

        }


    }


}
