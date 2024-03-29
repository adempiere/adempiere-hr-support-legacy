/*************************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                              *
 * This program is free software; you can redistribute it and/or modify it    		 *
 * under the terms version 2 or later of the GNU General Public License as published *
 * by the Free Software Foundation. This program is distributed in the hope   		 *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied 		 *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           		 *
 * See the GNU General Public License for more details.                       		 *
 * You should have received a copy of the GNU General Public License along    		 *
 * with this program; if not, write to the Free Software Foundation, Inc.,    		 *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     		 *
 * For the text or an alternative of this public license, you may reach us    		 *
 * Copyright (C) 2012-2018 E.R.P. Consultores y Asociados, S.A. All Rights Reserved. *
 * Contributor(s): Yamel Senih www.erpya.com				  		                 *
 *************************************************************************************/
package org.spin.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Attendance Record
 * @author yamel, ysenih@erpya.com , http://www.erpya.com
 * <li> FR [ 1834 ] HR Attendance: Define E-R Model
 * @see https://github.com/adempiere/adempiere/issues/1834
 */
public class MHRAttendanceRecord extends org.spin.tar.model.MHRAttendanceRecord {

	/**
	 * 
	 */
	private static final long serialVersionUID = 37541827768100687L;

	public MHRAttendanceRecord(Properties ctx, int HR_AttendanceRecord_ID, String trxName) {
		super(ctx, HR_AttendanceRecord_ID, trxName);
		
	}
	
    /** Load Constructor */
    public MHRAttendanceRecord (Properties ctx, ResultSet rs, String trxName) {
      super (ctx, rs, trxName);
    }
}
