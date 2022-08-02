/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2008 SC ARHIPAC SERVICE SRL. All Rights Reserved.            *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author Cristina Ghita, www.arhipac.ro
 */
public class MHRDepartment extends org.eevolution.hr.model.MHRDepartment {
    /**
     *
     */
    private static final long serialVersionUID = 83878114891519775L;

    /**
     * Constructor Department
     * @param ctx
     * @param departmentId
     * @param trxName
     */
    public MHRDepartment(Properties ctx, int departmentId, String trxName) {
        super(ctx, departmentId, trxName);
    }

    /**
     * Constructor Department
     * @param ctx
     * @param rs
     * @param trxName
     */
    public MHRDepartment(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
