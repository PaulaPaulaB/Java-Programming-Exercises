package visibility;


public class ChildCompany extends Company {


    protected Integer numberOfEmployees;

    public void childMethod() {
        this.costamProtected();
        this.cottamDefault();
    }

    @Override
    void cottamDefault() {

    }

}
