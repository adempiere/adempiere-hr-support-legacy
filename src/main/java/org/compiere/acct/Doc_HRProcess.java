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

import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;
import org.eevolution.model.MHRProcess;


/**
 *  Post Payroll Documents.
 *  <pre>
 *  Table:              HR_Process (??)
 *  Document Types:     HR_Process
 *  </pre>
 *  @author Oscar Gomez Islas
 *  @author victor.perez@e-evolution.com,www.e-evolution.com
 *  @version  $Id: Doc_Payroll.java,v 1.1 2007/01/20 00:40:02 ogomezi Exp $
 *  @author Cristina Ghita, www.arhipac.ro
 *  @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1030">
 * 		@see FR [ 1030 ] Posting Error on payroll process</a>
 */
public class   Doc_HRProcess extends org.eevolution.hr.acct.Doc_HRProcess {
	public MHRProcess process = null;
	
	/** Process Payroll **/
	public static final String	DOCTYPE_Payroll			= "HRP";
	/**
	 *  Constructor
	 * 	@param ass accounting schema
	 * 	@param rs record
	 * 	@parem trxName trx
	 */
	public Doc_HRProcess (MAcctSchema[] ass, ResultSet rs, String trxName) {
		super(ass, rs, DOCTYPE_Payroll);
	}	//	Doc_Payroll
}   //  Doc_Payroll
