/**
 * 
 */
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * HR Period
 * @author Teo Sarca, www.arhipac.ro
 */
public class MHRPeriod extends org.eevolution.hr.model.MHRPeriod
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7787966459848200539L;

	public MHRPeriod(Properties ctx, int HR_Period_ID, String trxName)
	{
		super(ctx, HR_Period_ID, trxName);
	}
	public MHRPeriod(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}

}
