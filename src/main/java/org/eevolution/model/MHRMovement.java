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
package org.eevolution.model;
import java.sql.ResultSet;
import java.util.Properties;

/**
 *	Payroll Concept for HRPayroll Module
 *	
 *  @author Oscar Gómez Islas
 *  @author Teo Sarca, www.arhipac.ro
 *  @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/771">
 * 		@see FR [ 771 ] method don't search completed process</a>
 */
public class MHRMovement extends org.eevolution.hr.model.MHRMovement
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9100478676337821603L;

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param movementId
	 *	@param trxName
	 */
	public MHRMovement (Properties ctx, int movementId, String trxName)
	{
		super (ctx, movementId, trxName);
	}

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName
	 */
	public MHRMovement (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}
}	//	HRMovement