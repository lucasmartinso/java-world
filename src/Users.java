public class Users {
    String name;
    private String cpf; 
    private String email;
    int age; 

    public void setCpf(String cpf) { 
        if(cpf.length() == 11) this.cpf = cpf;
    }

    public void setEmail(String email) { 
        this.email = email;
    }

    String getName() { 
        return this.name;
    }

    String getEmail() { 
        return this.email;
    }

    protected String getCpf() { 
        return this.cpf;
    }

    int getAge() { 
        return this.age;
    }
}
