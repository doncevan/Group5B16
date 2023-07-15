package steps;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.PicturePage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static PicturePage picturePage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        picturePage = new PicturePage();
    }
}
