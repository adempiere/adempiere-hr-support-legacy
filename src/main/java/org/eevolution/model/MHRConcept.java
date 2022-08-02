/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms either version 2 of the  License, 						  *
 * or (at your option) any later version.									  *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2016 e-Evolution,SC. All Rights Reserved.               *
 * Contributor(s): Victor Perez www.e-evolution.com                           *
 *****************************************************************************/
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Payroll Concept for HRayroll Module
 *
 * @author Oscar Gómez Islas
 * @author Cristina Ghita, www.arhipac.ro
 * @author victor.perez@e-evolution.com , www.e-Evolution.com
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1030">
 * 		@see FR [ 1030 ] Posting Error on payroll process</a>
 */
public class MHRConcept extends org.eevolution.hr.model.MHRConcept {
    /**
     *
     */
    private static final long serialVersionUID = 7859469065116713767L;

    /**
     * Standard Constructor
     *
     * @param ctx           context
     * @param HR_Concept_ID
     * @param trxName
     */
    public MHRConcept(Properties ctx, int HR_Concept_ID, String trxName) {
        super(ctx, HR_Concept_ID, trxName);
        if (HR_Concept_ID == 0) {
            setValue("");
            setName("");
            setDescription("");
            setIsEmployee(false);
            setIsPrinted(false);
            setHR_Payroll_ID(0);
            setHR_Job_ID(0);
            setHR_Department_ID(0);
        }
    }    //	HRConcept

    /**
     * Load Constructor
     *
     * @param ctx     context
     * @param rs      result set
     * @param trxName
     */
    public MHRConcept(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}    //	HRConcept