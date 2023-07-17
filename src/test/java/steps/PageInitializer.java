package steps;

import Pages.DashboardPage;

import Pages.LoginPage;
import Pages.addDependentsPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static addDependentsPage addDependentsPage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addDependentsPage=new addDependentsPage();
    }
}
