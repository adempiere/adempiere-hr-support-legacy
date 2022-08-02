/**
 * 
 */
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * HR Concept Category
 * 
 * @author Cristina Ghita, www.arhipac.ro
 */
public class MHRConceptCategory extends org.eevolution.hr.model.MHRConceptCategory
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8470029939291479283L;
	public MHRConceptCategory(Properties ctx, int HR_Concept_Category_ID, String trxName)
	{
		super(ctx, HR_Concept_Category_ID, trxName);
	}
	public MHRConceptCategory(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}
}
