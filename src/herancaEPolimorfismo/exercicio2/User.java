package herancaEPolimorfismo.exercicio2;

public abstract sealed class User permits Manager, Salesman, Clerk{

    protected String name;
    protected String email;
    protected String password;
    protected boolean isAdmin;
    protected boolean isLogged;

    public User(String name, String email, String password, boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isLogged = false;
    }

    public void login() {
        if (isLogged) {
            System.out.println("O usuário já está logado");
        }
        this.isLogged = true;
        System.out.printf("%s logado com sucesso.\n", this.getClass().getSimpleName());
    }

    public void logoff() {
        if (isLogged) {
            this.isLogged = false;
            System.out.printf("%s desconectado com sucesso.\n", this.getClass().getSimpleName());
        } else {
            System.out.println("O usuário já está desconectado");
        }
    }

    public void updateData(String name, String email, String password) {

        if (isLogged && password.equals(this.password)) {
            this.name = name;
            this.email = email;
            System.out.println("Nome e email atualizados com sucesso.");
        } else {
            System.out.println(isLogged?"Senha incorreta":"O usuário precisa estar logado para atualizar dados.");
        }

    }

    public void changePassword(String password, String newPassword) {

        if (isLogged && password.equals(this.password)) {
            this.password = newPassword;
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println(isLogged?"Senha incorreta":"O usuário precisa estar logado para atualizar dados.");
        }

    }

    public void userInfo() {

        if (isLogged) {
            System.out.printf("Nome: %s \nEmail: %s \nAdministrador: %s \n", name, email, isAdmin);
        } else {
            System.out.println("O usuário precisa estar logado para realizar a ação");
        }

    }


}
