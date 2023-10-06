package steps;


import Pages.*;


public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeMembershipManagementPage employeeMembershipManagementPage;
    public static EmployeeDetailsManagementPage employeeDetailsManagementPage;
    public static PicturePage picturePage;
    public static AdminUserManagementPage adminUMPage;
    public static AdminAddJobDetailsPage adminAddJobDetaisPage;
    public static AdminQualificationMembershipPage adminMemPage;
    public static ActiveEmployeePage activeEmpPage;
    public static EmployeeContactDetailPage employeeContactDetailPage;
    public static EmployeeAddsLanguageProficiencyDetailsPage employeeAddsLanguageProficiencyDetailsPage;

    public static addDependentsPage addDepPage;



    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeMembershipManagementPage = new EmployeeMembershipManagementPage();
        employeeDetailsManagementPage = new EmployeeDetailsManagementPage();
        picturePage = new PicturePage();
        adminUMPage = new AdminUserManagementPage();
        adminAddJobDetaisPage = new AdminAddJobDetailsPage();
        adminMemPage = new AdminQualificationMembershipPage();
        activeEmpPage = new ActiveEmployeePage();
        employeeContactDetailPage=new EmployeeContactDetailPage();
        employeeAddsLanguageProficiencyDetailsPage=new EmployeeAddsLanguageProficiencyDetailsPage();
        addDepPage = new addDependentsPage();


    }
}