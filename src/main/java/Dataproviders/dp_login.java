package Dataproviders;


import java.util.ListIterator;

import org.testng.annotations.DataProvider;

import Generic_Library.Utility;

public class dp_login {

	@DataProvider(name = "invalid_login")
	public ListIterator<Object[]> dp_invalid() throws Exception
	{
		return Utility.dp_commonlogic("Credentials","InvalidLogin");
	}
	
	@DataProvider(name = "valid_login")
	public static ListIterator<Object[]> dp_valid() throws Exception
	{
		return Utility.dp_commonlogic("Credentials", "Script_Name");
	}
	
	@DataProvider(name = "valid_loginCAAdmin")
	public static ListIterator<Object[]> dp_validcaAdmin() throws Exception
	{
		return Utility.dp_commonlogic("CredentialsCAAdmin", "Script_Name");
	}
	
	@DataProvider(name = "createAdmin_Page")
	public static ListIterator<Object[]> dp_caAdmin() throws Exception
	{
		return Utility.dp_commonlogic("CreateAdmin", "Script_Name");
	}
	
	@DataProvider(name = "createUserErrMsg_Page")
	public static ListIterator<Object[]> dp_createUsrErrMsg() throws Exception
	{
		return Utility.dp_commonlogic("createUserErrMsg", "Script_Name");
	}
	
	@DataProvider(name = "createOfcr_Page")
	public static ListIterator<Object[]> dp_createofcr() throws Exception
	{
		return Utility.dp_commonlogic("createOfficer", "Script_Name");
	}
	@DataProvider(name = "createAuditr_Page")
	public static ListIterator<Object[]> dp_createAuditor() throws Exception
	{
		return Utility.dp_commonlogic("createAuditor", "Script_Name");
	}
	@DataProvider(name = "createOperator_Page")
	public static ListIterator<Object[]> dp_createOperator() throws Exception
	{
		return Utility.dp_commonlogic("createOperator", "Script_Name");
	}
	
	@DataProvider(name = "createUserNegtve_Page")
	public static ListIterator<Object[]> dp_createUserInvldCheck() throws Exception
	{
		return Utility.dp_commonlogic("CreateUserNgtive", "Script_Name");
	}
	
	@DataProvider(name = "userGroup_Page")
	public static ListIterator<Object[]> dp_userGroup() throws Exception
	{
		return Utility.dp_commonlogic("UserNGroup", "Script_Name");
	}
	
	@DataProvider(name = "certificatePrfle_Page")
	public static ListIterator<Object[]> dp_certPrfle() throws Exception
	{
		return Utility.dp_commonlogic("certificateProfile", "Script_Name");
	}
	
	@DataProvider(name = "keyPrfleHrdToken_Page")
	public static ListIterator<Object[]> dp_keyPrfleHrdTkn() throws Exception
	{
		return Utility.dp_commonlogic("keyProfileHardTkn", "Script_Name");
	}
	
	@DataProvider(name = "keyPrfleHSM_Page")
	public static ListIterator<Object[]> dp_keyPrfleHSM() throws Exception
	{
		return Utility.dp_commonlogic("keyProfileHSM", "Script_Name");
	}
	
	@DataProvider(name = "caEnroll_Page")
	public static ListIterator<Object[]> dp_caEnroll() throws Exception
	{
		return Utility.dp_commonlogic("OffCAEnroll", "Script_Name");
	}
	
	@DataProvider(name = "userEnroll_Page")
	public static ListIterator<Object[]> dp_userEnroll() throws Exception
	{
		return Utility.dp_commonlogic("OffUserEnroll", "Script_Name");
	}
	
	@DataProvider(name = "manageOSCP_Page")
	public static ListIterator<Object[]> dp_OSCP() throws Exception
	{
		return Utility.dp_commonlogic("OffOSCPMnge", "Script_Name");
	}
	
	@DataProvider(name = "keyRecovery_Page")
	public static ListIterator<Object[]> dp_keyStore() throws Exception
	{
		return Utility.dp_commonlogic("keyRecovery", "Script_Name");
	}
	
	@DataProvider(name = "manageOSCPErrCheck")
	public static ListIterator<Object[]> dp_OCSPErrcheck() throws Exception
	{
		return Utility.dp_commonlogic("OffOCSPErrCheck", "Script_Name");
	}
	
	@DataProvider(name = "CAEnrollErrCheck")
	public static ListIterator<Object[]> dp_CAEnrollErrcheck() throws Exception
	{
		return Utility.dp_commonlogic("CAEnrollErrCheck", "Script_Name");
	}
	
	@DataProvider(name = "reports_Page")
	public static ListIterator<Object[]> dp_rprts() throws Exception
	{
		return Utility.dp_commonlogic("Reports", "Script_Name");
	} 
	
	@DataProvider(name = "Auditorreports_Page")
	public static ListIterator<Object[]> dp_audtrrprts() throws Exception
	{
		return Utility.dp_commonlogic("AuditrReports", "Script_Name");
	}
	
	@DataProvider(name = "OperatorBackup_Page")
	public static ListIterator<Object[]> dp_optrBackup() throws Exception
	{
		return Utility.dp_commonlogic("OperatorBckup", "Script_Name");
	}
	
	@DataProvider(name = "OperatorBackupRmte_Page")
	public static ListIterator<Object[]> dp_optrBackupA() throws Exception
	{
		return Utility.dp_commonlogic("OperatorBckupRmte", "Script_Name");
	}
}

