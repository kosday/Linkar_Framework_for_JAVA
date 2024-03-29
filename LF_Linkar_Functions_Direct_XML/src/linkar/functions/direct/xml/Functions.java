package linkar.functions.direct.xml;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import linkar.CredentialOptions;
import linkar.functions.*;
import linkar.functions.direct.DirectFunctions;
import linkar.functions.direct.xml.XML_FORMAT;

/**
 * These functions perform synchronous and asynchronous direct (without establishing permanent session) operations with output format type XML.
 */
public class Functions
{
	/* = SYNC = */
	
	/* READ */
	
	/**
	 * Reads one or several records of a file in a synchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyRead()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.Read(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options, XML_FORMAT.XML, "", 60);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read.
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
	 * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
	 * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static String Read(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Read(credentialOptions, filename, records, dictionaries, readOptions, DATAFORMAT_TYPE.XML, xmlFormat.getCRUFormat(), customVars, receiveTimeout);
    }
    
	/**
	 * Reads one or several records of a file in a synchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyRead()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.Read(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options, XML_FORMAT.XML, "");			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read.
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
	 * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static String Read(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    {
        return Read(credentialOptions, filename, records, dictionaries, readOptions, xmlFormat, customVars,0);
    }
    
	/**
	 * Reads one or several records of a file in a synchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyRead()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.Read(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options, XML_FORMAT.XML);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read.
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static String Read(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions,
        XML_FORMAT xmlFormat) throws Exception
    {
        return Read(credentialOptions, filename, records, dictionaries, readOptions, xmlFormat, "");
    }
    
	/**
	 * Reads one or several records of a file in a synchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyRead()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.Read(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read.
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static String Read(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions) throws Exception
    {
        return Read(credentialOptions, filename, records, dictionaries, readOptions, XML_FORMAT.XML);
    }
    
	/**
	 * Reads one or several records of a file in a synchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyRead()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			result = Functions.Read(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"");			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read.
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static String Read(CredentialOptions credentialOptions, String filename, String records, String dictionaries) throws Exception
    {
        return Read(credentialOptions, filename, records, dictionaries, null);
    }
    
	/**
	 * Reads one or several records of a file in a synchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyRead()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			result = Functions.Read(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;");			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read.
	 * @param records It's the records codes list to read.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static String Read(CredentialOptions credentialOptions, String filename, String records) throws Exception
    {
        return Read(credentialOptions, filename, records, "");
    }
    
    /* UPDATE */

    /**
     * Update one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdate()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.Update(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Update(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Update(credentialOptions, filename, records, updateOptions,  DATAFORMAT_TYPE.XML, xmlFormat.getCRUFormat(), customVars, receiveTimeout);
    }
    
    /**
     * Update one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdate()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.Update(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Update(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    {
        return Update(credentialOptions, filename, records, updateOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Update one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdate()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.Update(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Update(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat) throws Exception
    {
        return Update(credentialOptions, filename, records, updateOptions, xmlFormat, "");
    }
    
    /**
     * Update one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdate()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.Update(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Update(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions) throws Exception
    {
        return Update(credentialOptions, filename, records, updateOptions, XML_FORMAT.XML);
    }
    
    /**
     * Update one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdate()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			result = Functions.Update(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Update(CredentialOptions credentialOptions, String filename, String records) throws Exception
    {
        return Update(credentialOptions, filename, records, null);
    }
    
    /* UPDATEPARTIAL */

    /**
     * Update one or more attributes of one or more file records, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartial()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartial(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String UpdatePartial(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.UpdatePartial(credentialOptions, filename, records, "", updateOptions,  DATAFORMAT_TYPE.XML, xmlFormat.getCRUFormat(), customVars, receiveTimeout);
    }
    
    /**
     * Update one or more attributes of one or more file records, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartial()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartial(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String UpdatePartial(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    {
        return UpdatePartial(credentialOptions, filename, records, updateOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Update one or more attributes of one or more file records, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartial()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartial(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String UpdatePartial(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat) throws Exception
    {
        return UpdatePartial(credentialOptions, filename, records, updateOptions, xmlFormat, "");
    }
    
    /**
     * Update one or more attributes of one or more file records, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartial()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartial(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String UpdatePartial(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions) throws Exception
    {
        return UpdatePartial(credentialOptions, filename, records, updateOptions, XML_FORMAT.XML);
    }
    
    /**
     * Update one or more attributes of one or more file records, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #Read} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartial()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			result = Functions.UpdatePartial(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String UpdatePartial(CredentialOptions credentialOptions, String filename, String records) throws Exception
    {
        return UpdatePartial(credentialOptions, filename, records, null);
    }
    
    /* NEW */

    /**
     * Creates one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNew()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.New(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "", 60);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String New(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.New(credentialOptions, filename, records, newOptions, DATAFORMAT_TYPE.XML, xmlFormat.getCRUFormat(), customVars, receiveTimeout);
    }
    
    /**
     * Creates one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNew()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.New(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "");			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String New(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    {
        return New(credentialOptions, filename, records, newOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Creates one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNew()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.New(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String New(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions,
        XML_FORMAT xmlFormat) throws Exception
    {
        return New(credentialOptions, filename, records, newOptions, xmlFormat, "");
    }
    
    /**
     * Creates one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNew()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.New(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String New(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions) throws Exception
    {
        return New(credentialOptions, filename, records, newOptions, XML_FORMAT.XML);
    }
    
    /**
     * Creates one or several records of a file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNew()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			result = Functions.New(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;");			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String New(CredentialOptions credentialOptions, String filename, String records) throws Exception
    {
        return New(credentialOptions, filename, records, null);
    }
    
    /* DELETE */

