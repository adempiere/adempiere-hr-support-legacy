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
 * Contributor(s): Victor Perez www.e-evolution.com                           *
 *****************************************************************************/

package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Created by victor.perez@e-evolution.com,e-Evolution on 04/12/13.
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/854">
 * 		@see FR [ 854 ] Add new columns for Concept Attribute</a>
 */
public class MHRGrade extends org.eevolution.hr.model.MHRGrade {
    /**
	 * 
	 */
	private static final long serialVersionUID = 35499589044459660L;

	public MHRGrade(Properties ctx, int HR_Grade_ID, String trxName) {
        super(ctx, HR_Grade_ID, trxName);
    }

    public MHRGrade(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
