/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2008 e-Evolution,SC. All Rights Reserved.               *
 * Contributor(s): Oscar Gómez  www.e-evolution.com                           *
 * Contributor(s): Victor Perez www.e-evolution.com                           *
 *****************************************************************************/
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 *	MHRYear Year for a Payroll
 *	
 *  @author oscar.gomez@e-evolution.com, e-Evolution http://www.e-evolution.com
 *			<li> Original contributor of Payroll Functionality
 *  @author victor.perez@e-evolution.com, e-Evolution http://www.e-evolution.com
 * 			<li> FR [ 2520591 ] Support multiples calendar for Org 
 *			@see http://sourceforge.net/tracker2/?func=detail&atid=879335&aid=2520591&group_id=176962
 *
 *	@author Cristina Ghita, www.arhipac.ro
 * 			<li> BUG [ 1932959 ]
 * 			@see https://sourceforge.net/tracker/index.php?func=detail&aid=1932959&group_id=176962&atid=934929
 * 	@author Yamel Senih, ysenih@erpya.com , http://www.erpya.com
 * 			Add Time and Attendance Record integration
 */
public class MHRYear extends org.eevolution.hr.model.MHRYear {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7789699154024839462L;

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param HR_Payroll_ID id
	 */
	public MHRYear (Properties ctx, int HR_Year_ID, String trxName)
	{
		super (ctx, HR_Year_ID, trxName);
		if (HR_Year_ID == 0)
		{
			setProcessing (false);	// N
		}		
	}	//	HRYear

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MHRYear (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}
}	//	HRYear
