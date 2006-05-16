/* 
 *
 * created: 2006
 *
 * This file is part of Artemis
 *
 * Copyright (C) 2006  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package uk.ac.sanger.artemis.chado;

/**
 * Representation of featureprop table.
 */
public class ChadoFeatureProp
{
  
  public ChadoCvterm cvterm;
  public String value;
  public int rank;

  /**
   * Get the cv term
   * @return cvterm
   */
  public ChadoCvterm getCvterm()
  {
    return cvterm;
  }
  
  /**
   * Set the cv term
   * @param cvterm
   */
  public void setCvterm(ChadoCvterm cvterm)
  {
    this.cvterm = cvterm;
  }
  
  /**
   * Get the value of the property, represented as text.
   * @return the value of the property.
   */
  public String getValue()
  {
    return value;
  }
  
  /**
   * Set the value of the property, represented as text.
   * @param value the value of the property.
   */
  public void setValue(String value)
  {
    this.value = value;
  }
  
  /**
   * Any feature can have multiple values for any particular property type - 
   * these are ordered in a list using rank, counting from zero. For 
   * properties that are single-valued rather than multi-valued, the 
   * default 0 value should be used.
   * @return
   */
  public int getRank()
  {
    return rank;
  }

  /**
   * Any feature can have multiple values for any particular property type - 
   * these are ordered in a list using rank, counting from zero. For 
   * properties that are single-valued rather than multi-valued, the 
   * default 0 value should be used.
   * @param rank
   */
  public void setRank(int rank)
  {
    this.rank = rank;
  }
}