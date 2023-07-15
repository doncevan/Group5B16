package steps;

import Pages.AdminUserManagementPage;
import Pages.DashboardPage;
import Pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AdminUserManagementPage adminUMPage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        adminUMPage = new AdminUserManagementPage();
    }
}
