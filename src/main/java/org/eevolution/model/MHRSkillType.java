/**
 * Copyright (C) 2003-2017, e-Evolution Consultants S.A. , http://www.e-evolution.com
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 * Email: victor.perez@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
 * Created by victor.perez@e-evolution.com , www.e-evolution.com
 */


package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Created victor.perez@e-evolution.com, by e-Evolution on 04/12/13.
 */
public class MHRSkillType extends org.eevolution.hr.model.MHRSkillType {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6516605057703266045L;

    /**
     * Skill Type Constructor
     * @param ctx
     * @param skillTypeId
     * @param trxName
     */
    public MHRSkillType(Properties ctx, int skillTypeId, String trxName) {
        super(ctx, skillTypeId, trxName);
    }

    /**
     * Skill Type Constructor
     * @param ctx
     * @param rs
     * @param trxName
     */
    public MHRSkillType(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
