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
 * Copyright(C) Walking Tree Consultancy Services Pvt Ltd,All Rights Reserved *
 * Contributor(s):                                                            *
 *****************************************************************************/

package org.eevolution.model;

/**
 *
 * @Bug    @author         @CahngeID               @Description
 * 1628		Arunkumar      [20111208:1:52PM]        Added Code To Handle The Situation Of From Time And To Time
 * 													If   I logged In To The System At  Night 9:30
 *  												And The Log out Time Next Day Morning 5:30
 *  												To Handle This Situation We Have To Increment
 *  												Day Of The Month OF To Time to 1
 *
 * 						   [20111209:6:00PM]        We have To use Bigdecimal Instead Of integer , Because We Have
 * 													to deal with minits also
 * @author victor.perez@e-evolution.com, www.e-evolution.com
 * 			<li> Refactory and apply ADempiere Best Practice
 * @author Yamel Senih, ysenih@erpcya.com, ERPCyA http://www.erpcya.com
 *		<a href="https://github.com/adempiere/adempiere/issues/1870>
 * 		@see FR [ 187 ] Change hours from Work Shift</a>
 */
public class CalloutWorkShift extends org.eevolution.hr.controller.CalloutWorkShift {
	
}
