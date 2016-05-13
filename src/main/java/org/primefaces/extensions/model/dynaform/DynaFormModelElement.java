package org.primefaces.extensions.model.dynaform;

/**
 * Class representing a nested model inside of <code>DynaFormRow</code>.
 *
 * @author  S�bastien Lepage / last modified by $Author$
 * @version $Revision$
 * @since   4.0.0
 */
public class DynaFormModelElement extends AbstractDynaFormElement {

	private DynaFormModel model;

	public DynaFormModelElement(DynaFormModel model, int colspan, int rowspan, int row, int column, boolean extended) {
		super(colspan, rowspan, row, column, extended);
		this.model = model;
	}

	public DynaFormModel getModel() {
		return model;
	}

}
