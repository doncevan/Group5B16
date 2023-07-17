package steps;

import Pages.*;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static EmployeeDetailsManagementPage employeeDetailsManagementPage;
    public static PicturePage picturePage;
    public static AdminUserManagementPage adminUMPage;
    public static AdminQualificationMembershipPage adminMemPage;
    public static ActiveEmployeePage activeEmpPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeDetailsManagementPage = new EmployeeDetailsManagementPage();
        picturePage = new PicturePage();
        adminUMPage = new AdminUserManagementPage();
        adminMemPage = new AdminQualificationMembershipPage();
        activeEmpPage = new ActiveEmployeePage();

    }
}
