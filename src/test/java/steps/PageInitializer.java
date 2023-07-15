package steps;

import Pages.AdminUserManagementPage;
import Pages.DashboardPage;
import Pages.EmployeeMembershipManagementPage;
import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static EmployeeMembershipManagementPage employeeMembershipManagementPage;
    public static AdminUserManagementPage adminUMPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();

        employeeMembershipManagementPage = new EmployeeMembershipManagementPage();

        adminUMPage = new AdminUserManagementPage();

    }
}
