/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for HR_Leave
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class MHRLeave extends org.eevolution.hr.model.MHRLeave {

	/**
	 *
	 */
	private static final long serialVersionUID = 20180911L;
	
    /** Standard Constructor */
    public MHRLeave (Properties ctx, int HR_Leave_ID, String trxName)
    {
      super (ctx, HR_Leave_ID, trxName);
    }

    /** Load Constructor */
    public MHRLeave (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }
}