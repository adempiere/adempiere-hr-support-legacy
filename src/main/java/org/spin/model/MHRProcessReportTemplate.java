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
 * Copyright (C) 2003-2015 E.R.P. Consultores y Asociados, C.A.               *
 * All Rights Reserved.                                                       *
 * Contributor(s): Yamel Senih www.erpya.com                                  *
 *****************************************************************************/
package org.spin.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Process Report Template for Payroll Movements
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1558">
 * 		@see FR [ 1558 ] Add Payroll Process Report Template</a>
 *
 */
public class MHRProcessReportTemplate extends org.spin.pr.model.MHRProcessReportTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7984464436153212633L;

	public MHRProcessReportTemplate(Properties ctx, int HR_ProcessReportTemplate_ID, String trxName) {
		super(ctx, HR_ProcessReportTemplate_ID, trxName);
	}
	
	public MHRProcessReportTemplate(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}
