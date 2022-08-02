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
 * HR Attribute Model
 * @author Cristina Ghita, www.arhipac.ro
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1251">
 * 		@see FR [ 1251 ] Bad sort on get concept for payroll</a>
 *
 */
public class MHRAttribute extends org.eevolution.hr.model.MHRAttribute
{
	private static final long serialVersionUID = 3783311896401143394L;
	
	/**
	 * @param ctx
	 * @param HR_Attribute_ID
	 * @param trxName
	 */
	public MHRAttribute(Properties ctx, int HR_Attribute_ID, String trxName)
	{
		super(ctx, HR_Attribute_ID, trxName);
	}

	/**
	 * @param ctx
	 * @param rs
	 * @param trxName
	 */
	public MHRAttribute(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}
}
