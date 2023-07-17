package steps;


import Pages.DashboardPage;

import Pages.LoginPage;
import Pages.addDependentsPage;

import Pages.*;


public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;


    public static addDependentsPage addDependentsPage;

    public static EmployeeMembershipManagementPage employeeMembershipManagementPage;
    public static PicturePage picturePage;
    public static AdminUserManagementPage adminUMPage;
    public static AdminQualificationMembershipPage adminMemPage;
    public static ActiveEmployeePage activeEmpPage;



    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();

        addDependentsPage=new addDependentsPage();

        employeeMembershipManagementPage = new EmployeeMembershipManagementPage();
        picturePage = new PicturePage();
        adminUMPage = new AdminUserManagementPage();
        adminMemPage = new AdminQualificationMembershipPage();
        activeEmpPage = new ActiveEmployeePage();


    }
}