    /**
     * Deletes one or several records in file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #Read} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDelete()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			DeleteOptions options = new DeleteOptions();
	 *			result = Functions.Delete(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			options, "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @param deleteOptions Object that defines the different Function options: optimisticLockControl, recoverRecordIdType.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Delete(CredentialOptions credentialOptions, String filename, String records, DeleteOptions deleteOptions,
        String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Delete(credentialOptions, filename, records, deleteOptions, DATAFORMAT_TYPE.XML, DATAFORMAT_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Deletes one or several records in file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #Read} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDelete()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			DeleteOptions options = new DeleteOptions();
	 *			result = Functions.Delete(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			options, "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @param deleteOptions Object that defines the different Function options: optimisticLockControl, recoverRecordIdType.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Delete(CredentialOptions credentialOptions, String filename, String records, DeleteOptions deleteOptions,
        String customVars) throws Exception
    {
        return Delete(credentialOptions, filename, records, deleteOptions, customVars, 0);
    }   
    
    /**
     * Deletes one or several records in file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #Read} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDelete()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			DeleteOptions options = new DeleteOptions();
	 *			result = Functions.Delete(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			options);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @param deleteOptions Object that defines the different Function options: optimisticLockControl, recoverRecordIdType.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Delete(CredentialOptions credentialOptions, String filename, String records, DeleteOptions deleteOptions) throws Exception
    {
        return Delete(credentialOptions, filename, records, deleteOptions, "");
    } 
    
    /**
     * Deletes one or several records in file, in a synchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #Read} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDelete()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Delete(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Delete(CredentialOptions credentialOptions, String filename, String records) throws Exception
    {
        return Delete(credentialOptions, filename, records, null);
    } 
    
    /* SELECT */

    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","","","", options, XML_FORMAT.XML, "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Select(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, xmlFormat.getCRUFormat(), customVars, receiveTimeout);
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","","","", options, XML_FORMAT.XML, "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","","","", options, XML_FORMAT.XML);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions,
        XML_FORMAT xmlFormat) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, xmlFormat, "");
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","","","", options);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, XML_FORMAT.XML);
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","","","");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, null);
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","","");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, sortClause, dictClause, "");
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "","");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, sortClause, "");
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS", "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename, String selectClause) throws Exception
    {
        return Select(credentialOptions, filename, selectClause, "");
    }
    
    /**
     * Executes a Query in the Database, in a synchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelect()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Select(credentials, "LK.CUSTOMERS");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Select(CredentialOptions credentialOptions, String filename) throws Exception
    {
        return Select(credentialOptions, filename, "");
    }
    
    /* SUBROUTINE */

    /**
     * Executes a subroutine, in a synchronous way with XML input and output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySubroutine()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");	
	 *			result = Functions.Subroutine(credentials, "SUB.DEMOLINKAR", 3,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;ARGUMENTS&gt;" +
	 * 			"    &lt;ARGUMENT&gt;0&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;aaaa&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;&lt;/ARGUMENT&gt;" +
	 * 			"  &lt;/ARGUMENTS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param subroutineName Subroutine name you want to execute.
     * @param argsNumber Number of arguments
     * @param arguments The subroutine arguments list.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Subroutine(CredentialOptions credentialOptions, String subroutineName, int argsNumber, String arguments,
        String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Subroutine(credentialOptions, subroutineName, argsNumber, arguments, DATAFORMAT_TYPE.XML, DATAFORMAT_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Executes a subroutine, in a synchronous way with XML input and output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySubroutine()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");	
	 *			result = Functions.Subroutine(credentials, "SUB.DEMOLINKAR", 3,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;ARGUMENTS&gt;" +
	 * 			"    &lt;ARGUMENT&gt;0&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;aaaa&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;&lt;/ARGUMENT&gt;" +
	 * 			"  &lt;/ARGUMENTS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param subroutineName Subroutine name you want to execute.
     * @param argsNumber Number of arguments
     * @param arguments The subroutine arguments list.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Subroutine(CredentialOptions credentialOptions, String subroutineName, int argsNumber, String arguments,
        String customVars) throws Exception
    {
        return Subroutine(credentialOptions, subroutineName, argsNumber, arguments, customVars, 0);
    }
    
    /**
     * Executes a subroutine, in a synchronous way with XML input and output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySubroutine()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");	
	 *			result = Functions.Subroutine(credentials, "SUB.DEMOLINKAR", 3,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;ARGUMENTS&gt;" +
	 * 			"    &lt;ARGUMENT&gt;0&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;aaaa&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;&lt;/ARGUMENT&gt;" +
	 * 			"  &lt;/ARGUMENTS&gt;" +
	 * 			"&lt;/LINKAR&gt;");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param subroutineName Subroutine name you want to execute.
     * @param argsNumber Number of arguments
     * @param arguments The subroutine arguments list.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Subroutine(CredentialOptions credentialOptions, String subroutineName, int argsNumber, String arguments) throws Exception
    {
        return Subroutine(credentialOptions, subroutineName, argsNumber, arguments, "");
    }       
    
    /* CONVERSION */

    /**
     * Returns the result of executing ICONV() or OCONV() functions from a expression list in the Database, in a synchronous way with XML output format.
    * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyConversion()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.Conversion(credentials, CONVERSION_TYPE.INPUT,"31-12-2017�01-01-2018","D2-", "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param conversionType Indicates the conversion type, input or output: Input=ICONV(); OUTPUT=OCONV()
     * @param expression The data or expression to convert. It can have MV marks, in which case the conversion will execute in each value obeying the original MV mark.
     * @param code The conversion code. It will have to obey the Database conversions specifications.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Conversion(CredentialOptions credentialOptions, CONVERSION_TYPE conversionType, String expression, String code,
        String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Conversion(credentialOptions, expression, code, conversionType, DATAFORMAT_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Returns the result of executing ICONV() or OCONV() functions from a expression list in the Database, in a synchronous way with XML output format.
    * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyConversion()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.Conversion(credentials, CONVERSION_TYPE.INPUT,"31-12-2017�01-01-2018","D2-", "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param conversionType Indicates the conversion type, input or output: Input=ICONV(); OUTPUT=OCONV()
     * @param expression The data or expression to convert. It can have MV marks, in which case the conversion will execute in each value obeying the original MV mark.
     * @param code The conversion code. It will have to obey the Database conversions specifications.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Conversion(CredentialOptions credentialOptions, CONVERSION_TYPE conversionType, String expression, String code,
        String customVars) throws Exception
    {
        return Conversion(credentialOptions, conversionType, expression, code, customVars, 0);
    }
    
    /**
     * Returns the result of executing ICONV() or OCONV() functions from a expression list in the Database, in a synchronous way with XML output format.
    * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyConversion()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.Conversion(credentials, CONVERSION_TYPE.INPUT,"31-12-2017�01-01-2018","D2-");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param conversionType Indicates the conversion type, input or output: Input=ICONV(); OUTPUT=OCONV()
     * @param expression The data or expression to convert. It can have MV marks, in which case the conversion will execute in each value obeying the original MV mark.
     * @param code The conversion code. It will have to obey the Database conversions specifications.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Conversion(CredentialOptions credentialOptions, CONVERSION_TYPE conversionType, String expression, String code) throws Exception
    {
        return Conversion(credentialOptions, conversionType, expression, code, "");
    }
    
    /* FORMAT */

    /**
     * Returns the result of executing the FMT function in a expressions list in the Database, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyFormat()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.Format(credentials, "1�2","R#10", "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param expression The data or expression to format. It can contain MV marks, in which case the conversion in each value will be executed according to the original MV mark.
     * @param formatSpec Specified format
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Format(CredentialOptions credentialOptions, String expression, String formatSpec,
        String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Format(credentialOptions, expression, formatSpec, DATAFORMAT_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Returns the result of executing the FMT function in a expressions list in the Database, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyFormat()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.Format(credentials, "1�2","R#10", "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param expression The data or expression to format. It can contain MV marks, in which case the conversion in each value will be executed according to the original MV mark.
     * @param formatSpec Specified format
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Format(CredentialOptions credentialOptions, String expression, String formatSpec,
        String customVars) throws Exception
    {
        return Format(credentialOptions, expression, formatSpec, customVars, 0);
    }
    
    /**
     * Returns the result of executing the FMT function in a expressions list in the Database, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyFormat()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.Format(credentials, "1�2","R#10");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param expression The data or expression to format. It can contain MV marks, in which case the conversion in each value will be executed according to the original MV mark.
     * @param formatSpec Specified format
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Format(CredentialOptions credentialOptions, String expression, String formatSpec) throws Exception
    {
        return Format(credentialOptions, expression, formatSpec, "");
    }
    
    /* DICTIONARIES */

    /**
     * Returns all the dictionaries of a file, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDictionaries()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Dictionaries(credentials, "LK.CUSTOMERS", "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Dictionaries(CredentialOptions credentialOptions, String filename,
        String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Dictionaries(credentialOptions, filename, DATAFORMAT_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Returns all the dictionaries of a file, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDictionaries()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Dictionaries(credentials, "LK.CUSTOMERS", "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Dictionaries(CredentialOptions credentialOptions, String filename,
        String customVars) throws Exception
    {
        return Dictionaries(credentialOptions, filename, customVars, 0);
    }
    
    /**
     * Returns all the dictionaries of a file, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDictionaries()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.Dictionaries(credentials, "LK.CUSTOMERS");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Dictionaries(CredentialOptions credentialOptions, String filename) throws Exception
    {
        return Dictionaries(credentialOptions, filename, "");
    }
    
    /* EXECUTE */

    /**
     * Allows the execution of any command from the Database in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyExecute()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.Execute(credentials, "WHO", "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param statement The command you want to execute in the Database.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Execute(CredentialOptions credentialOptions, String statement,
        String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.Execute(credentialOptions, statement, DATAFORMAT_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Allows the execution of any command from the Database in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyExecute()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.Execute(credentials, "WHO", "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param statement The command you want to execute in the Database.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Execute(CredentialOptions credentialOptions, String statement,
        String customVars) throws Exception
    {
        return Execute(credentialOptions, statement, customVars, 0);
    }
    
    /**
     * Allows the execution of any command from the Database in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyExecute()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.Execute(credentials, "WHO");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param statement The command you want to execute in the Database.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String Execute(CredentialOptions credentialOptions, String statement) throws Exception
    {
        return Execute(credentialOptions, statement, "");
    }
    
    /* GETVERSION */

    /**
     * Allows getting the server version, in a synchronous way with XML output format.
     * <p>
     * This function returns the following information
     * <ul>
     * <li>LKMVCOMPONENTSVERSION: MV Components version.</li>
     * <li>LKSERVERVERSION: Linkar SERVER version.</li>
     * <li>LKCLIENTVERSION: Used client library version.</li>
     * <li>DATABASE: Database.</li>
     * <li>OS: Operating system.</li>
     * <li>DATEZERO: Date zero base in YYYYMMDD format.</li>
     * <li>DATEOUTPUTCONVERSION: Output conversion for date used by Linkar Schemas.</li>
     * <li>TIMEOUTPUTCONVERSION: Output conversion for time used by Linkar Schemas.</li>
     * <li>MVDATETIMESEPARATOR: DateTime used separator used by Linkar Schemas, for instance 18325,23000.</li>
     * <li>MVBOOLTRUE: Database used char for the Boolean true value used by Linkar Schemas.</li>
     * <li>MVBOOLFALSE: Database used char for the Boolean false value used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLTRUE: Used char for the Boolean true value out of the database used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLFALSE: Used char for the Boolean false value out of the database used by Linkar Schemas.</li>
     * <li>MVDECIMALSEPARATOR: Decimal separator in the database. May be point, comma or none when the database does not store decimal numbers. Used by Linkar Schemas.</li>
     * <li>OTHERLANGUAGES: Languages list separated by commas.</li>
     * <li>TABLEROWSEPARATOR: It is the decimal char that you use to separate the rows in the output table format. By default 11.</li>
     * <li>TABLECOLSEPARATOR: It is the decimal char that you use to separate the columns in the output table format. By default 9.</li>
	 * <li>CONVERTNUMBOOLJSON: Switch to create numeric and boolean data in JSON strings. Default is false.</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyGetVersion()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.GetVersion(credentials, 60);		
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String GetVersion(CredentialOptions credentialOptions, int receiveTimeout) throws Exception
    {
        return DirectFunctions.GetVersion(credentialOptions, DATAFORMAT_TYPE.XML, receiveTimeout);
    }
    
    /**
     * Allows getting the server version, in a synchronous way with XML output format.
     * <p>
     * This function returns the following information
     * <ul>
     * <li>LKMVCOMPONENTSVERSION: MV Components version.</li>
     * <li>LKSERVERVERSION: Linkar SERVER version.</li>
     * <li>LKCLIENTVERSION: Used client library version.</li>
     * <li>DATABASE: Database.</li>
     * <li>OS: Operating system.</li>
     * <li>DATEZERO: Date zero base in YYYYMMDD format.</li>
     * <li>DATEOUTPUTCONVERSION: Output conversion for date used by Linkar Schemas.</li>
     * <li>TIMEOUTPUTCONVERSION: Output conversion for time used by Linkar Schemas.</li>
     * <li>MVDATETIMESEPARATOR: DateTime used separator used by Linkar Schemas, for instance 18325,23000.</li>
     * <li>MVBOOLTRUE: Database used char for the Boolean true value used by Linkar Schemas.</li>
     * <li>MVBOOLFALSE: Database used char for the Boolean false value used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLTRUE: Used char for the Boolean true value out of the database used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLFALSE: Used char for the Boolean false value out of the database used by Linkar Schemas.</li>
     * <li>MVDECIMALSEPARATOR: Decimal separator in the database. May be point, comma or none when the database does not store decimal numbers. Used by Linkar Schemas.</li>
     * <li>OTHERLANGUAGES: Languages list separated by commas.</li>
     * <li>TABLEROWSEPARATOR: It is the decimal char that you use to separate the rows in the output table format. By default 11.</li>
     * <li>TABLECOLSEPARATOR: It is the decimal char that you use to separate the columns in the output table format. By default 9.</li>
	 * <li>CONVERTNUMBOOLJSON: Switch to create numeric and boolean data in JSON strings. Default is false.</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyGetVersion()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.GetVersion(credentials);		
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String GetVersion(CredentialOptions credentialOptions) throws Exception
    {
        return GetVersion(credentialOptions, 0);
    }
    
    /* LKSCHEMAS */

    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemas()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkSchemasOptions options = new LkSchemasOptions();
	 *			result = Functions.LkSchemas(credentials, options, "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param lkSchemasOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkSchemas(CredentialOptions credentialOptions, LkSchemasOptions lkSchemasOptions,
         String customVars, int receiveTimeout) throws Exception
    {
        return DirectFunctions.LkSchemas(credentialOptions, lkSchemasOptions, DATAFORMATSCH_TYPE.XML, customVars, receiveTimeout);
    }
    
    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemas()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkSchemasOptions options = new LkSchemasOptions();
	 *			result = Functions.LkSchemas(credentials, options, "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param lkSchemasOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkSchemas(CredentialOptions credentialOptions, LkSchemasOptions lkSchemasOptions,
         String customVars) throws Exception
    {
        return LkSchemas(credentialOptions, lkSchemasOptions, customVars, 0);
    }
    
    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemas()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkSchemasOptions options = new LkSchemasOptions();
	 *			result = Functions.LkSchemas(credentials, options);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param lkSchemasOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkSchemas(CredentialOptions credentialOptions, LkSchemasOptions lkSchemasOptions) throws Exception
    {
        return LkSchemas(credentialOptions, lkSchemasOptions, "");
    }
    
    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemas()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.LkSchemas(credentials);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkSchemas(CredentialOptions credentialOptions) throws Exception
    {
        return LkSchemas(credentialOptions, null);
    }
    
    /* LKPROPERTIES */

    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkProperties()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkProperties(credentials, "LK.CUSTOMERS", options, XML_FORMAT.XML, "", 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkProperties(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    {
		DATAFORMATSCHPROP_TYPE outputFormat = DATAFORMATSCHPROP_TYPE.XML;
		if(xmlFormat == XML_FORMAT.XML_DICT)
			outputFormat = DATAFORMATSCHPROP_TYPE.XML_DICT;
		else if(xmlFormat == XML_FORMAT.XML_SCH)
			outputFormat = DATAFORMATSCHPROP_TYPE.XML_SCH;
		
        return DirectFunctions.LkProperties(credentialOptions, filename, lkPropertiesOptions, outputFormat, customVars, receiveTimeout);
    }
    
    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkProperties()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkProperties(credentials, "LK.CUSTOMERS", options, XML_FORMAT.XML, "");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkProperties(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    {
        return LkProperties(credentialOptions, filename, lkPropertiesOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkProperties()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkProperties(credentials, "LK.CUSTOMERS", options, XML_FORMAT.XML);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkProperties(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions,
		XML_FORMAT xmlFormat) throws Exception
    {
        return LkProperties(credentialOptions, filename, lkPropertiesOptions, xmlFormat, "");
    }

    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkProperties()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkProperties(credentials, "LK.CUSTOMERS",options);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkProperties(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions) throws Exception
    {
        return LkProperties(credentialOptions, filename, lkPropertiesOptions, XML_FORMAT.XML);
    }
    
    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkProperties()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.LkProperties(credentials, "LK.CUSTOMERS");			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @return The results of the operation.
     * @throws Exception
     */
    public static String LkProperties(CredentialOptions credentialOptions, String filename) throws Exception
    {
        return LkProperties(credentialOptions, filename, null);
    }    
    
    /* RESETCOMMONBLOCKS */

    /**
     * Resets the COMMON variables with the 100 most used files in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyResetCommonBlocks()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.ResetCommonBlocks(credentials, 60);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     * @throws Exception
     */
    public static String ResetCommonBlocks(CredentialOptions credentialOptions, int receiveTimeout) throws Exception
    {
        return DirectFunctions.ResetCommonBlocks(credentialOptions, DATAFORMAT_TYPE.XML, receiveTimeout);
    }
    
    /**
     * Resets the COMMON variables with the 100 most used files in a synchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyResetCommonBlocks()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.ResetCommonBlocks(credentials);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @return The results of the operation.
     * @throws Exception
     */
    public static String ResetCommonBlocks(CredentialOptions credentialOptions) throws Exception
    {
        return ResetCommonBlocks(credentialOptions, 0);
    }
    
    
    /* = ASYNC = */
    
/* READ */
	
	/**
	 * Reads one or several records of a file in a asynchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyReadAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.ReadAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options, XML_FORMAT.XML, "", 60).getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
	 * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviors in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
	 * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static CompletableFuture<String> ReadAsync(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout) throws Exception
    { 	   	
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Read(credentialOptions, filename, records, dictionaries, readOptions, xmlFormat, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
	/**
	 * Reads one or several records of a file in a asynchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyReadAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.ReadAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options, XML_FORMAT.XML, "").getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
	 * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviors in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static CompletableFuture<String> ReadAsync(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions,
        XML_FORMAT xmlFormat, String customVars) throws Exception
    { 	   	
    	return ReadAsync(credentialOptions, filename, records, dictionaries, readOptions, xmlFormat, customVars, 0);
    }
    
	/**
	 * Reads one or several records of a file in a asynchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyReadAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.ReadAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options, XML_FORMAT.XML).getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static CompletableFuture<String> ReadAsync(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions,
        XML_FORMAT xmlFormat) throws Exception
    { 	   	
    	return ReadAsync(credentialOptions, filename, records, dictionaries, readOptions, xmlFormat, "");
    }
    
	/**
	 * Reads one or several records of a file in a asynchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyReadAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			ReadOptions options = new ReadOptions(true);
	 * 			result = Functions.ReadAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"",options).getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @param readOptions Object that defines the different reading options of the Function: Calculated, dictClause, conversion, formatSpec, originalRecords.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static CompletableFuture<String> ReadAsync(CredentialOptions credentialOptions, String filename, String records, String dictionaries, ReadOptions readOptions) throws Exception
    { 	   	
    	return ReadAsync(credentialOptions, filename, records, dictionaries, readOptions, XML_FORMAT.XML);
    }
    
	/**
	 * Reads one or several records of a file in a asynchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyReadAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			result = Functions.ReadAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"").getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read
	 * @param records It's the records codes list to read.
	 * @param dictionaries List of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. You may use the format LKFLDx where x is the attribute number.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static CompletableFuture<String> ReadAsync(CredentialOptions credentialOptions, String filename, String records, String dictionaries) throws Exception
    { 	   	
    	return ReadAsync(credentialOptions, filename, records, dictionaries, null);
    }
    
	/**
	 * Reads one or several records of a file in a asynchronous way with XML input and output format.
	 * <p>
	 * Example:
	 * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyReadAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			result = Functions.ReadAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;").getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
	 * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
	 * @param filename File name to read
	 * @param records It's the records codes list to read.
	 * @return The results of the operation.
	 * @throws Exception
	 */
    public static CompletableFuture<String> ReadAsync(CredentialOptions credentialOptions, String filename, String records) throws Exception
    { 	   	
    	return ReadAsync(credentialOptions, filename, records, "");
    }
    
    /* UPDATE */
    
    /**
     * Update one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdateAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdateAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdateAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Update(credentialOptions, filename, records, updateOptions, xmlFormat, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Update one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdateAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdateAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdateAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars)
    {
    	return UpdateAsync(credentialOptions, filename, records, updateOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Update one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdateAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdateAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdateAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat)
    {
    	return UpdateAsync(credentialOptions, filename, records, updateOptions, xmlFormat, "");
    }
    
    /**
     * Update one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdateAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdateAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdateAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions)
    {
    	return UpdateAsync(credentialOptions, filename, records, updateOptions, XML_FORMAT.XML);
    }
    
    /**
     * Update one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdateAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdateAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdateAsync(CredentialOptions credentialOptions, String filename, String records)
    {
    	return UpdateAsync(credentialOptions, filename, records, null);
    }
    
    /* UPDATEPARTIAL */
    
    /**
     * Update one or more attributes of one or more file records, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartialAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartialAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdatePartialAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.UpdatePartial(credentialOptions, filename, records, updateOptions, xmlFormat, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Update one or more attributes of one or more file records, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartialAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartialAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdatePartialAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat, String customVars)
    {
    	return UpdatePartialAsync(credentialOptions, filename, records, updateOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Update one or more attributes of one or more file records, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartialAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartialAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdatePartialAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions,
        XML_FORMAT xmlFormat)
    {
    	return UpdatePartialAsync(credentialOptions, filename, records, updateOptions, xmlFormat, "");
    }
    
    /**
     * Update one or more attributes of one or more file records, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartialAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartialAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @param updateOptions Object that defines the different writing options of the Function: optimisticLockControl, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdatePartialAsync(CredentialOptions credentialOptions, String filename, String records, UpdateOptions updateOptions)
    {
    	return UpdatePartialAsync(credentialOptions, filename, records, updateOptions, XML_FORMAT.XML);
    }
    
    /**
     * Update one or more attributes of one or more file records, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds and the modified records always must be specified. But the originalRecords not always.
     * When {@link UpdateOptions} argument is specified and the {@link UpdateOptions#getOptimisticLockControl} property is set to true, a copy of the record must be provided before the modification (originalRecords argument)
     * to use the Optimistic Lock technique. This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the modification, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the modified record is executed.
     * But if they are not equal, it means that the record has been modified by other user and its modification will not be saved.
     * The record will have to be read, modified and saved again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyUpdatePartialAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 1300, "admin", "admin");
	 *			UpdateOptions options = new UpdateOptions();
	 *			result = Functions.UpdatePartialAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to update. Inside this String are the recordIds, the records, and the originalRecords.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> UpdatePartialAsync(CredentialOptions credentialOptions, String filename, String records)
    {
    	return UpdatePartialAsync(credentialOptions, filename, records, null);
    }
    
    /* NEW */

    /**
     * Creates one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNewAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.NewAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "", 60).getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> NewAsync(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.New(credentialOptions, filename, records, newOptions, xmlFormat, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Creates one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNewAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.NewAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML, "").getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> NewAsync(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions,
        XML_FORMAT xmlFormat, String customVars)
    {
    	return NewAsync(credentialOptions, filename, records, newOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Creates one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNewAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.NewAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options, XML_FORMAT.XML).getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> NewAsync(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions,
        XML_FORMAT xmlFormat)
    {
    	return NewAsync(credentialOptions, filename, records, newOptions, xmlFormat, "");
    }
    
    /**
     * Creates one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNewAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			NewOptions options = new NewOptions();
	 * 			result = Functions.NewAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 *			options).getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @param newOptions Object that defines the following writing options of the Function: recordIdType, readAfter, calculated, dictionaries, conversion, formatSpec, originalRecords.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> NewAsync(CredentialOptions credentialOptions, String filename, String records, NewOptions newOptions)
    {
    	return NewAsync(credentialOptions, filename, records, newOptions, XML_FORMAT.XML);
    }
    
    /**
     * Creates one or several records of a file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the records always must be specified. But the recordIds only must be specified when {@link NewOptions} argument is null, or when the {@link RecordIdType} argument of the {@link NewOptions} constructor is null.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 * 	
	 * 	public String MyNewAsync()
	 * 	{
	 * 		String result = "";
	 * 		try{
	 * 			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 * 			result = Functions.NewAsync(credentials, "LK.CUSTOMERS",
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"      &lt;NAME&gt;CUSTOMER 2&lt;/NAME&gt;" +
	 * 			"      &lt;ADDR&gt;ADDRESS 2&lt;/ADDR&gt;" +
	 * 			"      &lt;PHONE&gt;444&lt;/PHONE&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;").getNow(result);			
	 * 		}
	 * 		catch (Exception ex)
	 * 		{
	 * 			String error = ex.getMessage();
	 * 			// Do something
	 * 		}
	 * 		return result;
	 * 	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where you are going to write.
     * @param records Are the records you want to write. Inside this String are the recordIds, and the records.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> NewAsync(CredentialOptions credentialOptions, String filename, String records)
    {
    	return NewAsync(credentialOptions, filename, records, null);
    }
    
    /* DELETE */

    /**
     * Deletes one or several records in file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDeleteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			DeleteOptions options = new DeleteOptions();
	 *			result = Functions.DeleteAsync(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			options, "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @param deleteOptions Object that defines the different Function options: optimisticLockControl, recoverRecordIdType.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DeleteAsync(CredentialOptions credentialOptions, String filename, String records, DeleteOptions deleteOptions,
        String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Delete(credentialOptions, filename, records, deleteOptions, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Deletes one or several records in file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDeleteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			DeleteOptions options = new DeleteOptions();
	 *			result = Functions.DeleteAsync(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			options, "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @param deleteOptions Object that defines the different Function options: optimisticLockControl, recoverRecordIdType.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DeleteAsync(CredentialOptions credentialOptions, String filename, String records, DeleteOptions deleteOptions,
        String customVars)
    {
    	return DeleteAsync(credentialOptions, filename, records, deleteOptions, customVars, 0);
    }
    
    /**
     * Deletes one or several records in file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDeleteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			DeleteOptions options = new DeleteOptions();
	 *			result = Functions.DeleteAsync(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			options).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @param deleteOptions Object that defines the different Function options: optimisticLockControl, recoverRecordIdType.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DeleteAsync(CredentialOptions credentialOptions, String filename, String records, DeleteOptions deleteOptions)
    {
    	return DeleteAsync(credentialOptions, filename, records, deleteOptions, "");
    }
    
    /**
     * Deletes one or several records in file, in a asynchronous way with XML input and output format.
     * <p>
     * Inside the records argument, the recordIds always must be specified. But the originalRecords not always.
     * When {@link DeleteOptions} argument is specified and the {@link DeleteOptions#getOptimisticLockControl} property is set to true,
     * a copy of the record must be provided before the deletion (originalRecords argument) to use the Optimistic Lock technique.
     * This copy can be obtained from a previous {@link #ReadAsync} operation. The database, before executing the deletion, 
     * reads the record and compares it with the copy in originalRecords, if they are equal the record is deleted.
     * But if they are not equal, it means that the record has been modified by other user and the record will not be deleted.
     * The record will have to be read, and deleted again.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDeleteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.DeleteAsync(credentials,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" + 
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;RECORDS&gt;" +
	 * 			"    &lt;RECORD&gt;" +
	 * 			"      &lt;LKITEMID&gt;2&lt;/LKITEMID&gt;" +
	 * 			"    &lt;/RECORD&gt;" +
	 * 			"  &lt;/RECORDS&gt;" +
	 * 			"&lt;/LINKAR&gt;").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename It's the file name where the records are going to be deleted. DICT in case of deleting a record that belongs to a dictionary.
     * @param records It's the records list to be deleted.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DeleteAsync(CredentialOptions credentialOptions, String filename, String records)
    {
    	return DeleteAsync(credentialOptions, filename, records, null);
    }
    
    /* SELECT */

    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","","","", options, XML_FORMAT.XML, "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Select(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, xmlFormat, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","","","", options, XML_FORMAT.XML, "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions,
        XML_FORMAT xmlFormat, String customVars)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, xmlFormat, customVars, 0);
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","","","", options, XML_FORMAT.XML).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions,
        XML_FORMAT xmlFormat)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, xmlFormat, "");
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			SelectOptions options = new SelectOptions();
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","","","", options).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @param selectOptions Object that defines the different reading options of the Function: calculated, dictionaries, conversion, formatSpec, originalRecords, onlyItemId, pagination, regPage, numPage.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause, SelectOptions selectOptions)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, selectOptions, XML_FORMAT.XML);
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","","","").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @param preSelectClause It's an optional statement that will execute before the main Select
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause, String preSelectClause)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, sortClause, dictClause, preSelectClause, null);
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","","").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @param dictClause Is the list of dictionaries to read, separated by space. If dictionaries are not indicated the function will read the complete buffer. For example CUSTOMER DATE ITEM. You may use the format LKFLDx where x is the attribute number.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause, String dictClause)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, sortClause, dictClause, "");
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "","").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @param sortClause Fragment of the phrase that indicates the selection order. If there is a selection rule, Linkar will execute a SSELECT, otherwise Linkar will execute a SELECT. For example BY CUSTOMER
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause, String sortClause)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, sortClause, "");
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS", "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @param selectClause Fragment of the phrase that indicate the selection condition. For example WITH CUSTOMER = '1'
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename, String selectClause)
    {
    	return SelectAsync(credentialOptions, filename, selectClause, "");
    }
    
    /**
     * Executes a Query in the Database, in a asynchronous way with XML output format.
     * <p>
     * In the preSelectClause argument these operations can be carried out before executing the Select statement:
     * <ul>
     *   <li>Previously call to a saved list with the GET.LIST command to use it in the Main Select input</li>
     *   <li>Make a previous Select to use the result as the Main Select input, with the SELECT or SSELECT commands.In this case the entire sentence must be indicated in the PreselectClause. For example:SSELECT LK.ORDERS WITH CUSTOMER = '1'</li>
     *   <li>Exploit a Main File index to use the result as a Main Select input, with the SELECTINDEX command. The syntax for all the databases is SELECTINDEX index.name.value. For example SELECTINDEX ITEM,"101691"</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySelectAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.SelectAsync(credentials, "LK.CUSTOMERS").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name where the select operation will be perform. For example LK.ORDERS
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SelectAsync(CredentialOptions credentialOptions, String filename)
    {
    	return SelectAsync(credentialOptions, filename, "");
    }
    
    /* SUBROUTINE */

    /**
     * Executes a subroutine, in a asynchronous way with XML input and output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySubroutineAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");	
	 *			result = Functions.SubroutineAsync(credentials, "SUB.DEMOLINKAR", 3,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;ARGUMENTS&gt;" +
	 * 			"    &lt;ARGUMENT&gt;0&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;aaaa&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;&lt;/ARGUMENT&gt;" +
	 * 			"  &lt;/ARGUMENTS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param subroutineName Subroutine name you want to execute.
     * @param argsNumber Number of arguments
     * @param arguments The subroutine arguments list.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SubroutineAsync(CredentialOptions credentialOptions, String subroutineName, int argsNumber, String arguments,
        String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Subroutine(credentialOptions, subroutineName, argsNumber, arguments, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Executes a subroutine, in a asynchronous way with XML input and output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySubroutineAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");	
	 *			result = Functions.SubroutineAsync(credentials, "SUB.DEMOLINKAR", 3,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;ARGUMENTS&gt;" +
	 * 			"    &lt;ARGUMENT&gt;0&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;aaaa&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;&lt;/ARGUMENT&gt;" +
	 * 			"  &lt;/ARGUMENTS&gt;" +
	 * 			"&lt;/LINKAR&gt;",
	 * 			"").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param subroutineName Subroutine name you want to execute.
     * @param argsNumber Number of arguments
     * @param arguments The subroutine arguments list.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SubroutineAsync(CredentialOptions credentialOptions, String subroutineName, int argsNumber, String arguments,
        String customVars)
    {
    	return SubroutineAsync(credentialOptions, subroutineName, argsNumber, arguments, customVars, 0);
    }
    
    /**
     * Executes a subroutine, in a asynchronous way with XML input and output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MySubroutineAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");	
	 *			result = Functions.SubroutineAsync(credentials, "SUB.DEMOLINKAR", 3,
	 * 			"&lt;?xml version=\"1.0\" encoding=\"utf-16\"?&gt;" +
	 * 			"&lt;LINKAR&gt;" +
	 * 			"  &lt;ARGUMENTS&gt;" +
	 * 			"    &lt;ARGUMENT&gt;0&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;aaaa&lt;/ARGUMENT&gt;" +
	 * 			"    &lt;ARGUMENT&gt;&lt;/ARGUMENT&gt;" +
	 * 			"  &lt;/ARGUMENTS&gt;" +
	 * 			"&lt;/LINKAR&gt;").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param subroutineName Subroutine name you want to execute.
     * @param argsNumber Number of arguments
     * @param arguments The subroutine arguments list.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> SubroutineAsync(CredentialOptions credentialOptions, String subroutineName, int argsNumber, String arguments)
    {
    	return SubroutineAsync(credentialOptions, subroutineName, argsNumber, arguments, "");
    }
    
    /* CONVERSION */

    /**
     * Returns the result of executing ICONV() or OCONV() functions from a expression list in the Database, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyConversionAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.ConversionAsync(credentials, CONVERSION_TYPE.INPUT,"31-12-2017�01-01-2018","D2-", "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param conversionType Indicates the conversion type, input or output: Input=ICONV(); OUTPUT=OCONV()
     * @param expression The data or expression to convert. It can have MV marks, in which case the conversion will execute in each value obeying the original MV mark.
     * @param code The conversion code. It will have to obey the Database conversions specifications.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ConversionAsync(CredentialOptions credentialOptions, CONVERSION_TYPE conversionType, String expression, String code,
        String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Conversion(credentialOptions, conversionType, expression, code, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Returns the result of executing ICONV() or OCONV() functions from a expression list in the Database, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyConversionAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.ConversionAsync(credentials, CONVERSION_TYPE.INPUT,"31-12-2017�01-01-2018","D2-", "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param conversionType Indicates the conversion type, input or output: Input=ICONV(); OUTPUT=OCONV()
     * @param expression The data or expression to convert. It can have MV marks, in which case the conversion will execute in each value obeying the original MV mark.
     * @param code The conversion code. It will have to obey the Database conversions specifications.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ConversionAsync(CredentialOptions credentialOptions, CONVERSION_TYPE conversionType, String expression, String code,
        String customVars)
    {
    	return ConversionAsync(credentialOptions, conversionType, expression, code, customVars, 0);
    }
    
    /**
     * Returns the result of executing ICONV() or OCONV() functions from a expression list in the Database, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyConversionAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.ConversionAsync(credentials, CONVERSION_TYPE.INPUT,"31-12-2017�01-01-2018","D2-").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param conversionType Indicates the conversion type, input or output: Input=ICONV(); OUTPUT=OCONV()
     * @param expression The data or expression to convert. It can have MV marks, in which case the conversion will execute in each value obeying the original MV mark.
     * @param code The conversion code. It will have to obey the Database conversions specifications.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ConversionAsync(CredentialOptions credentialOptions, CONVERSION_TYPE conversionType, String expression, String code)
    {
    	return ConversionAsync(credentialOptions, conversionType, expression, code, "");
    }
    
    /* FORMAT */

    /**
     * Returns the result of executing the FMT function in a expressions list in the Database, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyFormatAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.FormatAsync(credentials, "1�2","R#10", "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param expression The data or expression to format. It can contain MV marks, in which case the conversion in each value will be executed according to the original MV mark.
     * @param formatSpec Specified format
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> FormatAsync(CredentialOptions credentialOptions, String expression, String formatSpec,
        String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Format(credentialOptions, expression, formatSpec, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Returns the result of executing the FMT function in a expressions list in the Database, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyFormatAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.FormatAsync(credentials, "1�2","R#10", "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param expression The data or expression to format. It can contain MV marks, in which case the conversion in each value will be executed according to the original MV mark.
     * @param formatSpec Specified format
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> FormatAsync(CredentialOptions credentialOptions, String expression, String formatSpec,
        String customVars)
    {
    	return FormatAsync(credentialOptions, expression, formatSpec, customVars, 0);
    }
    
    /**
     * Returns the result of executing the FMT function in a expressions list in the Database, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyFormatAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");		
	 *			result = Functions.FormatAsync(credentials, "1�2","R#10").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param expression The data or expression to format. It can contain MV marks, in which case the conversion in each value will be executed according to the original MV mark.
     * @param formatSpec Specified format
     * @return The results of the operation.
     */
    public static CompletableFuture<String> FormatAsync(CredentialOptions credentialOptions, String expression, String formatSpec)
    {
    	return FormatAsync(credentialOptions, expression, formatSpec, "");
    }
    
    /* DICTIONARIES */

    /**
     * Returns all the dictionaries of a file, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDictionariesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.DictionariesAsync(credentials, "LK.CUSTOMERS", "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DictionariesAsync(CredentialOptions credentialOptions, String filename,
        String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Dictionaries(credentialOptions, filename, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Returns all the dictionaries of a file, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDictionariesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.DictionariesAsync(credentials, "LK.CUSTOMERS", "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DictionariesAsync(CredentialOptions credentialOptions, String filename,
        String customVars)
    {
    	return DictionariesAsync(credentialOptions, filename, customVars, 0);
    }
    
    /**
     * Returns all the dictionaries of a file, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyDictionariesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.DictionariesAsync(credentials, "LK.CUSTOMERS").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name
     * @return The results of the operation.
     */
    public static CompletableFuture<String> DictionariesAsync(CredentialOptions credentialOptions, String filename)
    {
    	return DictionariesAsync(credentialOptions, filename, "");
    }
    
    /* EXECUTE */

    /**
     * Allows the execution of any command from the Database in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyExecuteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.ExecuteAsync(credentials, "WHO", "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param statement The command you want to execute in the Database.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ExecuteAsync(CredentialOptions credentialOptions, String statement,
        String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.Execute(credentialOptions, statement, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Allows the execution of any command from the Database in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyExecuteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.ExecuteAsync(credentials, "WHO", "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param statement The command you want to execute in the Database.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ExecuteAsync(CredentialOptions credentialOptions, String statement,
        String customVars)
    {
    	return ExecuteAsync(credentialOptions, statement, customVars, 0);
    }
    
    /**
     * Allows the execution of any command from the Database in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyExecuteAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.ExecuteAsync(credentials, "WHO").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param statement The command you want to execute in the Database.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ExecuteAsync(CredentialOptions credentialOptions, String statement)
    {
    	return ExecuteAsync(credentialOptions, statement, "");
    }
    
    /* GETVERSION */

    /**
     * Allows getting the server version, in a asynchronous way with XML output format.
     * <p>
     * This function returns the following information
     * <ul>
     * <li>LKMVCOMPONENTSVERSION: MV Components version.</li>
     * <li>LKSERVERVERSION: Linkar SERVER version.</li>
     * <li>LKCLIENTVERSION: Used client library version.</li>
     * <li>DATABASE: Database.</li>
     * <li>OS: Operating system.</li>
     * <li>DATEZERO: Date zero base in YYYYMMDD format.</li>
     * <li>DATEOUTPUTCONVERSION: Output conversion for date used by Linkar Schemas.</li>
     * <li>TIMEOUTPUTCONVERSION: Output conversion for time used by Linkar Schemas.</li>
     * <li>MVDATETIMESEPARATOR: DateTime used separator used by Linkar Schemas, for instance 18325,23000.</li>
     * <li>MVBOOLTRUE: Database used char for the Boolean true value used by Linkar Schemas.</li>
     * <li>MVBOOLFALSE: Database used char for the Boolean false value used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLTRUE: Used char for the Boolean true value out of the database used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLFALSE: Used char for the Boolean false value out of the database used by Linkar Schemas.</li>
     * <li>MVDECIMALSEPARATOR: Decimal separator in the database. May be point, comma or none when the database does not store decimal numbers. Used by Linkar Schemas.</li>
     * <li>OTHERLANGUAGES: Languages list separated by commas.</li>
     * <li>TABLEROWSEPARATOR: It is the decimal char that you use to separate the rows in the output table format. By default 11.</li>
     * <li>TABLECOLSEPARATOR: It is the decimal char that you use to separate the columns in the output table format. By default 9.</li>
	 * <li>CONVERTNUMBOOLJSON: Switch to create numeric and boolean data in JSON strings. Default is false.</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyGetVersionAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.GetVersionAsync(credentials, 60).getNow(result);		
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> GetVersionAsync(CredentialOptions credentialOptions, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.GetVersion(credentialOptions, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Allows getting the server version, in a asynchronous way with XML output format.
     * <p>
     * This function returns the following information
     * <ul>
     * <li>LKMVCOMPONENTSVERSION: MV Components version.</li>
     * <li>LKSERVERVERSION: Linkar SERVER version.</li>
     * <li>LKCLIENTVERSION: Used client library version.</li>
     * <li>DATABASE: Database.</li>
     * <li>OS: Operating system.</li>
     * <li>DATEZERO: Date zero base in YYYYMMDD format.</li>
     * <li>DATEOUTPUTCONVERSION: Output conversion for date used by Linkar Schemas.</li>
     * <li>TIMEOUTPUTCONVERSION: Output conversion for time used by Linkar Schemas.</li>
     * <li>MVDATETIMESEPARATOR: DateTime used separator used by Linkar Schemas, for instance 18325,23000.</li>
     * <li>MVBOOLTRUE: Database used char for the Boolean true value used by Linkar Schemas.</li>
     * <li>MVBOOLFALSE: Database used char for the Boolean false value used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLTRUE: Used char for the Boolean true value out of the database used by Linkar Schemas.</li>
     * <li>OUTPUTBOOLFALSE: Used char for the Boolean false value out of the database used by Linkar Schemas.</li>
     * <li>MVDECIMALSEPARATOR: Decimal separator in the database. May be point, comma or none when the database does not store decimal numbers. Used by Linkar Schemas.</li>
     * <li>OTHERLANGUAGES: Languages list separated by commas.</li>
     * <li>TABLEROWSEPARATOR: It is the decimal char that you use to separate the rows in the output table format. By default 11.</li>
     * <li>TABLECOLSEPARATOR: It is the decimal char that you use to separate the columns in the output table format. By default 9.</li>
	 * <li>CONVERTNUMBOOLJSON: Switch to create numeric and boolean data in JSON strings. Default is false.</li>
     * </ul>
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyGetVersionAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");			
	 *			result = Functions.GetVersionAsync(credentials).getNow(result);		
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> GetVersionAsync(CredentialOptions credentialOptions)
    {
    	return GetVersionAsync(credentialOptions, 0);
    }
    
    /* LKSCHEMAS */

    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemasAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkSchemasOptions options = new LkSchemasOptions();
	 *			result = Functions.LkSchemasAsync(credentials, options, "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param lkSchemasOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkSchemasAsync(CredentialOptions credentialOptions, LkSchemasOptions lkSchemasOptions,
         String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.LkSchemas(credentialOptions, lkSchemasOptions, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemasAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkSchemasOptions options = new LkSchemasOptions();
	 *			result = Functions.LkSchemasAsync(credentials, options, "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param lkSchemasOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkSchemasAsync(CredentialOptions credentialOptions, LkSchemasOptions lkSchemasOptions,
         String customVars)
    {
    	return LkSchemasAsync(credentialOptions, lkSchemasOptions, customVars, 0);
    }
    
    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemasAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkSchemasOptions options = new LkSchemasOptions();
	 *			result = Functions.LkSchemasAsync(credentials, options).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param lkSchemasOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkSchemasAsync(CredentialOptions credentialOptions, LkSchemasOptions lkSchemasOptions)
    {
    	return LkSchemasAsync(credentialOptions, lkSchemasOptions, "");
    }
    
    /**
     * Returns a list of all the Schemas defined in Linkar Schemas, or the EntryPoint account data files, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkSchemasAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.LkSchemasAsync(credentials).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkSchemasAsync(CredentialOptions credentialOptions)
    {
    	return LkSchemasAsync(credentialOptions, null);
    }
    
    /* LKPROPERTIES */

    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkPropertiesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkPropertiesAsync(credentials, "LK.CUSTOMERS",options, "", 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkPropertiesAsync(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions,
        XML_FORMAT xmlFormat, String customVars, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.LkProperties(credentialOptions, filename, lkPropertiesOptions, xmlFormat, customVars, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkPropertiesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkPropertiesAsync(credentials, "LK.CUSTOMERS",options, "").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @param customVars It's a free text that will travel until the database to make the admin being able to manage additional behaviours in the standard routine SUB.LK.MAIN.CONTROL.CUSTOM. This routine will be called if the argument has content.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkPropertiesAsync(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions,
        XML_FORMAT xmlFormat, String customVars)
    {
    	return LkPropertiesAsync(credentialOptions, filename, lkPropertiesOptions, xmlFormat, customVars, 0);
    }

    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkPropertiesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkPropertiesAsync(credentials, "LK.CUSTOMERS",options).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
	 * @param xmlFormat Specifies the desired output format: standard XML, XML_DICT format, or XML_SCH format.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkPropertiesAsync(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions,
		XML_FORMAT xmlFormat)
    {
    	return LkPropertiesAsync(credentialOptions, filename, lkPropertiesOptions, xmlFormat, "");
    }
    
    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkPropertiesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkPropertiesAsync(credentials, "LK.CUSTOMERS", options, XML_FORMAT.XML).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @param lkPropertiesOptions This object defines the different options in base of the asked Schema Type: LKSCHEMAS, SQLMODE o DICTIONARIES.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkPropertiesAsync(CredentialOptions credentialOptions, String filename, LkPropertiesOptions lkPropertiesOptions)
    {
    	return LkPropertiesAsync(credentialOptions, filename, lkPropertiesOptions, XML_FORMAT.XML, "");
    }
    
    /**
     * Returns the Schema properties list defined in Linkar Schemas or the file dictionaries, in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyLkPropertiesAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			LkPropertiesOptions options = new LkPropertiesOptions();
	 *			result = Functions.LkPropertiesAsync(credentials, "LK.CUSTOMERS").getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param filename File name to LkProperties
     * @return The results of the operation.
     */
    public static CompletableFuture<String> LkPropertiesAsync(CredentialOptions credentialOptions, String filename)
    {
    	return LkPropertiesAsync(credentialOptions, filename, null);
    }
    
    /* RESETCOMMONBLOCKS */

    /**
     * Resets the COMMON variables with the 100 most used files in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyResetCommonBlocksAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.ResetCommonBlocksAsync(credentials, 60).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @param receiveTimeout It's the maximum time in seconds that the client will keep waiting the answer by the server. By default 0 (wait indefinitely).
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ResetCommonBlocksAsync(CredentialOptions credentialOptions, int receiveTimeout)
    {
    	return CompletableFuture.supplyAsync(() -> {
				try {
					return Functions.ResetCommonBlocks(credentialOptions, receiveTimeout);
				} catch (Exception e) {
					throw new CompletionException(e);
				}
		});
    }
    
    /**
     * Resets the COMMON variables with the 100 most used files in a asynchronous way with XML output format.
     * <p>
	 * Example:
     * <pre>
	 * import linkar.*;
	 * import linkar.functions.*;
	 * import linkar.functions.direct.xml.*;
	 * 
	 * public class Test {
	 *	
	 *	public String MyResetCommonBlocksAsync()
	 *	{
	 *		String result = "";
	 *		try{
	 *			CredentialOptions credentials = new CredentialOptions("127.0.0.1", "EPNAME", 11300, "admin", "admin");
	 *			result = Functions.ResetCommonBlocksAsync(credentials).getNow(result);			
	 *		}
	 *		catch (Exception ex)
	 *		{
	 *			String error = ex.getMessage();
	 *			// Do something
	 *		}
	 *		return result;
	 *	}
	 * }
	 * </pre>
     * @param credentialOptions Object that defines the necessary data to access to the Linkar Server: Username, Password, EntryPoint, Language, FreeText.
     * @return The results of the operation.
     */
    public static CompletableFuture<String> ResetCommonBlocksAsync(CredentialOptions credentialOptions)
    {
    	return ResetCommonBlocksAsync(credentialOptions, 0);
    }
}
