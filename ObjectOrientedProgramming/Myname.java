// Exercícios 16 OOP - Crie uma classe em Java chamada "SeuNome" com uma variedade de atributos,
// como nome, idade, profissão, endereço, telefone, email, se possui carro, e salário.
// Para cada atributo, inclua métodos para acessar (getters) e modificar (setters) os valores. No método main, crie uma instância dessa classe,
// defina valores para seus atributos, e exiba esses valores na saída padrão. Sinta-se à vontade para incluir quaisquer atributos adicionais que considere relevantes.

public class Myname {
    public String name;
    public int age;
    public String job;
    public String address;
    public int phonenumber;
    public String email;
    public boolean car;
    public float income;

    // Builder
    public Myname(String name, int age, String job, String address, int phonenumber, String email, boolean car,
            float income) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.car = car;
        this.income = income;
    }

    // Getter method
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public boolean getCar() {
        return car;
    }

    public float getIncome() {
        return income;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    // Main method for running
    public static void main(String[] args) {
        // Creating the object
        Myname alias = new Myname("James do Bond", 55, "Secret Agent", "Alamo Street", 555555, "007neverdies@time.com",
                false, 554);
                alias.setName("Ze Pequeno");
        
                System.out.println("Tons of information:");
                System.out.println(alias.getName());

    }
}
