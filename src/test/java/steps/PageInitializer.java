package steps;

import Pages.AdminUserManagementPage;
import Pages.DashboardPage;
import Pages.EmployeeDetailsManagementPage;
import Pages.LoginPage;
import Pages.PicturePage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;


    public static EmployeeDetailsManagementPage employeeDetailsManagementPage;
    public static PicturePage picturePage;
    public static AdminUserManagementPage adminUMPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeDetailsManagementPage = new EmployeeDetailsManagementPage();
        picturePage = new PicturePage();
        adminUMPage = new AdminUserManagementPage();

    }
}
