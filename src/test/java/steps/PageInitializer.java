package steps;

import Pages.*;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static EmployeeMembershipManagementPage employeeMembershipManagementPage;
    public static PicturePage picturePage;
    public static AdminUserManagementPage adminUMPage;
    public static AdminQualificationMembershipPage adminMemPage;
    public static ActiveEmployeePage activeEmpPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeMembershipManagementPage = new EmployeeMembershipManagementPage();
        picturePage = new PicturePage();
        adminUMPage = new AdminUserManagementPage();
        adminMemPage = new AdminQualificationMembershipPage();
        activeEmpPage = new ActiveEmployeePage();

    }
}
