package visibility;

public class Client {

    public void createCompany(){
        Company company = new Company();
        company.costamProtected();
    }
}
