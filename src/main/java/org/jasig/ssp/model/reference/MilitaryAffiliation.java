package org.jasig.ssp.model.reference;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;

import org.jasig.ssp.model.Auditable;

/**
 * MilitaryAffiliation reference object.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MilitaryAffiliation
		extends AbstractReference
		implements Auditable {

	private static final long serialVersionUID = 20121004154040619L;

	/**
	 * Constructor
	 */
	public MilitaryAffiliation() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 *            Identifier; required
	 */

	public MilitaryAffiliation(@NotNull final UUID id) {
		super(id);
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 *            Identifier; required
	 * @param name
	 *            Name; required; max 80 characters
	 */

	public MilitaryAffiliation(@NotNull final UUID id, @NotNull final String name) {
		super(id, name);
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 *            Identifier; required
	 * @param name
	 *            Name; required; max 80 characters
	 * @param description
	 *            Description; max 64000 characters
	 */
	public MilitaryAffiliation(@NotNull final UUID id, @NotNull final String name,
			final String description) {
		super(id, name, description);
	}

	@Override
	protected int hashPrime() {
		return 353;
	}

	// default hashCode okay if no extra fields are added
}
