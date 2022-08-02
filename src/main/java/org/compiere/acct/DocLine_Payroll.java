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
 * Copyright (C) 2003-2007 e-Evolution,SC. All Rights Reserved.               *
 * Contributor(s): Victor Perez www.e-evolution.com                           *
 *****************************************************************************/
package org.compiere.acct;

import org.eevolution.hr.acct.Doc_HRProcess;

/**
 *  Payroll Line
 *
 *  @author Jorg Janke
 *  @version  $Id: DocLine_Payroll.java,v 1.4 2005/10/17 23:43:52 jjanke Exp $
 *  @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1030">
 * 		@see FR [ 1030 ] Posting Error on payroll process</a>
 */
public class DocLine_Payroll extends org.eevolution.hr.acct.DocLine_Payroll {

	public DocLine_Payroll(org.eevolution.hr.model.MHRMovement movement, Doc_HRProcess doc) {
		super(movement, doc);
		// TODO Auto-generated constructor stub
	}
}   //  DocLine_Payroll
