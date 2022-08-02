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
 * Copyright (C) 2003-2014 e-Evolution,SC. All Rights Reserved.               *
 * Contributor(s): Yamel Senih www.erpcya.com                                 *
 *****************************************************************************/

package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/963">
 * 		@see FR [ 963 ] Concept Salary don't have a reference on payroll</a>
 */
public class MHRContract extends org.eevolution.hr.model.MHRContract {
    /**
	 * 
	 */
	private static final long serialVersionUID = -389190817785883946L;

	public MHRContract(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }

    public MHRContract(Properties ctx, int HR_Degree_ID, String trxName) {
        super(ctx, HR_Degree_ID, trxName);
    }
}
