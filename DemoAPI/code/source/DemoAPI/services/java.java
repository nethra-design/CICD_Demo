package DemoAPI.services;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.StringBufferInputStream;
import java.lang.*;
// --- <<IS-END-IMPORTS>> ---

public final class java

{
	// ---( internal utility methods )---

	final static java _instance = new java();

	static java _newInstance() { return new java(); }

	static java _cast(Object o) { return (java)o; }

	// ---( server methods )---




	public static final void intToString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(intToString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required integer
		// [o] field:0:required string
		IDataCursor idc = pipeline.getCursor();
		
		String s;
		
		try {
			int i = IDataUtil.getInt(idc, "integer", -1);
			s = String.valueOf(i);
		
		} catch (Exception e) {
			throw new ServiceException(e);
		}
		
		idc.insertAfter("string", s);
		idc.destroy();
			
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	//Used by "multiConcat"
		private static String checkNull(String inputString)
		{
			if( inputString == null )
				return "";
			else
				return inputString;
		}
		
	
	public static boolean isNullOrBlank(String s) {
		if (s==null || s.trim().length()==0)
			return true;
		return false;
	}
	public static String[] splitByNumber(String str, int size) {
	    return (size<1 || str==null) ? null : str.split("(?<=\\G.{"+size+"})");
	}
	// --- <<IS-END-SHARED>> ---
}

