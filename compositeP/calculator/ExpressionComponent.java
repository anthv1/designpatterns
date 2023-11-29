package calculator;

public interface ExpressionComponent {
    /**
     * This is the unified component interface.
     * Stores all operations that leaf and composite objects have in common.
     * 
     * TYPE-SAFETY:
     *      only child-related operation such as:
     *      addComponent(), removeComponent(), getChild()
     *      are stored in Composite class
     * Uniformity:
     *      all child-related operations inside COMPONENT class.
     * */ 
    public int compute();

    // If going for uniformity, un-comment below stubs

    // //add an object to composite component
    // public void add(Component c);
    
    // //remove an object to composite component
    // public void remove(Component c);
    
    // //find specified child
    // public Component getChild (int index);
}
