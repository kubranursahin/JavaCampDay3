public class UserManager
{
    public void join(User user) {
        System.out.println(user.getUsername()+" kullanıcı kayıt başarılı");
    }
    public void leave(User user) {
        System.out.println(user.getUsername()+" kullanıcı kaydı silindi");
    }
}
