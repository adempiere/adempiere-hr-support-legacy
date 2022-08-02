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

/** Generated Model for HR_Incidence
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class MHRIncidence extends org.spin.tar.model.MHRIncidence {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5482079818284168239L;

	/** Standard Constructor */
    public MHRIncidence (Properties ctx, int HR_Incidence_ID, String trxName)
    {
      super (ctx, HR_Incidence_ID, trxName);
    }

    /** Load Constructor */
    public MHRIncidence (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }
}